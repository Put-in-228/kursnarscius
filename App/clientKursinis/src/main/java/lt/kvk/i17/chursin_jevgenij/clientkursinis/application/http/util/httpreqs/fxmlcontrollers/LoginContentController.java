package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.QuickResponseParser;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.RequestData;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data.UserLoginRequestFactory;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.HttpConfig;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;
import org.apache.http.client.methods.CloseableHttpResponse;

public class LoginContentController {

	@FXML
	private TextField logLogin;

	@FXML
	private PasswordField logPassword;

	@FXML
	void logBtnLogin(ActionEvent event) {
		if (logLogin.getLength() > 3 && logPassword.getLength() > 3) {
			UserLoginRequestFactory userLogin = new UserLoginRequestFactory(logLogin.getText(), logPassword.getText());
			RequestData data = userLogin.createRequest();
			String dataNew = StorageMisc.getInstance().getJsonConverter().toJson(data);

			CloseableHttpResponse response = HttpConfig.getInstance().getRequestInvoker().executeRequest("login", dataNew);
			String id = QuickResponseParser.getResponse(response);
			if (id != null && Integer.parseInt(id) > 0) {
				HttpConfig.getInstance().setLocalUserID(id);
				MainController.getInstance().onLogin();
			}
		}
	}

	@FXML
	void logForgot(ActionEvent event) {
		StorageMisc.getInstance().getssState().changeState(null);
	}
}
