package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;


@Entity
public class IsdavimoSutartis {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDate start;

    @Column
    private LocalDate end;

    @Column
    private String link;

    @Column
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vartotojas_id", nullable = false)
    private Vartotojas fkVartotojas;

    @OneToMany(mappedBy = "fkIsdavimoSutartis")
    private Set<IsdavimoTransporto> fkIsdavimoSutartisIsdavimoTransportos;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(final LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(final LocalDate end) {
        this.end = end;
    }

    public String getLink() {
        return link;
    }

    public void setLink(final String link) {
        this.link = link;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public Vartotojas getFkVartotojas() {
        return fkVartotojas;
    }

    public void setFkVartotojas(final Vartotojas fkVartotojas) {
        this.fkVartotojas = fkVartotojas;
    }

    public Set<IsdavimoTransporto> getFkIsdavimoSutartisIsdavimoTransportos() {
        return fkIsdavimoSutartisIsdavimoTransportos;
    }

    public void setFkIsdavimoSutartisIsdavimoTransportos(
            final Set<IsdavimoTransporto> fkIsdavimoSutartisIsdavimoTransportos) {
        this.fkIsdavimoSutartisIsdavimoTransportos = fkIsdavimoSutartisIsdavimoTransportos;
    }

}
