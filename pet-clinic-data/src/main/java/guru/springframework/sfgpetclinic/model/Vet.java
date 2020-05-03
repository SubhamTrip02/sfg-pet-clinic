package guru.springframework.sfgpetclinic.model;

/**
 * Created by jt on 7/13/18.
 */
public class Vet extends Person {
    public Vet(String firstName,String lastName) {
      //  super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }
}
