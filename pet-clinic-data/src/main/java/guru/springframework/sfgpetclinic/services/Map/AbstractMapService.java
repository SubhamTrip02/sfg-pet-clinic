package guru.springframework.sfgpetclinic.services.Map;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.model.Owner;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long>  {

    Map<Long,T> map=new HashMap<>();

    Set<T> findAll(){       //notice how we are returning hashset not hashmap
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

   T save(T object){

        if(object!=null)
        {
            if(object.getId()==null)
            {
                object.setId(getNextId());
            }
            map.put( object.getId(),object);
        }
        else{
            throw new RuntimeException("no object can be null");
        }



       return object;
   }

     Long getNextId()
     {
         Long nid=null;


         try {
             nid= Collections.max(map.keySet());
             nid+=1;
         }catch (NoSuchElementException e){
            nid=1L;
         }
         return nid;
     }

    void deleteById(ID id)
    {
    map.remove(id);
    }

   void  delete(T object){
    map.entrySet().removeIf(entry-> entry.getValue().equals(object));  //notice the use of predicate here
    }

}
