package com.mycompany.tareaprog03_2;
//@author Nacho
public class Complejo {
    //Variables
    double real;
    double imag;
    
    //Constructores
    public Complejo() {
        real = 0;
        imag = 0;
    }
    
    //Metodos
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double consulta_Real() {
        return real;
    }

    public double consulta_Imag() {
        return imag;
    }

    public void cambia_Real(double real) {
        this.real = real;
    }
    
    public setReal(){
        this.real = 10*real;
    }
    
    public void cambia_Imag(double imag) {
        this.imag = imag;
    }
    
    @Override
    public String toString() {
        return String.format("%.0f + %.0fi", real, imag);
    }

    public void sumar(Complejo b) {
        double sumaReal;
        double sumaImag;
        sumaReal = b.real + this.real;
        sumaImag = b.imag + this.imag; 
        System.out.printf("La parte real (%.2f y %.2f) es igual a %.2f\n", this.real, b.real, sumaReal);
        System.out.printf("La parte imaginaria (%.2f y %.2f) es igual a %.2f\n", this.imag, b.imag, sumaImag);
    }
}
