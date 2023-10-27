/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.models;

/**
 *
 * @author ACER
 */
public class Penguin extends Animal{
    private boolean canWalk;
    private boolean canMakeSound;
    private boolean isCute;

    public Penguin(boolean canWalk, boolean canMakeSound, boolean isCute, String name, int weight, String color) {
        super(name, weight, color);
        this.canWalk = canWalk;
        this.canMakeSound = canMakeSound;
        this.isCute = isCute;
        this.type = "Bipedal and Flightless animals";
        this.leg = 2;
        this.twoSwings = true;
    }

    public Penguin(boolean canWalk, boolean canMakeSound, boolean isCute) {
        this.canWalk = canWalk;
        this.canMakeSound = canMakeSound;
        this.isCute = isCute;
    }

    
    @Override
    public void display() {
        System.out.println("Penguin Information:");
        super.display();
        System.out.println("Can Walk: " + canWalk);
        System.out.println("Can Make Sound: " + canMakeSound);
        System.out.println("Cute: " + isCute);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public boolean isCanMakeSound() {
        return canMakeSound;
    }

    public void setCanMakeSound(boolean canMakeSound) {
        this.canMakeSound = canMakeSound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIsCute() {
        return isCute;
    }

    public void setIsCute(boolean isCute) {
        this.isCute = isCute;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
