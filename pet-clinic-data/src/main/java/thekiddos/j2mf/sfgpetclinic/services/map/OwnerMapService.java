package thekiddos.j2mf.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Owner;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Owner save( Owner entity ) {
        return super.save( entity.getId(), entity );
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( Owner entity ) {
        super.delete( entity );
    }

    @Override
    public Set<Owner> findByLastName() {
        return null;
    }
}
