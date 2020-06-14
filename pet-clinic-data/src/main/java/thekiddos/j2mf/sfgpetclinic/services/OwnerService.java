package thekiddos.j2mf.sfgpetclinic.services;

import thekiddos.j2mf.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findByLastName();

    Owner findById( Long id );

    Owner save( Owner owner );

    Set<Owner> findAll();
}
