package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.*;

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

    @RepeatedTest(value = 10, name = "{displayName}: {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest(){
        //todo-impl
    }


    //Dependency injection
    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName() + " : " + repetitionInfo.getCurrentRepetition());
    }
}