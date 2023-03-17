package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class NuomosTrasporto {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_transporto_priemone_id", nullable = false)
    private TransportoPriemone fkTransportoPriemone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_nuomos_sutartis_id", nullable = false)
    private NuomosSutartis fkNuomosSutartis;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public TransportoPriemone getFkTransportoPriemone() {
        return fkTransportoPriemone;
    }

    public void setFkTransportoPriemone(final TransportoPriemone fkTransportoPriemone) {
        this.fkTransportoPriemone = fkTransportoPriemone;
    }

    public NuomosSutartis getFkNuomosSutartis() {
        return fkNuomosSutartis;
    }

    public void setFkNuomosSutartis(final NuomosSutartis fkNuomosSutartis) {
        this.fkNuomosSutartis = fkNuomosSutartis;
    }

}
