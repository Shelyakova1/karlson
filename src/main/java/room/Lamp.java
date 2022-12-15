package room;

import java.util.ArrayList;
import java.util.List;

public class Lamp extends Thing implements IlluminatingObject {

    private boolean isLightning;
    List<Kerosene> kerosene = new ArrayList();
    public boolean isLightning() {
        return isLightning;
    }
    @Override
    public void startLightning() {
        if (kerosene.size() == 0) {
            System.out.println("Керосина нет.");
            return;
        }
        Kerosene liter = kerosene.get(kerosene.size() - 1);
        isLightning = true;
        kerosene.remove(liter);
        System.out.println("Лампа горит.");
    }

    @Override
    public void stopLightning() {
        isLightning = false;
        System.out.println("Лампа погасла.");
    }
    public void addFuel(Fuel fuel) {
        if (fuel.getClass() == Kerosene.class) {
            kerosene.add((Kerosene) fuel);
        } else {
            System.out.println("Можно добавлять только керосин.");
        }
    }


}
