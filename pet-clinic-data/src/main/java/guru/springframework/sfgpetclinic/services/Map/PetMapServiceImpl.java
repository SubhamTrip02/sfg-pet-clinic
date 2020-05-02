package guru.springframework.sfgpetclinic.services.Map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetMapServiceImpl extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet,pet.getId());
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    void delete(Pet object) {
        super.delete(object);
    }

}
