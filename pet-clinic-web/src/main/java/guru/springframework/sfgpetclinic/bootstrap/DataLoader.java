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

        Owner owner1=new Owner("john","thomson");
        Owner owner2=new Owner("jack","thomson");
        Owner owner3=new Owner("jinni","thomson");
        Owner owner4=new Owner("jay","tyson");
        Owner owner5=new Owner("jason","thomson");

        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        ownerService.save(owner4);
        ownerService.save(owner5);

        System.out.println("Loaded Owners....");


        Vet vet1=new Vet("sam","colling");
        Vet vet2=new Vet("sunny","colling");
        Vet vet3=new Vet("sover","colling");
        Vet vet4=new Vet("saddy","colling");
        Vet vet5=new Vet("slim","shady");

        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);
        vetService.save(vet4);
        vetService.save(vet5);

        System.out.println("VEts loaded......");





    }
}
