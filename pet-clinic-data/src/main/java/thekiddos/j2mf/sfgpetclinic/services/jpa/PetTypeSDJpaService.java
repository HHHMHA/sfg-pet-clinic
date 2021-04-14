package thekiddos.j2mf.sfgpetclinic.services.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.PetType;
import thekiddos.j2mf.sfgpetclinic.repositories.PetTypeRepository;
import thekiddos.j2mf.sfgpetclinic.services.PetTypeService;

import java.util.Set;
import java.util.HashSet;

@Service
@Profile( value = "jpa")
public class PetTypeSDJpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;
    
    @Autowired
    public PetTypeSDJpaService( PetTypeRepository petTypeRepository ) {
        this.petTypeRepository = petTypeRepository;
    }
    
    @Override
    PetType findById( Long id ) {
        return petTypeRepository.findById( id ).orElse( null );
    }

    @Override
    PetType save( PetType petType ) {
        return petTypeRepository.save( petType );
    }

    @Override
    Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        
        petTypeRepository.findAll().forEach(petTypes:add);
        
        return petTypes;
    }

    @Override
    void delete( PetType petType ) {
        petTypeRepository.delete( petType );
    }
    
    @Override
    void deleteById( Long id ) {
        petTypeRepository.deleteById( id );
    }
}