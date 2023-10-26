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
public interface I_Animal {
    void add();
    void update();
    void delete();
    void search(String name);
    void search(double weight);
    void show(String type);
    void showALl();
    
}
