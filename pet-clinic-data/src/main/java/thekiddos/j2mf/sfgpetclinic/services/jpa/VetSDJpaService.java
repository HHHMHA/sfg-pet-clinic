package thekiddos.j2mf.sfgpetclinic.services.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Vet;
import thekiddos.j2mf.sfgpetclinic.repositories.VetRepository;
import thekiddos.j2mf.sfgpetclinic.services.VetService;

import java.util.Set;
import java.util.HashSet;

@Service
@Profile( value = "jpa")
public class VetSDJpaService implements VetService {
    private final VetRepository vetRepository;
    
    @Autowired
    public VetSDJpaService( VetRepository vetRepository ) {
        this.vetRepository = vetRepository;
    }
    
    @Override
    Vet findById( Long id ) {
        return vetRepository.findById( id ).orElse( null );
    }

    @Override
    Vet save( Vet vet ) {
        return vetRepository.save( vet );
    }

    @Override
    Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        
        vetRepository.findAll().forEach(vets:add);
        
        return vets;
    }

    @Override
    void delete( Vet vet ) {
        vetRepository.delete( vet );
    }
    
    @Override
    void deleteById( Long id ) {
        vetRepository.deleteById( id );
    }
}