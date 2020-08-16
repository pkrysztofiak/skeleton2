package pl.pkrysztofiak.skeleton2.model.panel;

public class PanelModel {

    private final int columnIndex;
    private final int rowIndex;
    
    public PanelModel(int columnIndex, int rowIndex) {
        this.columnIndex = columnIndex;
        this.rowIndex = rowIndex;
    }
}