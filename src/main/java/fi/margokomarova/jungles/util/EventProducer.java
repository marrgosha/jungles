package fi.margokomarova.jungles.util;

import fi.margokomarova.jungles.entity.Tiger;

public class EventProducer {
    public void activateEvent(Tiger tiger) {
        while (checkStatus(tiger)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 12.5) {
                sleepEvent(tiger);
            } else if (eventNumber >= 12.5 && eventNumber < 25) {
                runEvent(tiger);
            } else if (eventNumber >= 25 && eventNumber < 37.5) {
                swimEvent(tiger);
            } else if (eventNumber >= 37.5 && eventNumber < 50) {
                eatDeer(tiger);
            } else if (eventNumber >= 50 && eventNumber < 62.5) {
                eatBoar(tiger);
            } else if (eventNumber >= 62.5 && eventNumber < 75) {
                eatHare(tiger);
            } else if (eventNumber >= 75 && eventNumber < 87.5) {
                huntEvent(tiger);
            } else {
                hunterAttack(tiger);

            }
        }
        System.out.println("Tiger died");
    }

    private void sleepEvent(Tiger tiger) {
        int energy = tiger.getEnergy() + 20;
        if (energy > 100) {
            energy = 100;
        }
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Tiger slept: +20 energy. Current energy:" + tiger.getEnergy());
    }

    private void runEvent(Tiger tiger) {
        int energy = tiger.getEnergy() - 5;
        if (energy < 0) {
            energy = 0;
        }
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Tiger run: -5 energy. Current energy:" + tiger.getEnergy());
    }

    private void swimEvent(Tiger tiger) {
        int energy = tiger.getEnergy() - 7;
        if (energy < 0) {
            energy = 0;
        }
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Tiger swam: -7 energy. Current energy:" + tiger.getEnergy());
    }

    private void eatDeer(Tiger tiger) {
        int energy = tiger.getEnergy() - 10;
        int health = tiger.getHealth() + tiger.getCoeff() * 2;
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        tiger.setEnergy(energy);
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Tiger has eaten deer.-10 energy. Current energy:" + tiger.getEnergy() + ", Current health:" + tiger.getHealth());
    }

    private void eatBoar(Tiger tiger) {
        int energy = tiger.getEnergy() - 10;
        int health = tiger.getHealth() + tiger.getCoeff() * 3;
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        tiger.setEnergy(energy);
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Tiger has eaten deer.-10 energy. Current energy:" + tiger.getEnergy() + ", Current health:" + tiger.getHealth());
    }

    private void eatHare(Tiger tiger) {
        int energy = tiger.getEnergy() - 5;
        int health = tiger.getHealth() + tiger.getCoeff();
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        tiger.setEnergy(energy);
        tiger.setHealth(health);
        checkEnergy(tiger);
        System.out.println("Tiger has eaten hare.-5 energy. Current energy:" + tiger.getEnergy() + ", Current health:" + tiger.getHealth());
    }

    private void hunterAttack(Tiger tiger) {
        int health = tiger.getHealth() - 20;
        int energy = tiger.getEnergy() - 10;
        if (health < 0) {
            health = 0;
        }
        if (energy < 0) {
            energy = 0;
        }
        tiger.setHealth(health);
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Hunter attacked tiger. -10 energy. -20 health. Current energy:" + tiger.getEnergy() + " ,Current health:" + tiger.getHealth());
    }

    private void huntEvent(Tiger tiger) {
        int energy = tiger.getEnergy() - 10;
        if (energy < 0) {
            energy = 0;
        }
        tiger.setEnergy(energy);
        checkEnergy(tiger);
        System.out.println("Tiger hunted. -10 energy. Current energy:" + tiger.getEnergy());
    }

    private boolean checkStatus(Tiger tiger) {
        if (tiger.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Tiger tiger) {
        if (tiger.getEnergy() <= 0) {
            int health = tiger.getHealth() - 5;
            if (health < 0) {
                health = 0;
            }
            tiger.setHealth(health);
        }
    }
}
