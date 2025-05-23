package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTest {

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


    @DisplayName("value source test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings ={"Spring","java","hibernate"})
    void valurSourceTest(String val) {

        System.out.println(val);
    }

    @DisplayName("value source test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @EnumSource(OwnerType.class)
    void enumTest(OwnerType ownerType) {
        System.out.println(ownerType);
    }
}