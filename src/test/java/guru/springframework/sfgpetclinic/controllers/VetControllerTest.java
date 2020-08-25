package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ModelMapImpl;
import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VetControllerTest {
    VetService vetService;
    VetController vetController;

    @BeforeEach
    void setUp() {
        vetService = new VetMapService(new SpecialityMapService());
        vetController = new VetController(vetService);

        Vet vet1 = new Vet(1L, "isra", "dominguez", null);
        Vet vet2 = new Vet(2L, "luis", "dominguez", null);

        vetService.save(vet1);
        vetService.save(vet2);
    }

    @Test
    void listVets() {
        Model model = new ModelMapImpl();
        String view = vetController.listVets(model);

        assertEquals("vets/index", view);
        Set modelAttribute = (Set) ((ModelMapImpl) model).getMap().get("vets");
        assertEquals(2, modelAttribute.size());
    }
}