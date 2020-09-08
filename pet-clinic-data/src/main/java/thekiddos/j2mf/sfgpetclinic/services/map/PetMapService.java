package thekiddos.j2mf.sfgpetclinic.services.map;

import thekiddos.j2mf.sfgpetclinic.model.Pet;
import thekiddos.j2mf.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Pet save( Pet entity ) {
        return super.save( entity.getId(), entity );
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( Pet entity ) {
        super.delete( entity );
    }
}
