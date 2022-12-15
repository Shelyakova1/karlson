package room;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public static void main(String[] args) {
        init();
        run();
    }


    static List<? super Thing> things = new ArrayList<Thing>();

    public static void run() {
    fireLamp();
    fireFirePlace();

    }

    public static void fireFirePlace() {
        for (int i = 0; i < things.size(); i++) {
            if (things.get(i).getClass() == Lamp.class) {
                Lamp lamp = (Lamp) things.get(i);
                if (lamp.isLightning()) {
                    System.out.println("Мы не можем зажечь камин пока горит лампа.Сначала потушите лампу.");
                    return;
                }
            }
        }
        for (int i = 0; i < things.size(); i++) {
            if (things.get(i).getClass() == Fireplace.class) {
                Fireplace firePlace = (Fireplace) things.get(i);
                firePlace.addFuel(new FireWood());
                firePlace.startLightning();
            }
        }
    }

    public static void fireLamp() {
        for (int i = 0; i < things.size(); i++) {
            if (things.get(i).getClass() == Fireplace.class) {
                Fireplace firePlace = (Fireplace) things.get(i);
                if (firePlace.isLightning()) {
                    System.out.println("Мы не можем зажечь лампу пока горит камин.Сначала потушите камин.");
                    return;
                }
            }
        }
        for (int i = 0; i < things.size(); i++) {
            if (things.get(i).getClass() == Lamp.class) {
                Lamp lamp = (Lamp) things.get(i);
                lamp.addFuel(new Kerosene());
                lamp.startLightning();
            }
        }
    }

    public static void init() {
        Fireplace firePlace = new Fireplace();
        things.add(firePlace);
        Lamp lamp = new Lamp();
        things.add(lamp);
    }
}
