package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface CrudService <T,ID>{        //making our own CrudRepository implementation

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

}
