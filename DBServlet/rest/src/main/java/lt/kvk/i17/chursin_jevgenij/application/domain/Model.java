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
import java.util.Set;


@Entity
public class Model {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_manufacturer_id", nullable = false)
    private Manufacturer fkManufacturer;

    @OneToMany(mappedBy = "fkModel")
    private Set<TransportoPriemone> fkModelTransportoPriemones;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(final Integer year) {
        this.year = year;
    }

    public Manufacturer getFkManufacturer() {
        return fkManufacturer;
    }

    public void setFkManufacturer(final Manufacturer fkManufacturer) {
        this.fkManufacturer = fkManufacturer;
    }

    public Set<TransportoPriemone> getFkModelTransportoPriemones() {
        return fkModelTransportoPriemones;
    }

    public void setFkModelTransportoPriemones(
            final Set<TransportoPriemone> fkModelTransportoPriemones) {
        this.fkModelTransportoPriemones = fkModelTransportoPriemones;
    }

}
