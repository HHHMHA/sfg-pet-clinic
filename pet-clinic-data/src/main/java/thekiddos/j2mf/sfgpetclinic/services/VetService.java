package thekiddos.j2mf.sfgpetclinic.services;


import thekiddos.j2mf.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById( Long id );

    Vet save( Vet vet );

    Set<Vet> findAll();
}
