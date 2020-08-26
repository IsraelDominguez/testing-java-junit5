package guru.springframework.sfgpetclinic.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.assertj.core.api.Assertions.*;

@Tag("Controllers")
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

        assertThat(controller.index()).isEqualTo("index");
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

    @Test
    void testAssumptionTrue() {
        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionTrueIsTrue() {
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMac() {
        System.out.println("On MAC");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnWin() {
        System.out.println("On windows");
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testJava11() {
        System.out.println("Java 11 installed");
    }
}