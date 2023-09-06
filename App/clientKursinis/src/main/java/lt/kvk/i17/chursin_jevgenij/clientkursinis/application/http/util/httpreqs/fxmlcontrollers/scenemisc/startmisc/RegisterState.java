package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.scenemisc.startmisc;

import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.MainController;

public class RegisterState implements StartSceneState {

    private StartScene main;
    RegisterState(StartScene main) {
        this.main = main;
    }
    @Override
    public void changeState(Button clickedBtn) {
        if(main.getLastState() == 2) {
            MainController.getInstance().switchStyle(main.getRegisterBtn(), "button-selected", "button-deselected");
        }
        else {
            MainController.getInstance().switchStyle(main.getRegisterBtn(), "button-selected", "button-deselected");
            MainController.getInstance().switchStyle(main.getLoginBtn(), "button-deselected", "button-selected");
            main.getLogIcon().setFill(Paint.valueOf("white"));
        }
        main.getRegIcon().setFill(Paint.valueOf("black"));
        MainController.getInstance().switchRegister();
    }
}
