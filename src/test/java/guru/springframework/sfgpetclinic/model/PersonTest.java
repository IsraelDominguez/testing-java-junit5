package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.*;

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
    void myRepeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("repite:" + repetitionInfo.getCurrentRepetition());

    }
}