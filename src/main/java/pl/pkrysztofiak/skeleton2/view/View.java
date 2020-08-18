package pl.pkrysztofiak.skeleton2.view;

import javafx.scene.layout.GridPane;
import pl.pkrysztofiak.skeleton2.view.panel.PanelPresenter;
import pl.pkrysztofiak.skeleton2.view.panel.PanelView;

public class View extends GridPane {

    private final Presenter presenter = new Presenter();
            
    public View() {
        presenter.panelAddedObservable().subscribe(panelModel -> {
            PanelView panelView = new PanelView();
            panelView.setPresenter(new PanelPresenter(presenter));
        });
    }
}