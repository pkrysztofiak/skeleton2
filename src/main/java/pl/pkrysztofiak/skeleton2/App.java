package pl.pkrysztofiak.skeleton2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.reactivex.Observable;
import io.reactivex.rxjavafx.schedulers.JavaFxScheduler;
import io.reactivex.schedulers.Schedulers;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import pl.pkrysztofiak.skeleton2.view.View;

/**
 * Hello world!
 *
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Rectangle2D bounds = Screen.getPrimary().getBounds();

        stage.setX(bounds.getMinX() + 100.);
        stage.setY(bounds.getMinX() + 100.);
        stage.setWidth(bounds.getWidth() - 2 * 100.);
        stage.setHeight(bounds.getHeight() - 2 * 100.);

        stage.show();

        Observable.<View> create(emitter -> {
            emitter.onNext(new View());
            emitter.onComplete();
        }).subscribeOn(Schedulers.from(executor)).observeOn(JavaFxScheduler.platform()).subscribe(view -> {
            
            Scene scene = new Scene(view);
            stage.setScene(scene);
        });
    }
}