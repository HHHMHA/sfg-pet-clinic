package thekiddos.j2mf.sfgpetclinic.services.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Owner;
import thekiddos.j2mf.sfgpetclinic.repositories.OwnerRepository;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile( value = "jpa")
public class OwnerJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerJpaService( OwnerRepository ownerRepository ) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findByLastName( String name ) {
        return ownerRepository.findByLastName( name );
    }

    @Override
    public Owner findById( Long id ) {
        return ownerRepository.findById( id ).orElse( null );
    }

    @Override
    public Owner save( Owner entity ) {
        return ownerRepository.save( entity );
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach( owners::add );
        return owners;
    }

    @Override
    public void delete( Owner entity ) {
        ownerRepository.delete( entity );
    }

    @Override
    public void deleteById( Long id ) {
        ownerRepository.deleteById( id );
    }
}
