package pl.pkrysztofiak.skeleton2.view.panel;

import javafx.scene.layout.VBox;
import pl.pkrysztofiak.skeleton2.view.panel.toolbar.PanelToolbarPresenter;
import pl.pkrysztofiak.skeleton2.view.panel.toolbar.PanelToolbarView;

public class PanelView extends VBox {
    
    private final PanelToolbarView panelToolbarView = new PanelToolbarView();
    
    public PanelView() {
        
    }
    
    public void setPresenter(PanelPresenter presenter) {
        panelToolbarView.setPresenter(new PanelToolbarPresenter());
    }
}