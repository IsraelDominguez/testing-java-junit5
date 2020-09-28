package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Model")
class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L, "Isra", "Dominguez");

        //then
        assertAll("Test all props",
                () -> assertEquals("Isra", person.getFirstName(), "first fail"),
                () -> assertEquals("Dominguez", person.getLastName(), "second fail")
        );
    }

    @RepeatedTest(value = 10, name = "{displayName}: {currentRepetition}")
    @Test
    void myRepeatedTest() {
        System.out.println("repiter");
    }
}