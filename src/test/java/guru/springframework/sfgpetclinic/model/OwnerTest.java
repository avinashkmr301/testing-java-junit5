package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions(){

        //given
        Owner owner = new Owner(101L,"Steve","Doe");
        owner.setCity("Patna");
        owner.setTelephone("2211221122");

        //then
        assertAll("Properties Test",
                ()-> assertAll("Person properties",
                        ()->assertEquals("Steve",owner.getFirstName()),
                        ()->assertEquals("Doe",owner.getLastName())),
                ()-> assertAll("Owner properties",
                        ()->assertEquals("Patna",owner.getCity()),
                        ()->assertEquals("2211221122",owner.getTelephone()))
    );

        //using hamcrest
        assertThat(owner.getCity(),is("Patna"));

    }

}