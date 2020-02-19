package observer_pattern.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Anwender implements PropertyChangeListener {
    private String name;
    private String nachricht;

    public Anwender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNachricht(float feinstaub) {
        if (feinstaub <= 100) this.nachricht = "Hey "+this.name+" Alles in Ordnung";
        else this.nachricht = "Hey "+this.name+" Alarm";
    }

    public String getNachricht(){
        return this.nachricht;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNachricht((float) evt.getNewValue());
    }
}
