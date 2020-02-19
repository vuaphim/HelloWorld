package observer_pattern.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LuftApp {
    private float feinstaub;
    private float luftfeuchtigkeit;
    private float stickstoffdioxid;

    private PropertyChangeSupport support;

    public LuftApp(float feinstaub, float luftfeuchtigkeit, float stickstoffdioxid) {
        this.feinstaub = feinstaub;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.stickstoffdioxid = stickstoffdioxid;
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
        this.luftfeuchtigkeit = luftfeuchtigkeit;

    }

    public float getStickstoffdioxid() {
        return stickstoffdioxid;
    }

    public void setStickstoffdioxid(float stickstoffdioxid) {
        this.stickstoffdioxid = stickstoffdioxid;
    }
}
