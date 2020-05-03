package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private VetService vetService;


    @Autowired
    private OwnerService ownerService;

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner(1L,"john","thomson");
        Owner owner2=new Owner(2L,"jack","thomson");
        Owner owner3=new Owner(3L,"jinni","thomson");
        Owner owner4=new Owner(4L,"jay","tyson");
        Owner owner5=new Owner(5L,"jason","thomson");

        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        ownerService.save(owner4);
        ownerService.save(owner5);

        System.out.println("Loaded Owners....");


        Vet vet1=new Vet(1L,"sam","colling");
        Vet vet2=new Vet(2L,"sunny","colling");
        Vet vet3=new Vet(3L,"sover","colling");
        Vet vet4=new Vet(41L,"saddy","colling");
        Vet vet5=new Vet(5L,"slim","shady");

        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);
        vetService.save(vet4);
        vetService.save(vet5);

        System.out.println("VEts loaded......");





    }
}
