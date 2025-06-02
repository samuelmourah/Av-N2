package br.edu.FigurasGeometricasPlanas;

public class Trapezio extends FigurasPlanas{
    private double maiorBase;
    private double menorBase;
    private double altura;
    private double area;

    public Trapezio() {
    	maiorBase = 10;
    	menorBase = 10;
    	altura = 10;
    	
    } public void setMaiorBase(double pMaiorBase) {
        maiorBase = maiorBase;
    } public double getMaiorBase() {
        return maiorBase;
    } public void setMenorBase(double pMenorBase) {
        menorBase = menorBase;
    } public double getMenorBase() {
        return menorBase;
    } public void setAltura(double pAltura) {
        altura = altura;
    } public double getAltura() {
        return altura;
    } public void calcArea() {
        area = ((maiorBase + menorBase) * altura) / 2;
    }
}
	

