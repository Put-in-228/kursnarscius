package lt.kvk.i17.chursin_jevgenij.application.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class IsdavimoTransporto {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_isdavimo_sutartis_id", nullable = false)
    private IsdavimoSutartis fkIsdavimoSutartis;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_transporto_priemone_id", nullable = false)
    private TransportoPriemone fkTransportoPriemone;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public IsdavimoSutartis getFkIsdavimoSutartis() {
        return fkIsdavimoSutartis;
    }

    public void setFkIsdavimoSutartis(final IsdavimoSutartis fkIsdavimoSutartis) {
        this.fkIsdavimoSutartis = fkIsdavimoSutartis;
    }

    public TransportoPriemone getFkTransportoPriemone() {
        return fkTransportoPriemone;
    }

    public void setFkTransportoPriemone(final TransportoPriemone fkTransportoPriemone) {
        this.fkTransportoPriemone = fkTransportoPriemone;
    }

}
