import observer_pattern.beans.Anwender;
import observer_pattern.beans.LuftDaten;
import observer_pattern.beans.Wetterdient;

public class Main {

    public static void main(String[] args) {

        LuftDaten app = new LuftDaten("Hamburg",50,100);
        Anwender user1 = new Anwender("Jane",50);
        Wetterdient user2 = new Wetterdient(100);

        app.addPropertyChangeListener(user1);
        app.addPropertyChangeListener(user2);

        System.out.println("Before change");
        user1.getNachricht();
        user2.getWettervorhersage();
        app.setFeinstaub(200);
        app.setLuftfeuchtigkeit(130);
        System.out.println("After change change");
        user1.getNachricht();
        user2.getWettervorhersage();



    }
}
