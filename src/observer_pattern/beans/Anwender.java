package observer_pattern.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Anwender implements PropertyChangeListener {
    private String name;
    private float feinstaub;

    public Anwender() {
    }

    public Anwender(String name, float feinstaub) {
        this.name = name;
        this.feinstaub = feinstaub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFeinstaub() {
        return feinstaub;
    }

    public void setFeinstaub(float feinstaub) {
        this.feinstaub = feinstaub;
    }

    public void getNachricht() {
        if (this.feinstaub <= 100)
            System.out.println("Hey "+this.name+" Alles in Ordnung");
        else
            System.out.println("Hey "+this.name+" Alarm");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("feinstaub"))
            this.setFeinstaub((float) evt.getNewValue());
    }
}
