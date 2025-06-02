package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
	private  double base;
    private double altura;
    private double area;

    
    public Paralelogramo() {
        base = 0;
        altura = 0;
        area = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double novaBase) {
        base = novaBase;
        calcularArea();      }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
        calcularArea();      }

    public double getArea() {
        return area;
    }

    private void calcularArea() {
        area =( base * altura);
    }

    public void mostrarArea() {
        System.out.println();
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do paralelogramo é: " + area);
        return area;
    }
}

