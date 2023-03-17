package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class Vartotojas {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String login;

    @Column
    private String password;

    @OneToMany(mappedBy = "fkVartotojas")
    private Set<IsdavimoSutartis> fkVartotojasIsdavimoSutartiss;

    @OneToMany(mappedBy = "fkVartotojas")
    private Set<NuomosSutartis> fkVartotojasNuomosSutartiss;

    @OneToMany(mappedBy = "fkVartotojas")
    private Set<TransportoPazeidimai> fkVartotojasTransportoPazeidimais;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Set<IsdavimoSutartis> getFkVartotojasIsdavimoSutartiss() {
        return fkVartotojasIsdavimoSutartiss;
    }

    public void setFkVartotojasIsdavimoSutartiss(
            final Set<IsdavimoSutartis> fkVartotojasIsdavimoSutartiss) {
        this.fkVartotojasIsdavimoSutartiss = fkVartotojasIsdavimoSutartiss;
    }

    public Set<NuomosSutartis> getFkVartotojasNuomosSutartiss() {
        return fkVartotojasNuomosSutartiss;
    }

    public void setFkVartotojasNuomosSutartiss(
            final Set<NuomosSutartis> fkVartotojasNuomosSutartiss) {
        this.fkVartotojasNuomosSutartiss = fkVartotojasNuomosSutartiss;
    }

    public Set<TransportoPazeidimai> getFkVartotojasTransportoPazeidimais() {
        return fkVartotojasTransportoPazeidimais;
    }

    public void setFkVartotojasTransportoPazeidimais(
            final Set<TransportoPazeidimai> fkVartotojasTransportoPazeidimais) {
        this.fkVartotojasTransportoPazeidimais = fkVartotojasTransportoPazeidimais;
    }

}
