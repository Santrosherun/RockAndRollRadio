/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.persona.Artista;
import core.persona.Invitado;
import core.persona.Locutor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author sddva
 */
public class RockRollRadio {
    private ArrayList<Artista> artistas;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;

    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }
    
    public void addLocutor(Locutor locutor){
        if(!this.locutores.contains(locutor)){
            this.locutores.add(locutor);
        }
    }
    
    public Locutor getLocutor(int index){
        return this.locutores.get(index);
    }
    
    public void addPrograma(Programa programa){
        if(!this.programas.contains(programa)){
            this.programas.add(programa);
        }
    }
    
    public void addArtista(Artista artista){
        if(!this.artistas.contains(artista)){
            this.artistas.add(artista);
        }
    }
    
    public Artista getArtista(int index){
        return this.artistas.get(index);
    }
    
    public void addCancion(Cancion cancion){
        if(!this.canciones.contains(cancion)){
            canciones.add(cancion);
        }
    }
    
    public Programa getPrograma(int index){
        return this.programas.get(index);
    }
    
    public boolean addEmision(Emision emision){
        return true;
    }
    
    public void addInvitado(Invitado invitado, Emision emision){
        if(!this.invitados.contains(invitado)){
            this.invitados.add(invitado);
            invitado.addEmision(emision);
            emision.addInvitado(invitado);
        }
    }
    
    public Cancion getCancion(int index){
        return this.canciones.get(index);
    }
    
    public ArrayList<Artista> getArtistas(){
        return artistas;
    }
    
    public Programa getProgramaConMasCancionesDeArtista(Artista artista){
        Map<Programa, Integer> frecuencia = new LinkedHashMap<>();
        for(Programa programa : this.programas){
            frecuencia.put(programa, 0);
        }
        
        for(Programa programa : this.programas){
            int contador = 0;
            for(Emision emision : programa.getEmisiones()){
                for(Cancion cancion : emision.getCanciones()){
                    if(cancion.getArtista() == artista){
                        contador++;
                    }
                }
            }
            frecuencia.put(programa, contador);
        }
        int max = Collections.max(frecuencia.values());
        for(Programa programa : frecuencia.keySet()){
            if(frecuencia.get(programa) == max){
                return programa;
            }
        }
        return null;
    }
}
