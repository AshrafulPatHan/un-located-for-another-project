import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MyBrowser extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        webView.getEngine().load("https://ashraful-pathan.web.app");

        stage.setScene(new Scene(webView, 1024, 768));
        stage.setTitle("Ashraful's Browser");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
