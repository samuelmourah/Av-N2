package br.edu.FigurasGeometricasPlanas;

public class Quadrado extends FigurasPlanas{
    private double lado;
    private double area;

    public Quadrado() {
    	lado = 10;
    	
    } public void setLado(double pLado) {
        lado = lado;
    } public double getLado() {
        return lado;
    } public void calcArea() {
        area = lado * lado;
    }
}


