package lt.kvk.i17.chursin_jevgenij.application.service;

import lt.kvk.i17.chursin_jevgenij.application.domain.Vartotojas;
import lt.kvk.i17.chursin_jevgenij.application.models.RegisterModel;
import lt.kvk.i17.chursin_jevgenij.application.repository.VartotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VartotojasService {
    private final VartotojasRepository vartotojas;

    @Autowired
    public VartotojasService(VartotojasRepository vartotojas) {
        this.vartotojas = vartotojas;
    }

    public Vartotojas saveToDatabase(RegisterModel data){
        List<Vartotojas> domainObjects = mapData(data);
        System.out.println("Before saving objects to db");
        vartotojas.saveAll(domainObjects);
        System.out.println("After saving objects to db");
        return domainObjects.get(0);
    }

    public Vartotojas findByUsername(String username) {
        System.out.println(username);
        return vartotojas.findByLogin(username);
    }

    private List<Vartotojas> mapData(RegisterModel data) {
        List<Vartotojas> tempDomains = new ArrayList<>();
        Vartotojas temp = new Vartotojas();
        temp.setLogin(data.getUsername());
        temp.setPassword(data.getPassword());
        temp.setName(data.getName());
        temp.setSurname(data.getSurname());
        tempDomains.add(temp);

        return tempDomains;
    }
}
