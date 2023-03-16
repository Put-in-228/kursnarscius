package lt.kvk.i17.chursin_jevgenij.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transporto_priemone")
public class Transportas {
    @Id
    private int run;
    private String color;
    private String fuel;
    private float engine;
    private int engine_c;
    private int fk_Model;

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public int getEngine_c() {
        return engine_c;
    }

    public void setEngine_c(int engine_c) {
        this.engine_c = engine_c;
    }

    public int getFk_Model() {
        return fk_Model;
    }

    public void setFk_Model(int fk_Model) {
        this.fk_Model = fk_Model;
    }
}
