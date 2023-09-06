package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data;

public class NewRequest implements RequestData {
    private String carColor;
    private String carEngine;
    private String carEngineC;
    private String carFuel;
    private String carMaker;
    private String carModel;
    private String carRun;
    private String contractLenght;
    private String dayPrice;

    public NewRequest(String carColor, String carEngine, String carEngineC, String carFuel, String carMaker, String carModel, String carRun, String contractLenght, String dayPrice) {
        this.carColor = carColor;
        this.carEngine = carEngine;
        this.carEngineC = carEngineC;
        this.carFuel = carFuel;
        this.carMaker = carMaker;
        this.carModel = carModel;
        this.carRun = carRun;
        this.contractLenght = contractLenght;
        this.dayPrice = dayPrice;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarEngineC() {
        return carEngineC;
    }

    public void setCarEngineC(String carEngineC) {
        this.carEngineC = carEngineC;
    }

    public String getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(String carFuel) {
        this.carFuel = carFuel;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarRun() {
        return carRun;
    }

    public void setCarRun(String carRun) {
        this.carRun = carRun;
    }

    public String getContractLenght() {
        return contractLenght;
    }

    public void setContractLenght(String contractLenght) {
        this.contractLenght = contractLenght;
    }

    public String getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(String dayPrice) {
        this.dayPrice = dayPrice;
    }
}
