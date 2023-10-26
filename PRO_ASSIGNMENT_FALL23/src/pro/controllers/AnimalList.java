/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pro.models.Animal;
import pro.models.I_Animal;
import pro.models.I_Menu;
import pro.models.Penguin;
import pro.models.Pigeon;
import pro.models.Snake;
import pro.models.Tiger;
import pro.utils.Utils;

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
            Utils.writeToFile(url, this);
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
    public boolean update(String url) {
        boolean check = false;
        try {
            File file = new File(url);
            if(file.exists() == false)
            {
                file.createNewFile();
            }
            AnimalList list = Utils.readFromFile(url);
            for(int i = 0; i < list.size(); i++)
            {
                Animal resultAnimal = list.get(i);
                System.out.print("\n" + (i + 1) + ". ");
                resultAnimal.display();
            }
            int choice = Utils.getNumber("Which do you want to update?", 1, list.size());
            for(int i = 0; i < list.size(); i++)
            {
                if(i == (choice - 1))
                {
                    Animal updatingAnimal = (Animal) this.get(i);
                    if (updatingAnimal instanceof Tiger) {
                    Tiger t = (Tiger) updatingAnimal;
                    String nameTiger = Utils.getString("Update your Tiger's name: ");
                    double weightTiger = Utils.getNumber("Update your Tiger's weight: ", 0, 1000);
                    String colorTiger = Utils.getString("Update your Tiger's color: ");
                    boolean canRun = Utils.getBoolean("Update Your Tiger Can Run: (Y/N)");
                    boolean canGrowl = Utils.getBoolean("Update Your Tiger Can Growl: (Y/N)");
                    boolean isDangerous = Utils.getBoolean("Update Your Tiger Is Dangerous: (Y/N)");
                    boolean diet = Utils.getBoolean("Update Your Tiger Diet: (Y/N)");
                    boolean eatRawMeat = Utils.getBoolean("Update Your Tiger Eat Raw Meat: (Y/N)");
                    t.setCanGrowl(canGrowl);
                    t.setCanRun(canRun);
                    t.setColor(colorTiger);
                    t.setWeight(weightTiger);
                    t.setName(nameTiger);
                    t.setDiet(diet);
                    t.setEatRawMeat(eatRawMeat);
                    list.set(i, t);
                } else if (updatingAnimal instanceof Penguin) {
                    Penguin p = (Penguin) updatingAnimal;
                    String namePengiun = Utils.getString("Update your Pengiun's name: ");
                    double weightPengiun = Utils.getNumber("Update your Pengiun's weight: ", 0, 1000);
                    String colorPengiun = Utils.getString("Update your Pengiun's color: ");  
                    boolean canWalk = Utils.getBoolean("Update Your Pengiun Can Walk: (Y/N)");
                    boolean canMakeSound = Utils.getBoolean("Update Your Pengiun can make soung: (Y/N)");
                    boolean isCute = Utils.getBoolean("Update Your Pengiun is cute: (Y/N)");
                    p.setCanMakeSound(canMakeSound);
                    p.setCanWalk(canWalk);
                    p.setIsCute(isCute);
                    p.setName(namePengiun);
                    p.setWeight(weightPengiun);
                    p.setColor(colorPengiun);
                    list.set(i, p);
                } else if (updatingAnimal instanceof Penguin) {
                    Pigeon p = (Pigeon) updatingAnimal;
                    String namePigeon = Utils.getString("Update your Pigeon's name: ");
                    double weightPigeon = Utils.getNumber("Update your Pigeon's weight: ", 0, 1000);
                    String colorPigeon = Utils.getString("Update your Pigeon's color: ");
                    boolean isHeroic = Utils.getBoolean("Update Your Pigeon is heroic: (Y/N)");
                    boolean canFly = Utils.getBoolean("Update Your Pigeon can fly: (Y/N)");
                    p.setCanFly(canFly);
                    p.setColor(colorPigeon);
                    p.setIsHeroic(isHeroic);
                    p.setName(namePigeon);
                    p.setWeight(weightPigeon);
                    list.set(i, p);
                } else
                {
                    Snake s = (Snake) updatingAnimal;
                    String name = Utils.getString("Update your Snake's name: ");
                    double weight = Utils.getNumber("Update your Snake's weight: ", 0, 1000);
                    String color = Utils.getString("Update your Snake's color: ");
                    boolean isCreep = Utils.getBoolean("Update Your Snake Can Creep: (Y/N)");
                    boolean isPoisonous = Utils.getBoolean("Update Your Snake has poisonois: (Y/N)");
                    s.setCanCreep(isCreep);
                    s.setIsPoisonous(isPoisonous);
                    s.setName(name);
                    s.setWeight(weight);
                    s.setColor(color);
                    list.set(i, s);
                }
                }
            }
            Utils.writeToFile(url, list);
            check = true;
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        return check;
    }

    @Override
    public AnimalList delete(String url) {
        for(int i = 0; i < this.size(); i++)
        {
            Animal readFromFile = (Animal) this.get(i);
            System.out.print("\n" + (i + 1) + ". ");
            readFromFile.display();
            System.out.println("\n");
        }
        int index = Utils.getNumber("Which do you want to delete? ", 1, this.size());
        boolean confirm = Utils.getBoolean("\nAre you sure? (Y/N)");
        if(confirm)
        {
            for(int i = 0; i < this.size(); i++)
            {
                if(i == index - 1)
                {
                    Animal animal = (Animal) this.get(i);
                    this.remove(animal);
                    System.out.println("Delete successfully!");
                    break;
                }
            }
        }
        return this;
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
    public void showALl(String url) {
        
        try {
            File file = new File(url);
            if(file.exists() == false)
            {
                file.createNewFile();
            }
            AnimalList list = Utils.readFromFile(url);
            for(int i = 0; i < list.size(); i++)
            {
                Animal resultAnimal = list.get(i);
                System.out.print((i + 1) + ". ");
                resultAnimal.display();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Something Wrong!");
        } 
    }
    
}
