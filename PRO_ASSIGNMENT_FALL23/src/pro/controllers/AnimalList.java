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
        subMenu.addItem("\nWhich animal do you wanna add?");
        subMenu.addItem("1. Snake");
        subMenu.addItem("2. Tiger");
        subMenu.addItem("2. Pengiun");
        subMenu.addItem("3. Pegion");
        int subChoice;
        AnimalList container = null;
        boolean out = true;
        try {
            container = Utils.readFromFile(url);
            
            do {                        
            subMenu.showMenu();
            subChoice = subMenu.getChoice();
            switch (subChoice)
            {
                case 1:
                    String name = Utils.getString("Input your new Snake's name: ");
                    int weight = Utils.getNumber("Input your new Snake's weight: ", 0, 1000);
                    String color = Utils.getString("Input your new Snake's color: ");
                    boolean isCreep = Utils.getBoolean("Your New Snake Can Creep: (Y/N)");
                    boolean isPoisonous = Utils.getBoolean("Your New Snake has poisonois: (Y/N)");
                    Snake newSnake = new Snake(isCreep, isPoisonous, name, weight, color);
                    container.add(newSnake);
                    break;
                case 2:
                    String nameTiger = Utils.getString("Input your new Tiger's name: ");
                    int weightTiger = Utils.getNumber("Input your new Tiger's weight: ", 0, 1000);
                    String colorTiger = Utils.getString("Input your new Tiger's color: ");
                    boolean canRun = Utils.getBoolean("Your New Tiger Can Run: (Y/N)");
                    boolean canGrowl = Utils.getBoolean("Your New Tiger Can Growl: (Y/N)");
                    boolean isDangerous = Utils.getBoolean("Your New Tiger Is Dangerous: (Y/N)");
                    boolean diet = Utils.getBoolean("Your New Tiger Diet: (Y/N)");
                    boolean eatRawMeat = Utils.getBoolean("Your New Tiger Eat Raw Meat: (Y/N)");
                    Tiger newTiger = new Tiger(canRun, canGrowl, isDangerous, diet, eatRawMeat, nameTiger, weightTiger, colorTiger);
                    container.add(newTiger);
                    break;
                case 3:
                    String namePengiun = Utils.getString("Input your new Pengiun's name: ");
                    int weightPengiun = Utils.getNumber("Input your new Pengiun's weight: ", 0, 1000);
                    String colorPengiun = Utils.getString("Input your new Pengiun's color: ");  
                    boolean canWalk = Utils.getBoolean("Your New Pengiun Can Walk: (Y/N)");
                    boolean canMakeSound = Utils.getBoolean("Your New Pengiun can make soung: (Y/N)");
                    boolean isCute = Utils.getBoolean("Your New Pengiun is cute: (Y/N)");
                    Penguin newPenguin = new Penguin(canWalk, canMakeSound, isCute, namePengiun, weightPengiun, colorPengiun);
                    container.add(newPenguin);
                    break;
                case 4:
                    String namePigeon = Utils.getString("Input your new Pigeon's name: ");
                    int weightPigeon = Utils.getNumber("Input your new Pigeon's weight: ", 0, 1000);
                    String colorPigeon = Utils.getString("Input your new Pigeon's color: ");
                    boolean isHeroic = Utils.getBoolean("Your New Pigeon is heroic: (Y/N)");
                    boolean canFly = Utils.getBoolean("Your New Pigeon can fly: (Y/N)");
                    Pigeon newPigeon = new Pigeon(isHeroic, canFly, namePigeon, weightPigeon, colorPigeon);
                    container.add(newPigeon);
                    break;
            }  
            out = Utils.getBoolean("\n\nDo you wanna continue to add animal? (Y/N)");
        } while (out);
        } catch (Exception e) {
        }
        
        File file = new File(url);
        try {
            if(file.exists() == false)
            {
                file.createNewFile();
            }
            Utils.writeToFile(url, container);
        } catch (Exception e) {
        } 
        System.out.println("\nYou had added " + container.size() + " animal(s)");
        for (int i = 0; i < container.size(); i++) {
            Animal animalResult = container.get(i);
            System.out.print("\n" + (i + 1) + ". ");
            animalResult.display();
        }
    }

    @Override
    public boolean update(String url) {
        boolean check = false;
        try {
            AnimalList list = Utils.readFromFile(url);
            for(int i = 0; i < list.size(); i++)
            {
                Animal resultAnimal = list.get(i);
                System.out.print("\n" + (i + 1) + ". ");
                resultAnimal.display();
            }
            int choice = Utils.getNumber("\nWhich do you want to update?", 1, list.size());
            for(int i = 0; i < list.size(); i++)
            {
                if(i == (choice - 1))
                {
                    Animal updatingAnimal = (Animal) list.get(i);
                    if (updatingAnimal instanceof Tiger) {
                    Tiger t = (Tiger) updatingAnimal;
                    String nameTiger = Utils.getString("Update your Tiger's name: ");
                    int weightTiger = Utils.getNumber("Update your Tiger's weight: ", 0, 1000);
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
                    int weightPengiun = Utils.getNumber("Update your Pengiun's weight: ", 0, 1000);
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
                    int weightPigeon = Utils.getNumber("Update your Pigeon's weight: ", 0, 1000);
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
                    int weight = Utils.getNumber("Update your Snake's weight: ", 0, 1000);
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
    public boolean delete(String url) {
        boolean check = false;
        AnimalList animalList;
        try {
            animalList = Utils.readFromFile(url);
        
        for(int i = 0; i < animalList.size(); i++)
        {
            Animal readFromFile = animalList.get(i);
            System.out.print("\n" + (i + 1) + ". ");
            readFromFile.display();
            System.out.println("\n");
        }
        int index = Utils.getNumber("\nWhich do you want to delete? ", 1, animalList.size());
        boolean confirm = Utils.getBoolean("\nAre you sure? (Y/N)");
        if(confirm)
        {
            for(int i = 0; i < animalList.size(); i++)
            {
                if(i == index - 1)
                {
                    Animal animal = (Animal) animalList.get(i);
                    animalList.remove(animal);
                }
            }
            Utils.writeToFile(url, animalList);
            check = true;
        }
        } catch (IOException ex) {
        }
        return check;
    }


    public void show(String url)
    {
        I_Menu showMenuSubMenu = new Menu();
        showMenuSubMenu.addItem("\nWhat kind do you want to show?");
        showMenuSubMenu.addItem("1. Show by type");
        showMenuSubMenu.addItem("2. Show all");
        int choice;
        
        boolean cont = false;            
        showMenuSubMenu.showMenu();
        choice = showMenuSubMenu.getChoice();
        switch (choice)
        {
            case 1:
                showByType(url);
                break;
            case 2:
                showALl(url);
                break;
        }
        
    }
    
    @Override
    public void showByType(String url) {
        I_Menu showMenuSubMenu2 = new Menu();
        showMenuSubMenu2.addItem("\n\nWhat type of animal do you want to show?");
        showMenuSubMenu2.addItem("1. Four-legged animals");
        showMenuSubMenu2.addItem("2. Zero-legged animals");
        showMenuSubMenu2.addItem("3. Bipedal and Flightless animals");
        showMenuSubMenu2.addItem("4. Bipedal And Flying Animals");
        int choice2;
        
        showMenuSubMenu2.showMenu();
        try {
            AnimalList animal = Utils.readFromFile(url);
            choice2 = showMenuSubMenu2.getChoice();
            AnimalList result = new AnimalList();
            switch (choice2) {
                case 1:
                    for (Animal animalResearch : animal) {
                        if (animalResearch.getType().equals("Four-legged animals")) {
                            result.add(animalResearch);
                        }
                    }

                    for (int i = 0; i < result.size(); i++) {
                        System.out.print("\n" + (i + 1) + ". ");
                        Animal animalView = result.get(i);
                        animalView.display();
                    }
                    break;
                case 2:
                    for(Animal animalReseach : animal)
                    {
                        if(animalReseach.getType().equals("Zero-legged animals"))
                        {
                            result.add(animalReseach);
                        }
                    }
                    for(int i = 0; i < result.size(); i++)
                    {
                        System.out.print("\n" + (i + 1) + ". ");
                        Animal animalView = result.get(i);
                        animalView.display();
                    }
                    break;
                case 3:
                    for(Animal animalReseach : animal)
                    {
                        if(animalReseach.getType().equals("Bipedal and Flightless animals"))
                        {
                            result.add(animalReseach);
                        }
                    }
                    for(int i = 0; i < result.size(); i++)
                    {
                        System.out.print("\n" + (i + 1) + ". ");
                        Animal animalView = result.get(i);
                        animalView.display();
                    }
                    break;
                case 4:
                    for(Animal animalReseach : animal)
                    {
                        if(animalReseach.getType().equals("Bipedal And Flying Animals"))
                        {
                            result.add(animalReseach);
                        }
                    }
                    for(int i = 0; i < result.size(); i++)
                    {
                        System.out.print("\n" + (i + 1) + ". ");
                        Animal animalView = result.get(i);
                        animalView.display();
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } catch (Exception e) {
        }
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
                System.out.print("\n" + (i + 1) + ". ");
                resultAnimal.display();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("\nSomething Wrong!");
        } 
    }

    @Override
    public void searchByNam(String url) {
        try {
            AnimalList container = Utils.readFromFile(url);
            String name = Utils.getString("\nWhat is your animal's name?");
            AnimalList resultContainer = null;
            for(Animal animal : container)
            {
                if(animal.getName().equals(name))
                {
                    resultContainer.add(animal);
                }
            }
            if(resultContainer == null)
            {
                System.out.println("\nDo not have any animals with name: " + name);
            } else
            {
                for(int i = 0; i < resultContainer.size(); i++)
                {
                    System.out.println("\n" + (i + 1) + ". ");
                    Animal animalShow = resultContainer.get(i);
                    animalShow.display();
                }
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void searchByWeight(String url) {
        try {
            AnimalList container = Utils.readFromFile(url);
            AnimalList resultContainer = new AnimalList();
            int weight = Utils.getNumber("\nHow much does your animal weigh?", 0, 10000);
            for (Animal animal : container) {
                if (animal.getWeight() == weight) {
                    resultContainer.add(animal);
                }
            }
            if (resultContainer.size() == 0) {
                System.out.println("\nDo not have any animals with weight: " + weight);
            } else {
                for (int i = 0; i < resultContainer.size(); i++) {
                    System.out.println("\n" + (i + 1) + ". ");
                    Animal animalShow = resultContainer.get(i);
                    animalShow.display();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void search(String url) {
        I_Menu subMenu = new Menu();
        subMenu.addItem("\nWhat kind of searching do you want?");
        subMenu.addItem("1. Search by name");
        subMenu.addItem("2. Search by weight");
        subMenu.showMenu();
        int subChoice = subMenu.getChoice();
        
        switch(subChoice)
        {
            case 1:
                searchByNam(url);
                break;
            case 2:
                searchByWeight(url);
                break;
        }
        
    }
    
}
