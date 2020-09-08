package thekiddos.j2mf.sfgpetclinic.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import thekiddos.j2mf.sfgpetclinic.model.Owner;
import thekiddos.j2mf.sfgpetclinic.model.Vet;
import thekiddos.j2mf.sfgpetclinic.services.OwnerService;
import thekiddos.j2mf.sfgpetclinic.services.VetService;
import thekiddos.j2mf.sfgpetclinic.services.map.OwnerMapService;
import thekiddos.j2mf.sfgpetclinic.services.map.VetMapService;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run( String... args ) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId( 1L );
        owner1.setFirstName( "Die" );
        owner1.setLastName( "Hard" );

        ownerService.save( owner1 );

        Owner owner2 = new Owner();
        owner2.setId( 2L );
        owner2.setFirstName( "Live" );
        owner2.setLastName( "Easy" );

        ownerService.save( owner2 );

        log.info( "Loaded owners..." );

        Vet vet1 = new Vet();
        vet1.setId( 1L );
        vet1.setFirstName( "Duck" );
        vet1.setLastName( "Shark" );

        vetService.save( vet1 );

        Vet vet2 = new Vet();
        vet2.setId( 2L );
        vet2.setFirstName( "Dog" );
        vet2.setLastName( "Cat" );

        vetService.save( vet2 );

        log.info( "Loaded vets..." );
    }
}
