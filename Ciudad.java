/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ut3_1;

/**
 *
 * @author ramiro
 */
public class Ciudad {
    
    //Atributos
    private String nombre;
    private String estado;
    private int num_caballeros;
    private int num_orcos;
    
    
    //Constructores
    public Ciudad(String nombre){
        this.nombre=nombre;
        this.estado="defendida";
        this.num_caballeros=0;
        this.num_orcos=0;
    }
    
    public Ciudad(String nombre, int num_caballeros, int num_orcos){
        this.nombre=nombre;
        this.estado="defendida";
        this.num_caballeros=num_caballeros;
        this.num_orcos=num_orcos;
    }
    
    
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public int getNum_caballeros() {
        return num_caballeros;
    }

    public int getNum_orcos() {
        return num_orcos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNum_caballeros(int num_caballeros) {
        this.num_caballeros = num_caballeros;
    }

    public void setNum_orcos(int num_orcos) {
        this.num_orcos = num_orcos;
    }
    
    public void refuerzos(int num_refuerzos){
        if(this.estado!="invadida"){
            this.num_caballeros += num_refuerzos;
        }
    }
    
    public void horda(int num_orcos){
        if(this.estado!="invadida"){
            this.num_orcos += num_orcos;
        }
    }
    
    public void printEstado(){
        System.out.println("La ciudad " + this.nombre + " está " + this.estado + 
                " y tiene " + this.num_caballeros + " caballeros y " + 
                this.num_orcos + " orcos");
    }
    
    
    public void trifulca(){
        int o = this.num_orcos;
        int c = this.num_caballeros;
        
        //Reducimos ambos números
        this.num_orcos -= Math.floor(c/2);
        this.num_caballeros -= 2*o;
        
        //Comprobamos que el número de caballeros u orcos no sea negativo
        if(this.num_orcos<0)
            this.num_orcos=0;
        if(this.num_caballeros<0)
            this.num_caballeros=0;
        
        //Comprobamos s i la ciudad está invadida
        if(this.num_orcos>0 && this.num_caballeros==0){
            this.estado = "invadida";
        }
        
    }
    
}
