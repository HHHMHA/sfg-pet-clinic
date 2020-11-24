package thekiddos.j2mf.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Speciality;
import thekiddos.j2mf.sfgpetclinic.model.Vet;
import thekiddos.j2mf.sfgpetclinic.services.SpecialitiesService;
import thekiddos.j2mf.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    private SpecialitiesService specialitiesService;

    public VetMapService( SpecialitiesService specialitiesService ) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Vet findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Vet save( Vet entity ) {
        if ( entity.getSpecialities().size() > 0 ) {
            entity.getSpecialities().forEach( speciality -> {
                if ( speciality.getId() == null ) {
                    Speciality savedSpeciality = specialitiesService.save( speciality );
                    speciality.setId( savedSpeciality.getId() );
                }
            } );
        }
        return super.save( entity );
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( Vet entity ) {
        super.delete( entity );
    }
}
