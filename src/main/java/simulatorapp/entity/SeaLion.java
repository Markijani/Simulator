package simulatorapp.entity;

public class SeaLion {

    // 200 health
    // 100 energy
    // coefficient of sea lion canines 2,5

    private int health = 200;
    private int energy = 200;
    private final double CANINES = 2.5;

    public void setHealth(int health) {
        this.health = health;
    }

    public int  getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public double getCANINES() {
        return CANINES;
    }

}