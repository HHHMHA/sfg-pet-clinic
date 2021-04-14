package thekiddos.j2mf.sfgpetclinic.services.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Pet;
import thekiddos.j2mf.sfgpetclinic.repositories.PetRepository;
import thekiddos.j2mf.sfgpetclinic.services.PetService;

import java.util.Set;
import java.util.HashSet;

@Service
@Profile( value = "jpa")
public class PetSDJpaService implements PetService {
    private final PetRepository petRepository;
    
    @Autowired
    public PetSDJpaService( PetRepository petRepository ) {
        this.petRepository = petRepository;
    }
    
    @Override
    Pet findById( Long id ) {
        return petRepository.findById( id ).orElse( null );
    }

    @Override
    Pet save( Pet pet ) {
        return petRepository.save( pet );
    }

    @Override
    Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        
        petRepository.findAll().forEach(pets:add);
        
        return pets;
    }

    @Override
    void delete( Pet pet ) {
        petRepository.delete( pet );
    }
    
    @Override
    void deleteById( Long id ) {
        petRepository.deleteById( id );
    }
}