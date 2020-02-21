package observer_pattern.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LuftDaten {
    private String ort;
    private float feinstaub;
    private float luftfeuchtigkeit;

    private PropertyChangeSupport support;

    public LuftDaten(String ort, float feinstaub, float luftfeuchtigkeit) {
        this.ort = ort;
        this.feinstaub = feinstaub;
        this.luftfeuchtigkeit = luftfeuchtigkeit;

        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {

        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public float getFeinstaub() {
        return feinstaub;
    }

    public void setFeinstaub(float feinstaub) {
        support.firePropertyChange("feinstaub",this.feinstaub, feinstaub);
        this.feinstaub = feinstaub;

    }

    public float getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(float luftfeuchtigkeit) {
        support.firePropertyChange("luftfeuchtigkeit",this.luftfeuchtigkeit,luftfeuchtigkeit);
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

}
