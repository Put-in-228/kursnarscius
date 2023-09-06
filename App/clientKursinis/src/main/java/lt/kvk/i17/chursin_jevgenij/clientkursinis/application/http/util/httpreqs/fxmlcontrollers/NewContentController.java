package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.NewRequestFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestDataFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.HttpConfig;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;
import org.apache.http.client.methods.CloseableHttpResponse;

public class NewContentController {

    @FXML
    private TextField carColor;

    @FXML
    private TextField carEngine;

    @FXML
    private TextField carEngineC;

    @FXML
    private TextField carFuel;

    @FXML
    private TextField carMaker;

    @FXML
    private TextField carModel;

    @FXML
    private TextField carRun;

    @FXML
    private TextField contractLenght;

    @FXML
    private TextField dayPrice;

    @FXML
    void carRegister(ActionEvent event) {
        RequestDataFactory newCar = new NewRequestFactory(carColor.getText(), carEngine.getText(), carEngineC.getText(), carFuel.getText(), carMaker.getText(), carModel.getText(), carRun.getText(), contractLenght.getText(), dayPrice.getText());
        RequestData data = newCar.createRequest();
        String dataNew = StorageMisc.getInstance().getJsonConverter().toJson(data);

        CloseableHttpResponse response = HttpConfig.getInstance().getRequestInvoker().executeRequest("new", dataNew);
    }

}
