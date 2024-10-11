/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Locutor;
import java.util.ArrayList;

/**
 *
 * @author sddva
 */
public class Programa {
    
    private static int ID = 0;
    
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;

    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.serial = Programa.ID;
        this.emisiones = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.locutores.add(locutor);
        this.locutores.get(0).addPrograma(this);
        Programa.ID++;
    }
    
    public void addEmision(Emision emision){
        if(!this.emisiones.contains(emision)){
            this.emisiones.add(emision);
        }
    }
    
    public Emision getLastEmision(){
        return this.emisiones.get(this.emisiones.size() - 1);
    }

    public ArrayList<Emision> getEmisiones() {
        return emisiones;
    }

    public String getNombre() {
        return nombre;
    } 
    
}
