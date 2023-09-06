package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application;

import javafx.application.Application;
import javafx.stage.Stage;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.BasicJsonConverter;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.PostRequest;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.RequestInvoker;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.MainController;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.HttpConfig;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;


public class Runtime extends Application {

	@Override
	public void start(Stage primaryStage) {
		MainController.getInstance().setStage(primaryStage);
		MainController.getInstance().onStart();

		HttpConfig.getInstance().setRequestInvoker(new RequestInvoker());
		StorageMisc.getInstance().setJsonConverter(new BasicJsonConverter());
		initBaseRequests();
	}

	private void initBaseRequests() {
		HttpConfig.getInstance().getRequestInvoker().addRequest("login", new PostRequest(HttpConfig.getInstance().getLoginUrl(), null));
		HttpConfig.getInstance().getRequestInvoker().addRequest("register", new PostRequest(HttpConfig.getInstance().getRegisterUrl(), null));
		HttpConfig.getInstance().getRequestInvoker().addRequest("forgot", new PostRequest(HttpConfig.getInstance().getForgotUrl(), null));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
