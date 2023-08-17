package simulatorapp.util;

import simulatorapp.entity.SeaLion;

public class EventSimulator {

//10%//he sea lion has slept +10 energy//0- 10%//
//10%//the sea lion has eaten a squid  -5 energy +5 health//10-20%//
//10%//the sea lion swam -20 energy //20-30%//
//10%//the sea lion has eaten salmons -8 energy +10 health//30-40%//
//10%//the sea lion has fought with another se lion  -10 health//40-50%//
//10%//the sea lion has eaten an octopus -8 energy +10 health//50-60%//
//10%//the sea lion has eaten seaweeds -5 energy +5 health//60-70%//
//10%//the sea lion has eaten  clams -10 energy +10 health//70-80%//
//10%//the sea lion has eaten  crabs -10 energy +10 health//80-90%//
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
       }
    }


    private void sleepEvent(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        energy = energy + 10;
        if (energy > 100) {
            energy = 100;
        }
        seaLion.setEnergy(energy);
        checkEnergy(seaLion);
        System.out.println("The sea lion has slept! + 10 energy. Current energy:" + seaLion.getEnergy());
    }

    private void eatSquid(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 5;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 10 + (int) (seaLion.getCANINES() * 2);
        if (health > 100) {
            health = 100;
        }
        seaLion.setEnergy(energy);
        seaLion.setHealth(health);
        checkEnergy(seaLion);
        System.out.println("The sea lion has eaten a squid. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void swim(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        energy = energy - 20;
        if (energy > 100) {
            energy = 100;
        }
        seaLion.setEnergy(energy);
        checkEnergy(seaLion);
        System.out.println("The sea lion swam! - 20 energy. Current energy:" + seaLion.getEnergy());
    }

    private void eatSalmons(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 8;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 10 + (int) (seaLion.getCANINES() * 2);
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion has eaten salmons. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void fight(SeaLion seaLion) {
        int health = seaLion.getHealth();
        health = health - 10;
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion has fought with another one. Current health" + seaLion.getHealth());
    }

    private void eatOctopus(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 8;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 10 + (int) (seaLion.getCANINES() * 2);
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion has eaten an octopus. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void eatSeaweed(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 5;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 5 + (int) (seaLion.getCANINES() * 2);
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion has eaten seaweeds. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void eatClams(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 10;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 10 + (int) (seaLion.getCANINES() * 2);
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion has eaten clams. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void eatCrabs(SeaLion seaLion) {
        int energy = seaLion.getEnergy();
        int health = seaLion.getHealth();
        energy = energy - 10;
        if (energy > 100) {
            energy = 100;
        }
        health = health + 10 + (int) (seaLion.getCANINES() * 2);
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion has eaten crabs. Current energy:" + seaLion.getEnergy() + "Current health:" + seaLion.getHealth());
    }

    private void killerWhaleAttack(SeaLion seaLion) {
        int health = seaLion.getHealth();
        health = health - 20;
        if (health > 100) {
            health = 100;
        }
        checkEnergy(seaLion);
        System.out.println("The sea lion was attacked by a killer whale. Current health" + seaLion.getHealth());
    }

    //true - a simulation continues
    //false - sea lion is dead

    private boolean checkStatus(SeaLion seaLion) {
        if (seaLion.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(SeaLion seaLion) {
        if (seaLion.getEnergy() <= 0) {
            int health = seaLion.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            seaLion.setHealth(health);
        }
    }

}







