package us.kvitko.simulatorapp.util;

import us.kvitko.simulatorapp.entity.SeaLion;

public class EventSimulator {

//10%//he sea lion has slept +5 energy//0- 10%//
//10%//the sea lion has eaten a squid  -10 energy +5 health//10-20%//
//10%//the sea lion swam -30 energy //20-30%//
//10%//the sea lion has eaten salmons -5 energy +5 health//30-40%//
//10%//the sea lion has fought with another se lion  -25 health//40-50%//
//10%//the sea lion has eaten an octopus -10 energy +5 health//50-60%//
//10%//the sea lion has eaten seaweeds -5 energy +5 health//60-70%//
//10%//the sea lion has eaten  clams -5 energy +5 health//70-80%//
//10%//the sea lion has eaten  crabs -5 energy +5 health//80-90%//
//10%// a killer whale attacked the sea lion -20 health //90-100%//

    public void startSimulation(SeaLion seaLion) {
        while (checkStatus(seaLion)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 10) {
                sleepEvent(seaLion);
            } else if (eventNumber >= 10 && eventNumber < 20) {
                eatSquid(seaLion);
            } else if (eventNumber >= 20 && eventNumber < 30) {
                swim(seaLion);
            } else if (eventNumber >= 30 && eventNumber < 40) {
                eatSalmons(seaLion);
            } else if (eventNumber >= 40 && eventNumber < 50) {
                fight(seaLion);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                eatOctopus(seaLion);
            } else if (eventNumber >= 60 && eventNumber < 70) {
                eatSeaweed(seaLion);
            } else if (eventNumber >= 70 && eventNumber < 80) {
                eatClams(seaLion);
            } else if (eventNumber >= 80 && eventNumber < 90) {
                eatCrabs(seaLion);
            } else if (eventNumber >= 90 && eventNumber < 100) {
                killerWhaleAttack(seaLion);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("Oh no! The sea lion is dead! The end!");
    }

    private void sleepEvent(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        energy = energy + 5;
        checkEnergy(seaLion);
        seaLion.setEnergy(energy);
        checkLowHealth(seaLion);
        System.out.println("The sea lion has slept! + 10 energy. Current energy:" + seaLion.getEnergy());
    }

    private void eatSquid(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 10;
        checkEnergy(seaLion);
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        checkLowHealth(seaLion);
        checkHighHealth(seaLion);
        seaLion.setEnergy(energy);
        seaLion.setHealth(health);
        System.out.println("The sea lion has eaten a squid. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void swim(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        energy = energy - 30;
        checkLowHealth(seaLion);
        checkEnergy(seaLion);
        seaLion.setEnergy(energy);
        System.out.println("The sea lion swam! - 20 energy. Current energy:" + seaLion.getEnergy());
    }

    private void eatSalmons(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 5;
        checkEnergy(seaLion);
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        checkLowHealth(seaLion);
        checkHighHealth(seaLion);
        System.out.println("The sea lion has eaten salmons. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void fight(SeaLion seaLion) {
        int health = seaLion.getHealth();
        health = health - 25;
        checkHighHealth(seaLion);
        checkLowHealth(seaLion);
        System.out.println("The sea lion has fought with another one. Current health" + seaLion.getHealth());
    }

    private void eatOctopus(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 10;
        checkEnergy(seaLion);
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        checkLowHealth(seaLion);
        checkHighHealth(seaLion);
        System.out.println("The sea lion has eaten an octopus. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void eatSeaweed(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 5;
        checkEnergy(seaLion);
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        checkLowHealth(seaLion);
        checkHighHealth(seaLion);
        System.out.println("The sea lion has eaten seaweeds. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void eatClams(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 5;
        checkEnergy(seaLion);
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        checkLowHealth(seaLion);
        checkHighHealth(seaLion);
        System.out.println("The sea lion has eaten clams. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void eatCrabs(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 5;
        checkEnergy(seaLion);
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        checkLowHealth(seaLion);
        checkHighHealth(seaLion);
        System.out.println("The sea lion has eaten crabs. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void killerWhaleAttack(SeaLion seaLion) {
        int health = seaLion.getHealth();
        health = health - 20;
        checkHighHealth(seaLion);
        checkLowHealth(seaLion);
        System.out.println("The sea lion was attacked by a killer whale. Current health" + seaLion.getHealth());
    }

    //true - a simulation continues
    //false - the sea lion is dead
    private boolean checkStatus(SeaLion seaLion) {
        System.out.println("Health:" + seaLion.getHealth() + "Energy:" + seaLion.getEnergy());
        return seaLion.getHealth() > 0;
    }

    private void checkLowHealth(SeaLion seaLion) {
        if (seaLion.getEnergy() <= 0) {
            int health = seaLion.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            seaLion.setHealth(health);
        }

    }

    private void checkHighHealth(SeaLion seaLion) {
        int health = seaLion.getHealth();
        if (health > 100) {
            health = 100;
        }
    }

    private void checkEnergy(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        if (energy > 100) {
            energy = 100;
        }

    }

}







