package thekiddos.j2mf.sfgpetclinic.services;

import thekiddos.j2mf.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById( Long id );

    Pet save( Pet pet );

    Set<Pet> findAll();
}
