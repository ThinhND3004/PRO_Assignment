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
    boolean delete(String url);
    void searchByNam(String url);
    void searchByWeight(String url);
    void search(String url);
    void showByType(String url);
    void showALl(String url);
    void show(String url);
    
}
