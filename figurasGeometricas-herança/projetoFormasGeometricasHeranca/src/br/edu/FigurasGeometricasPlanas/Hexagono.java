package br.edu.FigurasGeometricasPlanas;

public class Hexagono extends FigurasPlanas{
	    private double lado;
	    private double area;

	    public Hexagono() {
	    	lado = 10;
	    	
	    } public void setLado(double pLado) {
	        lado = lado;
	    } public double getLado() {
	    	return lado;
	    } public void calcArea() {
	        area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
	    }
	}

