package br.edu.FigurasGeometricasPlanas;

public class Circulo extends FigurasPlanas{
    private double raio;
    private double area;

    public Circulo() {
    	raio = 10;
    	
    } public void setRaio(double pRaio) {
        raio = raio;
    } public double getRaio() {
        return raio;
    } public void calcArea() {
        area = Math.PI * raio * raio;
    }
}


