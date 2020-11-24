package thekiddos.j2mf.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Speciality;
import thekiddos.j2mf.sfgpetclinic.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Speciality findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Speciality save( Speciality entity ) {
        return super.save( entity );
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( Speciality entity ) {
        super.delete( entity );
    }
}
