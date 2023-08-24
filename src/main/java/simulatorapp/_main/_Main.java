package simulatorapp._main;

import simulatorapp.entity.SeaLion;
import simulatorapp.util.EventSimulator;

public class _Main {

    public static void main(String[] args) {
        SeaLion seaLion = new SeaLion();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(seaLion);
    }
}
