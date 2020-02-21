package observer_pattern.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Wetterdient implements PropertyChangeListener {
    private float luftfeuchtigkeit;

    public Wetterdient() {
    }

    public Wetterdient(float luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public float getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(float luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public void getWettervorhersage() {
        if ((this.luftfeuchtigkeit <= 100) && (this.luftfeuchtigkeit > 80) ) {
            System.out.println("Es ist trocken");
        }
        else if ((this.luftfeuchtigkeit > 100) && (this.luftfeuchtigkeit < 200) ) {
            System.out.println("Es regeln");
        }
        else {
            System.out.println("Achtung!! Unwetter");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("luftfeuchtigkeit"))
            setLuftfeuchtigkeit((float) evt.getNewValue());
    }
}
