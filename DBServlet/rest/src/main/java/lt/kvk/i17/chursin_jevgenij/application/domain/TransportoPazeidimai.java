package lt.kvk.i17.chursin_jevgenij.application.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
public class TransportoPazeidimai {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDate date;

    @Column
    private String damage;

    @Column
    private String link;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_transporto_priemone_id", nullable = false)
    private TransportoPriemone fkTransportoPriemone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_vartotojas_id", nullable = false)
    private Vartotojas fkVartotojas;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(final String damage) {
        this.damage = damage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(final String link) {
        this.link = link;
    }

    public TransportoPriemone getFkTransportoPriemone() {
        return fkTransportoPriemone;
    }

    public void setFkTransportoPriemone(final TransportoPriemone fkTransportoPriemone) {
        this.fkTransportoPriemone = fkTransportoPriemone;
    }

    public Vartotojas getFkVartotojas() {
        return fkVartotojas;
    }

    public void setFkVartotojas(final Vartotojas fkVartotojas) {
        this.fkVartotojas = fkVartotojas;
    }

}
