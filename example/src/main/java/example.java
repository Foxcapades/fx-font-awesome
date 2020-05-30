import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class example extends Application
{
  private Scene rootScene;

  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    FontAwesome.Load();
    try {
      AnchorPane tmp = FXMLLoader.load(example.class.getResource("/examples/fxml/src/main/resources/example.fxml"));
      rootScene      = new Scene(tmp);
      primaryStage.setScene(rootScene);
      primaryStage.show();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
