package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestDataFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.UserForgotRequestFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.HttpConfig;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;

public class ForgotContentController {

	@FXML
	private TextField forEmail;

	@FXML
	void forBtnRecover(ActionEvent event) {
		if (forEmail.getLength() > 3) {
			RequestDataFactory userForgot = new UserForgotRequestFactory(forEmail.getText());
			RequestData data = userForgot.createRequest();
			String dataNew = StorageMisc.getInstance().getJsonConverter().toJson(data);

			HttpConfig.getInstance().getRequestInvoker().executeRequest("forgot", dataNew);
		}
	}

	@FXML
	void forLogin(ActionEvent event) {

	}

	@FXML
	void onExitClick(MouseEvent event) {

	}

}
