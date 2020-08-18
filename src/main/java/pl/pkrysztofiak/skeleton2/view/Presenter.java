package pl.pkrysztofiak.skeleton2.view;

import io.reactivex.Observable;
import pl.pkrysztofiak.skeleton2.model.Model;
import pl.pkrysztofiak.skeleton2.model.panel.PanelModel;

public class Presenter {

    private final Model model = Model.getInstance();
    
    public Presenter() {
        
    }
    
    public Observable<PanelModel> panelAddedObservable() {
        return model.panelAddedObservable();
    }
}