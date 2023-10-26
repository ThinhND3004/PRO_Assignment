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
public class Tiger extends Animal{
    
    private boolean canRun;
    private boolean canGrowl;
    private boolean isDangerous;
    private String diet;
    private boolean eatRawMeat;

    public Tiger(boolean canRun, boolean canGrowl, boolean isDangerous, String diet, boolean eatRawMeat, String name, double weight, int leg, String color, boolean twoSwings) {
        super(name, weight, leg, color, twoSwings);
        this.canRun = canRun;
        this.canGrowl = canGrowl;
        this.isDangerous = isDangerous;
        this.diet = diet;
        this.eatRawMeat = eatRawMeat;
        this.type = "Four-legged animals";
    }

    public Tiger(boolean canRun, boolean canGrowl, boolean isDangerous, String diet, boolean eatRawMeat) {
        this.canRun = canRun;
        this.canGrowl = canGrowl;
        this.isDangerous = isDangerous;
        this.diet = diet;
        this.eatRawMeat = eatRawMeat;
    }

    
   
    @Override
    public void display() {
        System.out.println("Tiger Information:");
        super.display();
        System.out.println("Can Run: " + canRun);
        System.out.println("Can Growl: " + canGrowl);
        System.out.println("Is Dangerous: " + isDangerous);
        System.out.println("Diet: " + diet);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public void setCanRun(boolean canRun) {
        this.canRun = canRun;
    }

    public boolean isCanGrowl() {
        return canGrowl;
    }

    public void setCanGrowl(boolean canGrowl) {
        this.canGrowl = canGrowl;
    }

    public boolean isIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
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

    public boolean isEatRawMeat() {
        return eatRawMeat;
    }

    public void setEatRawMeat(boolean eatRawMeat) {
        this.eatRawMeat = eatRawMeat;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
