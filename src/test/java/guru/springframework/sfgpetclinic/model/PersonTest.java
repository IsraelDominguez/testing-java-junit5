package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}