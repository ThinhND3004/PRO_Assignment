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
public class Pigeon extends Animal{
    private boolean isHeroic;
    private boolean canFly;

    public Pigeon(boolean isHeroic, boolean canFly, String name, int weight, String color) {
        super(name, weight, color);
        this.isHeroic = isHeroic;
        this.canFly = canFly;
        this.type = "Bipedal And Flying Animals";
        this.leg = 2;
        this.twoSwings = true;
    }

    public Pigeon(boolean isHeroic, boolean canFly) {
        this.isHeroic = isHeroic;
        this.canFly = canFly;
    }
    
    
    @Override
    public void display() {
        System.out.println("Pigeon Information:");
        super.display();
        System.out.println("Heroic: " + isHeroic);
        System.out.println("Can Fly: " + canFly);
    }

    public boolean isIsHeroic() {
        return isHeroic;
    }

    public void setIsHeroic(boolean isHeroic) {
        this.isHeroic = isHeroic;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTwoSwings() {
        return twoSwings;
    }

    public void setTwoSwings(boolean twoSwings) {
        this.twoSwings = twoSwings;
    }

}
