package thekiddos.j2mf.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Pet;
import thekiddos.j2mf.sfgpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Pet save( Pet entity ) {
        return super.save( entity );
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
