package thekiddos.j2mf.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import thekiddos.j2mf.sfgpetclinic.model.Owner;
import thekiddos.j2mf.sfgpetclinic.model.Pet;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;
import thekiddos.j2mf.sfgpetclinic.services.PetService;
import thekiddos.j2mf.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService( PetTypeService petTypeService, PetService petService ) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findById( Long id ) {
        return super.findById( id );
    }

    @Override
    public Owner save( Owner entity ) {
        if ( entity.getPets() != null ) {
            entity.getPets().forEach( pet -> {
                if ( pet.getPetType() != null ) {
                    if ( pet.getPetType().getId() == null )
                        pet.setPetType( petTypeService.save( pet.getPetType() ) );
                }
                else {
                    throw new RuntimeException( "Pet Type is required" );
                }

                if ( pet.getId() == null ) {
                    Pet savedPet = petService.save( pet );
                    pet.setId( savedPet.getId() );
                }

            });
        }

        return super.save( entity );
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById( Long id ) {
        super.deleteById( id );
    }

    @Override
    public void delete( Owner entity ) {
        super.delete( entity );
    }

    @Override
    public Set<Owner> findByLastName() {
        return null;
    }
}
