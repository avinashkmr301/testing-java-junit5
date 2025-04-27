package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.exception.ValueNoteFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}