package us.kvitko.simulatorapp._main;

import us.kvitko.simulatorapp.entity.SeaLion;
import us.kvitko.simulatorapp.util.EventSimulator;

public class _Main {

    public static void main(String[] args) {
        SeaLion seaLion = new SeaLion();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(seaLion);
    }
}
