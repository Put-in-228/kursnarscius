package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.fxmlcontrollers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage.StorageMisc;

public class MainController {
	private Stage stage;
	
	private static MainController instance;
	
	public static MainController getInstance() {
		if (MainController.instance == null) {
			MainController.instance = new MainController();
		}

		return MainController.instance;
	}

	public void switchStyle(Button button, String styleNew, String styleOld) {
		button.getStyleClass().remove(styleOld);
		button.getStyleClass().add(styleNew);
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	//Public functionality for scene changes
	
	public void onStart() {
		start();
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.show();
	}

	public void onLogin() { openMainScene(); }
	
	public void onExit() {
		terminateApp();
	}

	public void onMinimize() { minimizeApp(); }
	
	public void switchRegister() {
		gotoRegister();
	}
	
	public void switchLogin() { gotoLogin();	}
	
	public void switchForgot() {
		gotoForgot();
	}
	
	//Main functionality below

	private void start() {
		try {
			replaceSceneContent(StorageMisc.getInstance().getStartScene());
			StorageMisc.getInstance().getssState().initState();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void openMainScene() {
		try {
			replaceSceneContent(StorageMisc.getInstance().getMainScene());
			//Init state for the buttons on main scene
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			replacePaneContent(StorageMisc.getInstance().getContentNew(), StorageMisc.getInstance().getMainPane());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	private void terminateApp() {
		System.exit(0);
	}

	private void minimizeApp() { stage.setIconified(true); }
	
	private void gotoLogin() {
		try {
			replacePaneContent(StorageMisc.getInstance().getLoginContent(), StorageMisc.getInstance().getStartPane());
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	private void gotoRegister() {
		try {
			replacePaneContent(StorageMisc.getInstance().getRegisterContent(), StorageMisc.getInstance().getStartPane());
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	private void gotoForgot() {
		try {
            replacePaneContent(StorageMisc.getInstance().getForgotContent(), StorageMisc.getInstance().getStartPane());
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	//Content changing of the scenes
	
	private Parent replaceSceneContent(String fxml) throws Exception {
		Parent page = (Parent) FXMLLoader.load(MainController.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        if (scene == null) {
            scene = new Scene(page);
            scene.getStylesheets().add(MainController.class.getResource("/lt/kvk/i17/chursin_jevgenij/fxml/application.css").toExternalForm());
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }
        stage.sizeToScene();
        scene.setFill(Color.TRANSPARENT);
        return page;
    }

	private AnchorPane replacePaneContent(String fxml, AnchorPane pane) throws Exception {
		AnchorPane page = (AnchorPane) FXMLLoader.load(MainController.class.getResource(fxml), null, new JavaFXBuilderFactory());
		Scene scene = stage.getScene();
		if (scene == null) {
			System.exit(0);
		} else {
			pane.getChildren().setAll(page);
		}
		return page;
	}
}
