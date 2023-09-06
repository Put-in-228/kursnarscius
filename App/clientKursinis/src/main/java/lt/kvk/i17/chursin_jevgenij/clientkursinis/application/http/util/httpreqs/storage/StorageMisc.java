package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage;

import javafx.scene.layout.AnchorPane;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.BasicJsonConverter;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.scenemisc.startmisc.StartScene;

public class StorageMisc {

	private static StorageMisc instance;

	private final String sceneStart = "/lt/kvk/i17/chursin_jevgenij/fxml/scenes/StartScene.fxml";
	private final String sceneMain = "/lt/kvk/i17/chursin_jevgenij/fxml/scenes/MainScene.fxml";
	
	private final String contentLogin = "/lt/kvk/i17/chursin_jevgenij/fxml/content/LoginContent.fxml";
	private final String contentRegister = "/lt/kvk/i17/chursin_jevgenij/fxml/content/RegisterContent.fxml";
	private final String contentForgot = "/lt/kvk/i17/chursin_jevgenij/fxml/content/ForgotContent.fxml";
	private final String contentNew = "/lt/kvk/i17/chursin_jevgenij/fxml/content/NewContent.fxml";

	private StartScene ssState = null;
	private AnchorPane startPane = null;
	private AnchorPane mainPane = null;

	private BasicJsonConverter jsonConverter;
	
	
	public static StorageMisc getInstance() {
		if (StorageMisc.instance == null) {
			StorageMisc.instance = new StorageMisc();
		}

		return StorageMisc.instance;
	}

	public String getStartScene() {
		return sceneStart;
	}

	public String getMainScene() { return sceneMain; }
	
	public String getLoginContent() {
		return contentLogin;
	}
	
	public String getRegisterContent() {
		return contentRegister;
	}
	
	public String getForgotContent() {
		return contentForgot;
	}

	public String getContentNew() {
		return contentNew;
	}

	public void setssState(StartScene ssState) { this.ssState = ssState; }
	public void setStartPane(AnchorPane pane) { this.startPane = pane; }

	public StartScene getssState() { return ssState; }
	public AnchorPane getStartPane() { return startPane; }

	public AnchorPane getMainPane() {
		return mainPane;
	}

	public void setMainPane(AnchorPane mainPane) {
		this.mainPane = mainPane;
	}

	public BasicJsonConverter getJsonConverter() {
		return jsonConverter;
	}

	public void setJsonConverter(BasicJsonConverter jsonConverter) {
		this.jsonConverter = jsonConverter;
	}
}
