package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data;

public class NewRequestFactory implements RequestDataFactory {

    private String carColor;
    private String carEngine;
    private String carEngineC;
    private String carFuel;
    private String carMaker;
    private String carModel;
    private String carRun;
    private String contractLenght;
    private String dayPrice;

    public NewRequestFactory(String carColor, String carEngine, String carEngineC, String carFuel, String carMaker, String carModel, String carRun, String contractLenght, String dayPrice) {
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

    @Override
    public RequestData createRequest() {
        return new NewRequest(carColor, carEngine, carEngineC, carFuel, carMaker, carModel, carRun, contractLenght, dayPrice);
    }
}
