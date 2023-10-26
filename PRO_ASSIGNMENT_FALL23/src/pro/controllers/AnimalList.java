/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.controllers;

import java.io.File;
import java.util.ArrayList;
import pro.models.Animal;
import pro.models.I_Animal;
import pro.models.I_Menu;
import pro.models.Penguin;
import pro.models.Pigeon;
import pro.models.Snake;
import pro.models.Tiger;
import pro.utils.Utils;
import static pro.view.ZooManagement.writeToFile;

/**
 *
 * @author ACER
 */
public class AnimalList extends ArrayList<Animal> implements I_Animal{

    @Override
    public void add(String url) {
        I_Menu subMenu = new Menu();
        subMenu.addItem("\nWhich animal do you wanna update?");
        subMenu.addItem("1. Snake");
        subMenu.addItem("2. Tiger");
        subMenu.addItem("2. Pengiun");
        subMenu.addItem("3. Pegion");
        int subChoice;
        boolean out = true;
        do {                        
            subMenu.showMenu();
            subChoice = subMenu.getChoice();
            switch (subChoice)
            {
                case 1:
                    String name = Utils.getString("Input your new Snake's name: ");
                    double weight = Utils.getNumber("Input your new Snake's weight: ", 0, 1000);
                    String color = Utils.getString("Input your new Snake's color: ");
                    boolean isCreep = Utils.getBoolean("Your New Snake Can Creep: (Y/N)");
                    boolean isPoisonous = Utils.getBoolean("Your New Snake has poisonois: (Y/N)");
                    Snake newSnake = new Snake(isCreep, isPoisonous, name, weight, color);
                    this.add(newSnake);
                    break;
                case 2:
                    String nameTiger = Utils.getString("Input your new Tiger's name: ");
                    double weightTiger = Utils.getNumber("Input your new Tiger's weight: ", 0, 1000);
                    String colorTiger = Utils.getString("Input your new Tiger's color: ");
                    boolean canRun = Utils.getBoolean("Your New Tiger Can Run: (Y/N)");
                    boolean canGrowl = Utils.getBoolean("Your New Tiger Can Growl: (Y/N)");
                    boolean isDangerous = Utils.getBoolean("Your New Tiger Is Dangerous: (Y/N)");
                    boolean diet = Utils.getBoolean("Your New Tiger Diet: (Y/N)");
                    boolean eatRawMeat = Utils.getBoolean("Your New Tiger Eat Raw Meat: (Y/N)");
                    Tiger newTiger = new Tiger(canRun, canGrowl, isDangerous, diet, eatRawMeat, nameTiger, weightTiger, colorTiger);
                    this.add(newTiger);
                    break;
                case 3:
                    String namePengiun = Utils.getString("Input your new Pengiun's name: ");
                    double weightPengiun = Utils.getNumber("Input your new Pengiun's weight: ", 0, 1000);
                    String colorPengiun = Utils.getString("Input your new Pengiun's color: ");  
                    boolean canWalk = Utils.getBoolean("Your New Pengiun Can Walk: (Y/N)");
                    boolean canMakeSound = Utils.getBoolean("Your New Pengiun can make soung: (Y/N)");
                    boolean isCute = Utils.getBoolean("Your New Pengiun is cute: (Y/N)");
                    Penguin newPenguin = new Penguin(canWalk, canMakeSound, isCute, namePengiun, weightPengiun, colorPengiun);
                    this.add(newPenguin);
                    break;
                case 4:
                    String namePigeon = Utils.getString("Input your new Pigeon's name: ");
                    double weightPigeon = Utils.getNumber("Input your new Pigeon's weight: ", 0, 1000);
                    String colorPigeon = Utils.getString("Input your new Pigeon's color: ");
                    boolean isHeroic = Utils.getBoolean("Your New Pigeon is heroic: (Y/N)");
                    boolean canFly = Utils.getBoolean("Your New Pigeon can fly: (Y/N)");
                    Pigeon newPigeon = new Pigeon(isHeroic, canFly, namePigeon, weightPigeon, colorPigeon);
                    this.add(newPigeon);
                    break;
            }  
            out = Utils.getBoolean("Do you wanna continue to add animal? (Y/N)");
        } while (out);
        File file = new File(url);
        try {
            if(file.exists() == false)
            {
                file.createNewFile();
            }
            writeToFile(url, this);
        } catch (Exception e) {
        } 
        System.out.println("\nYou had added " + this.size() + " animal(s)");
        for (int i = 0; i < this.size(); i++) {
            Animal animalResult = this.get(i);
            System.out.print("\n" + (i + 1) + ". ");
            animalResult.display();
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int index) {
        boolean check = false;
        for(int i = 0; i < this.size(); i++)
        {
            if(i == index - 1)
            {
                Animal animal = (Animal) this.get(i);
                this.remove(animal);
                check = true;
            }
        }
        return check;
    }

    @Override
    public void search(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(double weight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showALl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
