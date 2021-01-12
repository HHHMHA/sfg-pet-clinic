package thekiddos.j2mf.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thekiddos.j2mf.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
