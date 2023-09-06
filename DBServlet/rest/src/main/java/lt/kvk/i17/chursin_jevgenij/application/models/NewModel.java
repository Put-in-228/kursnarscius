package lt.kvk.i17.chursin_jevgenij.application.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewModel {
    @JsonProperty("carColor")
    private String carColor;
    @JsonProperty("carEngine")
    private String carEngine;
    @JsonProperty("carEngineC")
    private String carEngineC;
    @JsonProperty("carFuel")
    private String carFuel;
    @JsonProperty("carMaker")
    private String carMaker;
    @JsonProperty("carModel")
    private String carModel;
    @JsonProperty("carRun")
    private String carRun;
    @JsonProperty("contractLenght")
    private String contractLenght;
    @JsonProperty("dayPrice")
    private String dayPrice;

    public String getCarColor() {
        return carColor;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public String getCarEngineC() {
        return carEngineC;
    }

    public String getCarFuel() {
        return carFuel;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarRun() {
        return carRun;
    }

    public String getContractLenght() {
        return contractLenght;
    }

    public String getDayPrice() {
        return dayPrice;
    }
}
