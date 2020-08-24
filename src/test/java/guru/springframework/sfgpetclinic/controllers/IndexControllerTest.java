package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController controller;

    @BeforeEach
    void setUp() {
        controller  = new IndexController();
    }

    @DisplayName(value = "Index Page Controller")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertNotEquals("indexs", controller.index(), "Not pass");
    }

    @DisplayName(value = "Test Raise Exception")
    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equalsIgnoreCase(controller.oupsHandler()), () -> "This is expensive");
    }

    @Test
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class, () -> controller.oopsHandler());
    }
}