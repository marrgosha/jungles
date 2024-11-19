package fi.margokomarova.jungles.entity;

public class Tiger {
    private int health = 100;
    private int energy = 100;
    private int coeff = 2;


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getCoeff() {
        return this.coeff;
    }
}
