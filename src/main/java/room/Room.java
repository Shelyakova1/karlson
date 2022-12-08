package room;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public static void main(String[] args) {
init();

    }
   static Fireplace firePlace;
   // List<? super Thing> things = new ArrayList<Thing>();
    public static void init(){
        firePlace= new Fireplace();
        firePlace.startLightning();
        firePlace.addFuel(new FireWood());
//        things.add(new FireWood());
    }
}
