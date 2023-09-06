package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;

public class MainSceneController {

	@FXML
	private AnchorPane contentPane;

	@FXML
	public void initialize() {
		StorageMisc.getInstance().setMainPane(contentPane);
	}
}
