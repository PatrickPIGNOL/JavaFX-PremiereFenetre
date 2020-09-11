package Game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class GameApplication extends Application 
{
	private Stage aStage;
	private Scene aScene;
	private Group aGroup;
	private Canvas aCanvas;
	private GraphicsContext aGraphicsContext;
	@Override
	public void start(Stage pStage) throws Exception 
	{
		this.aStage = pStage;
		this.aStage.setTitle("JavaFX-GameBase");
		this.aGroup = new Group();
		this.aScene = new Scene(this.aGroup);
		this.aCanvas = new Canvas( 800, 600);
		this.aGraphicsContext = this.aCanvas.getGraphicsContext2D();
		this.aGroup.getChildren().add(this.aCanvas);
		this.aStage.setScene(this.aScene);
		this.aStage.setResizable(false);
		this.aStage.show();
	}
}
