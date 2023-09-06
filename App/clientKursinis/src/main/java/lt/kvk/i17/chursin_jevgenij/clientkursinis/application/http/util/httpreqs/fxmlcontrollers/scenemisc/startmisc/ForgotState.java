package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.scenemisc.startmisc;

import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.MainController;

public class ForgotState implements StartSceneState{

    private StartScene main;
    ForgotState(StartScene main) {
        this.main = main;
    }
    @Override
    public void changeState(Button clickedBtn) {
        switch (main.getLastState()) {
            case 0:
                MainController.getInstance().switchStyle(main.getLoginBtn(), "button-deselected", "button-selected");
                break;
            case 1:
                MainController.getInstance().switchStyle(main.getRegisterBtn(), "button-deselected", "button-selected");
                break;
        }
        main.getLogIcon().setFill(Paint.valueOf("white"));
        main.getRegIcon().setFill(Paint.valueOf("white"));
        MainController.getInstance().switchForgot();
    }
}
