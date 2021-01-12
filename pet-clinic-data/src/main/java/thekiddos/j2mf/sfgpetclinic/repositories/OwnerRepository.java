package thekiddos.j2mf.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thekiddos.j2mf.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Set<Owner> findByLastName( String name );
}
