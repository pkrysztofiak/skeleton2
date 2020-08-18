package pl.pkrysztofiak.skeleton2.model;

import io.reactivex.Observable;
import io.reactivex.rxjavafx.observables.JavaFxObservable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.pkrysztofiak.skeleton2.model.panel.PanelModel;

public class Model {

    public final ObservableList<PanelModel> panels = FXCollections.observableArrayList();
    private final Observable<PanelModel> panelAddedObservable = JavaFxObservable.additionsOf(panels).startWith(panels);
    
    private static Model instance;
    
    private Model() {
        panels.setAll(new PanelModel(0, 0), new PanelModel(0, 1), new PanelModel(1, 0), new PanelModel(1, 1));
    }
    
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }
    
    public Observable<PanelModel> panelAddedObservable() {
        return panelAddedObservable;
    }
}