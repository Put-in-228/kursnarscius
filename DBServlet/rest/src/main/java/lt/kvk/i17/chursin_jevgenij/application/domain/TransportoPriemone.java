package lt.kvk.i17.chursin_jevgenij.application.domain;

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
public class TransportoPriemone {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer run;

    @Column
    private String color;

    @Column
    private String fuel;

    @Column
    private Double engine;

    @Column
    private Integer engineC;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_model_id", nullable = false)
    private Model fkModel;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(final Integer run) {
        this.run = run;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(final String fuel) {
        this.fuel = fuel;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(final Double engine) {
        this.engine = engine;
    }

    public Integer getEngineC() {
        return engineC;
    }

    public void setEngineC(final Integer engineC) {
        this.engineC = engineC;
    }

    public Model getFkModel() {
        return fkModel;
    }

    public void setFkModel(final Model fkModel) {
        this.fkModel = fkModel;
    }

}
