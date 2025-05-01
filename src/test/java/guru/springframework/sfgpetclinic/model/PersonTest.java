package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTest {

    @Test
    void groupedAssertions(){
        //given
        Person person = new Person(121L,"John","Sinha");
        //then
        assertAll("Test props set",
                ()-> assertEquals("John", person.getFirstName()),
                ()-> assertEquals("Sinha", person.getLastName()));
    }

    @Test
    void groupedAssertionMsgs(){
        //given
        Person person = new Person(121L,"John","Sinha");
        //then
        assertAll("Test props set",
                ()-> assertEquals("John", person.getFirstName(),"First name not matching"),
                ()-> assertEquals("Sinha", person.getLastName(),"Last name not matching"));
    }

}