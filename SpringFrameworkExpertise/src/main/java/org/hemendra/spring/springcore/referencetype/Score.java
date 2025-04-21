package org.hemendra.spring.springcore.referencetype;

public class Score {

    double physics;
    double chemistry;

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Score{" +
                "physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
