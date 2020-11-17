package thekiddos.j2mf.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.PetType;
import thekiddos.j2mf.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public PetType save( PetType entity ) {
        return super.save( entity );
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( PetType entity ) {
        super.delete( entity );
    }
}
