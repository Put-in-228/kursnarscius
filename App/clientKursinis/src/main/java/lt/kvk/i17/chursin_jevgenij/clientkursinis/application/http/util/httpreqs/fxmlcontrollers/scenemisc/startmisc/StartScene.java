package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers.scenemisc.startmisc;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.scene.control.Button;

public class StartScene implements StartSceneState {
    private Button loginBtn;
    private Button registerBtn;
    private Button lastBtn;
    private StartSceneState currentState;
    private StartSceneState loginState;
    private StartSceneState registerState;
    private StartSceneState forgotState;
    private int lastState;

    private FontAwesomeIconView regIcon;
    private FontAwesomeIconView logIcon;

    public StartScene(Button register, Button login, FontAwesomeIconView regIcon, FontAwesomeIconView logIcon) {
        registerState = new RegisterState(this);
        loginState = new LoginState(this);
        forgotState = new ForgotState(this);
        currentState = registerState;

        registerBtn = register;
        loginBtn = login;
        lastBtn = register;

        this.regIcon = regIcon;
        this.logIcon = logIcon;
    }


    @Override
    public void changeState(Button clickedBtn) {
        if (clickedBtn == null) {
            lastState = getIntValue(currentState);
            currentState = forgotState;
            currentState.changeState(null);
        }
        else if(lastBtn == clickedBtn && currentState != forgotState) {

        }
        else if(lastBtn == clickedBtn && currentState == forgotState) {
            lastState = getIntValue(currentState);
            currentState = getState(clickedBtn);
            currentState.changeState(clickedBtn);
        }
        else {
            lastState = getIntValue(currentState);
            lastBtn = clickedBtn;
            currentState = getState(clickedBtn);
            currentState.changeState(clickedBtn);
        }
    }

    public Button getRegisterBtn() { return registerBtn; }
    public Button getLoginBtn() { return loginBtn; }
    public int getLastState() { return lastState; }
    public void initState() { changeState(loginBtn); }
    public FontAwesomeIconView getRegIcon() { return regIcon; }
    public FontAwesomeIconView getLogIcon() {return logIcon; }
    private void changeState(StartSceneState newState) {
        currentState = newState;
    }

    private StartSceneState getState(Button newBtn) {
        if(newBtn == registerBtn) { return registerState; }
        else { return loginState; }
    }

    private int getIntValue(StartSceneState state) {
        if(state == loginState) { return 0; }
        else if(state == registerState) { return 1; }
        else { return 2; }
    }
}
