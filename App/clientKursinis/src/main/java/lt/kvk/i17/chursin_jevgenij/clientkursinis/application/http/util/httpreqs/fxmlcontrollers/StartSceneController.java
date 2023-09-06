package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.scenemisc.startmisc.StartScene;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;

public class StartSceneController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    private FontAwesomeIconView logIcon;

    @FXML
    private Button loginBtn;

    @FXML
    private FontAwesomeIconView regIcon;

    @FXML
    private Button registerBtn;

    @FXML
    private Label titleName;

    @FXML
    void BtnLogin(ActionEvent event) {
        StorageMisc.getInstance().getssState().changeState(loginBtn);
    }

    @FXML
    void BtnRegister(ActionEvent event) {
        StorageMisc.getInstance().getssState().changeState(registerBtn);
    }

    @FXML
    void onExitClick(MouseEvent event) {
        MainController.getInstance().onExit();
    }

    @FXML
    void onMinimizeClick(MouseEvent event) {
        MainController.getInstance().onMinimize();
    }

    @FXML
    public void initialize() {
        StorageMisc.getInstance().setStartPane(contentPane);
        StorageMisc.getInstance().setssState(new StartScene(registerBtn, loginBtn, regIcon, logIcon));
    }
}
