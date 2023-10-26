/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.models;

import pro.controllers.AnimalList;

/**
 *
 * @author ACER
 */
public interface I_Animal {
    void add(String url);
    boolean update(String url);
    AnimalList delete(String url);
    void search(String name);
    void search(double weight);
    void show(String type);
    void showALl(String url);

    
}
