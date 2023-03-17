package lt.kvk.i17.chursin_jevgenij.application.repository;

import lt.kvk.i17.chursin_jevgenij.application.domain.IsdavimoSutartis;
import lt.kvk.i17.chursin_jevgenij.application.domain.Vartotojas;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VartotojasRepositoryTest {

    @Autowired
    private VartotojasRepository vartotojasRepository;

    //@Test
    void saveMethod() {
        //create Entity
        Vartotojas vartotojas = new Vartotojas();
        vartotojas.setName("Jevgenij");
        vartotojas.setSurname("Chursin");
        vartotojas.setLogin("augis151");
        vartotojas.setPassword("test123");
        //save Entity
        Vartotojas savedEntity = vartotojasRepository.save(vartotojas);
        //display Entity info
        System.out.println(savedEntity.toString());
    }

    @Test
    void updateUsingSaveMethod() {
        //find and retrieve Entity
        Vartotojas vartotojas = vartotojasRepository.findById(1).get();
        //update Entity info
        vartotojas.setPassword("testastestas");
        //save Updated Entity
        Vartotojas updatedEntity = vartotojasRepository.save(vartotojas);
        System.out.println(updatedEntity.toString());
    }
}