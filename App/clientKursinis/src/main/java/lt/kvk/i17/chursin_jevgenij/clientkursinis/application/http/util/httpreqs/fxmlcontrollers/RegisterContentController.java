package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.QuickResponseParser;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestDataFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.UserRegisterRequestFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.HttpConfig;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;
import org.apache.http.client.methods.CloseableHttpResponse;

public class RegisterContentController {

	@FXML
	private TextField regEmail;

	@FXML
	private TextField regLogin;

	@FXML
	private TextField regName;

	@FXML
	private PasswordField regPassword;

	@FXML
	private TextField regPhone;

	@FXML
	private TextField regSurname;

	@FXML
	void onExitClick(MouseEvent event) {

	}

	@FXML
	void regBtnRegister(ActionEvent event) {
		if (regEmail.getLength() > 3 && regLogin.getLength() > 3 && regName.getLength() > 3 && regSurname.getLength() > 3 && regPhone.getLength() > 3 && regPassword.getLength() > 3) {
			RequestDataFactory userRegister = new UserRegisterRequestFactory(regLogin.getText(), regEmail.getText(), regPassword.getText(), regName.getText(), regSurname.getText(), regPhone.getText());
			RequestData data = userRegister.createRequest();
			String dataNew = StorageMisc.getInstance().getJsonConverter().toJson(data);

			CloseableHttpResponse response = HttpConfig.getInstance().getRequestInvoker().executeRequest("register", dataNew);
			String id = QuickResponseParser.getResponse(response);
			if (id != null && Integer.parseInt(id) > 0) {
				HttpConfig.getInstance().setLocalUserID(id);
				MainController.getInstance().onLogin();
			}
		}
	}

	@FXML
	void regLogin(ActionEvent event) {

	}

}
