/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;
import jdk.jfr.events.FileWriteEvent;
import pro.controllers.AnimalList;
import pro.controllers.Menu;
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
public class ZooManagement {
    
    public static void main(String[] args) throws IOException {
        String url = "AnimalStorage.txt";
        File file = new File(url);
        I_Menu menu = new Menu();
        menu.addItem("\n1. Add Animal");
        menu.addItem("2. Update Animal");
        menu.addItem("3. Delete Animal");
        menu.addItem("4. Search Aniaml");
        menu.addItem("5. Show Animal");
        menu.addItem("0. Quit");
        int choice;
        boolean cont = true;
        I_Animal animal = new AnimalList();
        do {            
            menu.showMenu();
            choice = menu.getChoice();
            switch(choice)
            {
                case 0: //out
                    cont = false;
                    break;
                case 1: 
                    animal.add(url);
                    break;
                case 2: //update animal
                    if(animal.update(url))
                    {
                        System.out.println("Update successfully!");
                        animal.showALl(url);
                    } else System.out.println("Something wrong!");
                    break;
                case 3: //delete animal
                    
                    AnimalList listAnimal = animal.delete(url);
                    Utils.writeToFile(url, listAnimal);
                    
                    break; 
                case 4:
                    
                    break;
                case 5://showAll
                    animal.showALl(url);
                    break;     
            }
        } while (cont);
    }
    
    
}
