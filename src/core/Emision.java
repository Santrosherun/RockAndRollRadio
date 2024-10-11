/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Invitado;
import java.util.ArrayList;

/**
 *
 * @author sddva
 */
public class Emision {
    
    private static int ID = 0;
    
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.programa = programa;
        this.serial = Emision.ID;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        
        this.programa.addEmision(this);
        Emision.ID++;
    }
    
    public void addInvitado(Invitado invitado){
        if(!this.invitados.contains(invitado)){
            this.invitados.add(invitado);
        }
    }
    
    public void addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
        }
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    
}
