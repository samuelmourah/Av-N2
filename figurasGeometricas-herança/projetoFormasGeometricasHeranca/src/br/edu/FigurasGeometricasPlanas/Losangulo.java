package br.edu.FigurasGeometricasPlanas;

public class Losangulo extends FigurasPlanas{
    private double maiorDiagonal;
    private double menorDiagonal;
    private double area;

    public Losangulo() {
    	maiorDiagonal = 10;
    	menorDiagonal = 10;
    	
    } public void setMaiorDiagonal(double pMaiorDiagonal) {
        maiorDiagonal = maiorDiagonal;
    } public double getMaiorDiagonal() {
        return maiorDiagonal;
    } public void setMenorDiagonal(double pMenorDiagonal) {
        menorDiagonal = menorDiagonal;
    } public double getMenorDiagonal() {
        return menorDiagonal;
    } public void calcArea() {
        area = (maiorDiagonal * menorDiagonal) / 2;
    }
}


