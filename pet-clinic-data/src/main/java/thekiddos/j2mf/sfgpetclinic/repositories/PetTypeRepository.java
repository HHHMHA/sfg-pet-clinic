package thekiddos.j2mf.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import thekiddos.j2mf.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
