/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    private int x;
    private int y;
    private Image imagen;
    public Jugador(int ancho, int alto, int x, int y) throws FileNotFoundException {
        this.ancho = ancho;
        this.alto = alto;
        this.luks=0;
        this.x=x;
        this.y=y;
        FileInputStream image = new FileInputStream("src/image/prota.png");
        this.imagen=new Image(image);
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
