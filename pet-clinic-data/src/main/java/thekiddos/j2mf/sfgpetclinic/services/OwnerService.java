package thekiddos.j2mf.sfgpetclinic.services;

import thekiddos.j2mf.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Set<Owner> findByLastName( String name );
}
