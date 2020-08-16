package pl.pkrysztofiak.skeleton2.view;

import javafx.collections.ListChangeListener;
import javafx.scene.layout.GridPane;
import pl.pkrysztofiak.skeleton2.model.Model;
import pl.pkrysztofiak.skeleton2.model.panel.PanelModel;
import pl.pkrysztofiak.skeleton2.view.panel.PanelPresenter;
import pl.pkrysztofiak.skeleton2.view.panel.PanelView;

public class View extends GridPane {

    private final Presenter presenter = new Presenter();
    
    private final Model model = Model.getInstance();
            
    public View() {
        model.panels.addListener((ListChangeListener<PanelModel>) change -> {
            while(change.next()) {
                if (change.wasAdded()) {
                    for (PanelModel panelModel : change.getAddedSubList()) {
                        PanelView panelView = new PanelView();
                        panelView.setPresenter(new PanelPresenter(panelModel));
                    }
                }
            }
        });
    }        
}