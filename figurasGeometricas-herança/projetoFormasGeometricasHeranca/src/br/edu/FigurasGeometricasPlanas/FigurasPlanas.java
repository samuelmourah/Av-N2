package br.edu.FigurasGeometricasPlanas;

public abstract class FigurasPlanas {
	protected double area;
	
	public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
    public abstract void calcArea();
}