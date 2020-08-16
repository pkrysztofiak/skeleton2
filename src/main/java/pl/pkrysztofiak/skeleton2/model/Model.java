package pl.pkrysztofiak.skeleton2.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.pkrysztofiak.skeleton2.model.panel.PanelModel;

public class Model {

    public final ObservableList<PanelModel> panels = FXCollections.observableArrayList();
    
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
}