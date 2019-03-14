/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author Juan Camilo
 */
public class Chaza {
    private int alto;
    private int ancho;
    private Image image;
    private ArrayList<Items>Inventory;
    
    public Chaza(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
        this.image = new Image("src/image/Inventario.png");
        this.Inventory = new ArrayList<Items>();
    }
    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }
    public Image getImage() {
        return image;
    }
    public ArrayList<Items> getInventory() {
        return Inventory;
    }
}
