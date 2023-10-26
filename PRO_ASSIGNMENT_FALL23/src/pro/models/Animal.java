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
public abstract class Animal {
    protected String type;
    protected String name;
    protected double weight;
    protected int leg;
    protected String color;
    protected boolean twoSwings;

    public Animal(String name, double weight, int leg, String color, boolean twoSwings) {
        this.name = name;
        this.weight = weight;
        this.leg = leg;
        this.color = color;
        this.twoSwings = twoSwings;
    }

    public Animal() {
    }

    public void display()
    {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Leg: " + leg);
        System.out.println("Color: " + color);
        System.out.println("Two Swings: " + twoSwings);
    }

    
}
