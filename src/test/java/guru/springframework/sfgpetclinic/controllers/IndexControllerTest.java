package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.exception.ValueNoteFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController indexController;
    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    @DisplayName("Test proper view name returned for the index")
    void index() {
        assertEquals("index",indexController.index());
        assertEquals("index",indexController.index(),"Wrong view returned");
        assertEquals("index",indexController.index(),()->"Another expensive message " +
                "Make me only if you have to");

        // help of assertj-core ======= use this or above one
        assertThat(indexController.index()).isEqualTo("index");
    }

    @Test
    @DisplayName("Test Exception")
    void oupsHandler() {
        assertThrows(ValueNoteFoundException.class, ()->{
                    indexController.oupsHandler();
                });

        /*assertTrue("notimplemented".equals(indexController.oupsHandler()), ()->"This is some expensive "+
                "Message to build "+
                "for my test");*/
    }

    @Test
    @Disabled("Demo of Timeout")
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), ()->{
            Thread.sleep(5000);
            System.out.println("I got here");
        });
    }

    @Test
    @Disabled("Demo of Timeout")
    void testTimeoutPrempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100),()->{
            Thread.sleep(5000);
            System.out.println("I got here 2223232");
        });
    }
}