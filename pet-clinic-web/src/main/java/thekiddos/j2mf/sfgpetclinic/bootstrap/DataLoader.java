package thekiddos.j2mf.sfgpetclinic.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import thekiddos.j2mf.sfgpetclinic.model.Owner;
import thekiddos.j2mf.sfgpetclinic.model.Vet;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;
import thekiddos.j2mf.sfgpetclinic.services.VetService;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader( OwnerService ownerService, VetService vetService ) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run( String... args ) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName( "Die" );
        owner1.setLastName( "Hard" );

        ownerService.save( owner1 );

        Owner owner2 = new Owner();
        owner2.setFirstName( "Live" );
        owner2.setLastName( "Easy" );

        ownerService.save( owner2 );

        log.info( "Loaded owners..." );

        Vet vet1 = new Vet();
        vet1.setFirstName( "Duck" );
        vet1.setLastName( "Shark" );

        vetService.save( vet1 );

        Vet vet2 = new Vet();
        vet2.setFirstName( "Dog" );
        vet2.setLastName( "Cat" );

        vetService.save( vet2 );

        log.info( "Loaded vets..." );
    }
}
