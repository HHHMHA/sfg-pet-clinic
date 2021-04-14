package thekiddos.j2mf.sfgpetclinic.services.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Specialty;
import thekiddos.j2mf.sfgpetclinic.repositories.SpecialtyRepository;
import thekiddos.j2mf.sfgpetclinic.services.SpecialtyService;

import java.util.Set;
import java.util.HashSet;

@Service
@Profile( value = "jpa")
public class SpecialtySDJpaService implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;
    
    @Autowired
    public SpecialtySDJpaService( SpecialtyRepository specialtyRepository ) {
        this.specialtyRepository = specialtyRepository;
    }
    
    @Override
    Specialty findById( Long id ) {
        return specialtyRepository.findById( id ).orElse( null );
    }

    @Override
    Specialty save( Specialty specialty ) {
        return specialtyRepository.save( specialty );
    }

    @Override
    Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        
        specialtyRepository.findAll().forEach(specialties:add);
        
        return specialties;
    }

    @Override
    void delete( Specialty specialty ) {
        specialtyRepository.delete( specialty );
    }
    
    @Override
    void deleteById( Long id ) {
        specialtyRepository.deleteById( id );
    }
}