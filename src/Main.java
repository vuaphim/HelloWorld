import observer_pattern.beans.Anwender;
import observer_pattern.beans.LuftApp;

public class Main {

    public static void main(String[] args) {

        LuftApp app = new LuftApp(90,20,50);
        Anwender user1 = new Anwender("Jane");
        Anwender user2 = new Anwender("Patrick");
        user1.setNachricht(90);
        user2.setNachricht(90);
        app.addPropertyChangeListener(user1);
        app.addPropertyChangeListener(user2);

        System.out.println("Before change");
        System.out.println(user1.getNachricht());
        System.out.println(user2.getNachricht());

        app.setFeinstaub(200);

        System.out.println("After change");
        System.out.println(user1.getNachricht());
        System.out.println(user2.getNachricht());

        app.setFeinstaub(50);
        System.out.println("After change");
        System.out.println(user1.getNachricht());
        System.out.println(user2.getNachricht());

    }
}
