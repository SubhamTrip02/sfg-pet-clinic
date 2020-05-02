package guru.springframework.sfgpetclinic.services.Map;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID>  {

    Map<ID,T> map=new HashMap<>();

    Set<T> findAll(){       //notice how we are returning hashset not hashmap
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

   T save(T object, ID id){
        map.put(id,object);
       return object;
   }

    void deleteById(ID id)
    {
    map.remove(id);
    }

   void  delete(T object){
    map.entrySet().removeIf(entry-> entry.getValue().equals(object));  //notice the use of predicate here
    }

}
