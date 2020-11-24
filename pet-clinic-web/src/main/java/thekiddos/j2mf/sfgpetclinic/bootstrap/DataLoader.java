package thekiddos.j2mf.sfgpetclinic.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import thekiddos.j2mf.sfgpetclinic.model.*;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;
import thekiddos.j2mf.sfgpetclinic.services.PetTypeService;
import thekiddos.j2mf.sfgpetclinic.services.SpecialitiesService;
import thekiddos.j2mf.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;

    @Autowired
    public DataLoader( OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService ) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run( String... args ) throws Exception {
        if ( databaseEmpty() )
            loadData();
    }

    private boolean databaseEmpty() {
        return petTypeService.findAll().size() == 0;
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName( "Dog" );
        dog = petTypeService.save( dog );

        PetType cat = new PetType();
        cat.setName( "Cat" );
        cat = petTypeService.save( cat );

        Owner owner1 = new Owner();
        owner1.setFirstName( "Die" );
        owner1.setLastName( "Hard" );
        owner1.setAddress( "123" );
        owner1.setCity( "Batata" );
        owner1.setTelephone( "123456789" ); // TODO: validate later

        Pet pet1 = new Pet();
        pet1.setName( "Barker" );
        pet1.setPetType( dog );
        pet1.setOwner( owner1 );
        pet1.setDateOfBirth( LocalDate.now() );

        ownerService.save( owner1 );

        Owner owner2 = new Owner();
        owner2.setFirstName( "Live" );
        owner2.setLastName( "Easy" );
        owner2.setAddress( "123" );
        owner2.setCity( "Batata" );
        owner2.setTelephone( "123456789" ); // TODO: validate later

        Pet pet2 = new Pet();
        pet2.setName( "Barker" );
        pet2.setPetType( cat );
        pet2.setOwner( owner2 );
        pet2.setDateOfBirth( LocalDate.now() );

        ownerService.save( owner2 );

        log.info( "Loaded owners..." );

        Speciality speciality1 = new Speciality();
        speciality1.setDescription( "Batata" );
        speciality1 = specialitiesService.save( speciality1 );

        Vet vet1 = new Vet();
        vet1.setFirstName( "Duck" );
        vet1.setLastName( "Shark" );
        vet1.getSpecialities().add( speciality1 );

        vetService.save( vet1 );

        Speciality speciality2 = new Speciality();
        speciality2.setDescription( "Fries" );
        speciality2 = specialitiesService.save( speciality2 );

        Vet vet2 = new Vet();
        vet2.setFirstName( "Dog" );
        vet2.setLastName( "Cat" );
        vet2.getSpecialities().add( speciality2 );

        vetService.save( vet2 );

        log.info( "Loaded vets..." );
    }
}
