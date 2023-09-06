package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.scenemisc.startmisc;

import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.MainController;

public class LoginState implements StartSceneState {

    private StartScene main;
    LoginState(StartScene main) {
        this.main = main;
    }
    @Override
    public void changeState(Button clickedBtn) {
        if(main.getLastState() == 2) {
            MainController.getInstance().switchStyle(main.getLoginBtn(), "button-selected", "button-deselected");
        }
        else {
            MainController.getInstance().switchStyle(main.getLoginBtn(), "button-selected", "button-deselected");
            MainController.getInstance().switchStyle(main.getRegisterBtn(), "button-deselected", "button-selected");
            main.getRegIcon().setFill(Paint.valueOf("white"));
        }
        main.getLogIcon().setFill(Paint.valueOf("black"));
        MainController.getInstance().switchLogin();
    }
}
