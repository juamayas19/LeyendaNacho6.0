/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

import javafx.scene.image.Image;

/**
 *
 * @author LENOVO
 */
public class Jugador {
    private int atack;
    private int defense;
    private int ancho;
    private int alto;
    private Chaza inventario;
    private int luks;
    public Jugador(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.luks=0;
        this.inventario= new Chaza(20,20);
        
    }
    public int getAncho() {
        return ancho;
    }
    public int getAlto() {
        return alto;
    }
    public void buy(Chaza chaza, int i){
        String name= chaza.getInventory().get(i).getName();
        int atack= chaza.getInventory().get(i).getAtack();
        int value= chaza.getInventory().get(i).getValue();
        int defense= chaza.getInventory().get(i).getDefense();
        Image image= chaza.getInventory().get(i).getImage();
        Items item = new Items(name, atack, value, defense, image);
        this.inventario.getInventory().add(item);
        chaza.getInventory().remove(i);
    }
    public void useItem(int i){
        this.atack+=this.inventario.getInventory().get(i).getAtack();
        this.defense+=this.inventario.getInventory().get(i).getDefense();
        this.inventario.getInventory().remove(i);
    }
    

   
    

    
}
