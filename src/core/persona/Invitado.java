/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.Emision;
import java.util.ArrayList;

/**
 *
 * @author sddva
 */
public class Invitado extends Persona{
    private ArrayList<Emision> emisiones;

    public Invitado(String nombre) {
        super(nombre);
        this.emisiones = new ArrayList<>();
    }
    
    public void addEmision(Emision emision){
        if(!this.emisiones.contains(emision)){
            this.emisiones.add(emision);
        }
    }
    
}
