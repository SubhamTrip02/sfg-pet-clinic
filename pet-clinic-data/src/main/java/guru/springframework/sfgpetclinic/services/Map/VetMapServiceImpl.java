package guru.springframework.sfgpetclinic.services.Map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetMapServiceImpl extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet, vet.getId());
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    void delete(Vet object) {
        super.delete(object);
    }

}
