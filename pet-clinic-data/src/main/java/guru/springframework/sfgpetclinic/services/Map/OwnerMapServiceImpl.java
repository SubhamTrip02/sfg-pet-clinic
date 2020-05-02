package guru.springframework.sfgpetclinic.services.Map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerMapServiceImpl extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
       return super.save(owner,owner.getId());
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    void delete(Owner object) {
        super.delete(object);
    }
}
