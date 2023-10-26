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
public class Snake extends Animal{
    private boolean canCreep;
    private boolean isPoisonous;

    public Snake(boolean canCreep, boolean isPoisonous, String name, double weight, String color) {
        super(name, weight, color);
        this.canCreep = canCreep;
        this.isPoisonous = isPoisonous;
        this.type = "Zero-legged animals";
        this.leg = 0;
        this.twoSwings = false;
    }

    public Snake(boolean canCreep, boolean isPoisonous) {
        this.canCreep = canCreep;
        this.isPoisonous = isPoisonous;
    }

    

    public Snake() {
    }

    
    @Override
    public void display() {
        System.out.println("Snake Information:");
        super.display();
        System.out.println("Can Creep: " + canCreep);
        System.out.println("Is Poisonous: " + isPoisonous);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanCreep() {
        return canCreep;
    }

    public void setCanCreep(boolean canCreep) {
        this.canCreep = canCreep;
    }

    public boolean isIsPoisonous() {
        return isPoisonous;
    }

    public void setIsPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    
    
}
