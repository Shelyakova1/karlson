package room;

import java.util.ArrayList;
import java.util.List;

public class Fireplace extends Thing implements IlluminatingObject {
    private boolean isLightning;
    List<FireWood> firewood = new ArrayList();

    public boolean isLightning() {
        return isLightning;
    }

    @Override
    public void startLightning() {


        if (firewood.size() == 0) {
            System.out.println("Дров нет");
            return;
        }

        FireWood log = firewood.get(firewood.size() - 1);
        isLightning = true;
        firewood.remove(log);
        System.out.println("Камин горит.");
    }

    @Override
    public void stopLightning() {
        isLightning = false;
        System.out.println("Камин погас.");
    }

    public void addFuel(Fuel fuel) {
        if (fuel.getClass() == FireWood.class) {
            firewood.add((FireWood) fuel);
        } else {
            System.out.println("Можно добавлять только дрова");
        }
    }
}
