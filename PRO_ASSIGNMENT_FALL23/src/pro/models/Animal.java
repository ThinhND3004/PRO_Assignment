/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.models;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public abstract class Animal implements Serializable{
    protected String type;
    protected String name;
    protected int weight;
    protected int leg;
    protected String color;
    protected boolean twoSwings;

    public Animal(String name, int weight, int leg, String color, boolean twoSwings) {
        this.name = name;
        this.weight = weight;
        this.leg = leg;
        this.color = color;
        this.twoSwings = twoSwings;
    }

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
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

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    
}
