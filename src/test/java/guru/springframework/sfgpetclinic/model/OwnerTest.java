package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Model")
class OwnerTest {

    @Test
    void dependantAssertions() {
        Owner owner = new Owner(1l, "Isra", "Dominguez");
        owner.setCity("Rivas");
        owner.setTelephone("737373");

        assertAll("All Properties",
                () -> assertEquals("Isra", owner.getFirstName()),
                () -> assertEquals("Dominguez", owner.getLastName()),
                () -> assertAll("Extra Properties",
                        () -> assertEquals("Rivas", owner.getCity())
                )
        );

        assertTrue(owner instanceof Owner);
    }

}