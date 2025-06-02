package br.edu.principal;

import br.edu.figurasgeometricasplanas.Circulo;
import br.edu.figurasgeometricasplanas.Hexagono;
import br.edu.figurasgeometricasplanas.Losango;
import br.edu.figurasgeometricasplanas.Paralelogramo;
import br.edu.figurasgeometricasplanas.Pentagono;
import br.edu.figurasgeometricasplanas.Quadrado;
import br.edu.figurasgeometricasplanas.Retangulo;
import br.edu.figurasgeometricasplanas.Trapezio;
import br.edu.figurasgeometricasplanas.Triangulo;
import br.edu.figurasgeometricasespaciais.Cilindro;
import br.edu.figurasgeometricasespaciais.Cone;
import br.edu.figurasgeometricasespaciais.Cubo;
import br.edu.figurasgeometricasespaciais.Esfera;
import br.edu.figurasgeometricasespaciais.Paralelepipedo;
import br.edu.figurasgeometricasespaciais.Piramide;
import br.edu.figurasgeometricasespaciais.Tetraedro;
import br.edu.figurasgeometricasespaciais.prisma;
public class Principal {
	    public static void main(String[] args) {

	        System.out.println("FIGURAS GEOMÉTRICAS PLANAS");
	        
	        System.out.println(" ");
	        System.out.println("Triângulo");
	        Triangulo fg1 = new Triangulo();
	        fg1.setAltura(5);
	        fg1.setBase(5);
	        fg1.calcArea();
	        fg1.mostrarArea();
	        fg1.getArea();

	        
	        Quadrado fg2 = new Quadrado();
	        fg2.setLado(14);
	        fg2.calcularArea();
	        fg2.mostrarArea();
	        fg2.getArea();

	        
	        Retangulo fg3 = new Retangulo();
	        fg3.setAltura(13);
	        fg3.setBase(5);
	        fg3.calcArea();
	        fg3.mostrarArea();
	        fg3.getArea();

	        
	        Circulo fg4 = new Circulo();
	        fg4.calcularArea();
	        fg4.getRaio()
;	        fg4.mostrarArea();
	        fg4.getArea();

	        
	        Losango fg5 = new Losango();
	        fg5.setMaiorDiagonal(0);
	        fg5.setMenorDiagonal(5);
	        fg5.calcArea();
	        fg5.mostrarArea();
	        fg5.getArea();

	        
	        Trapezio fg6 = new Trapezio();
	        fg6.setBaseMaior(0);
	        fg6.setBaseMenor(5);
	        fg6.setAltura(5);
	        fg6.getArea();
	        fg6.mostrarArea();
	        fg6.getArea();

	       
	        Paralelogramo fg7 = new Paralelogramo();
	        fg7.setAltura(5);
	        fg7.setBase(5);
	        fg7.getArea();
	        fg7.mostrarArea();
	        fg7.getArea();

	        
	        Hexagono fg8 = new Hexagono();
	        fg8.setLado(5);
	        fg8.calcularArea();
	        fg8.mostrarArea();
	        fg8.getArea();

	        System.out.println(" ");
	        System.out.println("Pentágono");
	        Pentagono fg9 = new Pentagono();
	        fg9.setPerimetro(0);
	        fg9.setApotema(5);
	        fg9.calcArea();
	        fg9.mostrarArea();
	        fg9.getArea();

	        
	        System.out.println("");
	        System.out.println("Cubo");
	        Cubo fg10 = new Cubo();
	        fg10.setAresta(10);
	        fg10.calcAreaBase();
	        fg10.calcAreaLateral();
	        fg10.calcAreaTotal();
	        fg10.calcVolume();
	        fg10.mostrarAreaBase();
	        fg10.mostrarAreaLateral();
	        fg10.mostrarAreaTotal();
	        fg10.mostrarVolume();
	        fg10.calcAreaBase();
	        fg10.getAreaLateral();
	        fg10.getAreaTotal();
	        fg10.getVolume();
	        
	        System.out.println("");
	        System.out.println("Prisma");
	        prisma fg11 = new prisma();
	        fg11.setAresta(6);
	        fg11.setBase(5);
	        fg11.setLateral(5);
	        fg11.calcAreaBase();
	        fg11.calcAreaLateral();
	        fg11.calcAreaTotal();
	        fg11.calcVolume();
	        fg11.mostrarAreaBase();
	        fg11.mostrarAreaLateral();
	        fg11.mostrarAreaTotal();
	        fg11.mostrarVolume();
	        fg11.getAreaBase();
	        fg11.getAreaLateral();
	        fg11.getAreaTotal();
	        fg11.getVolume();
	        
	       
	        Esfera fg12 = new Esfera();
	        fg12.setRaio(12);
	        fg12.calcArea();
	        fg12.calcVolume();
	        fg12.mostrarArea();
	        fg12.mostrarVolume();
	        fg12.getArea();
	        fg12.getVolume();
	        
	        
	        Piramide fg13 = new Piramide();
	        fg13.setLado(5);
	        fg13.setLadoBase(5);
	        fg13.setAltura(5);
	        fg13.calcAreaBase();
	        fg13.calcAreaLateral();
	        fg13.calcAreaTotal();
	        fg13.calcVolume();
	        fg13.mostrarAreaBase();
	        fg13.mostrarAreaLateral();
	        fg13.mostrarAreaTotal();
	        fg13.mostrarVolume();
	        fg13.calcAreaBase();
	        fg13.getAreaLateral();
	        fg13.getAreaTotal();
	        fg13.getVolume();
	        
	        
	        Cone fg14 = new Cone();
	        fg14.setRaio(8);
	        fg14.setGeratriz(5);
	        fg14.setAltura(5);
	        fg14.calcAreaBase();
	        fg14.calcAreaLateral();
	        fg14.calcAreaTotal();
	        fg14.calcVolume();
	        fg14.mostrarAreaBase();
	        fg14.mostrarAreaLateral();
	        fg14.mostrarAreaTotal();
	        fg14.mostrarVolume();
	        fg14.calcAreaBase();
	        fg14.getAreaLateral();
	        fg14.getAreaTotal();
	        fg14.getVolume();
	        
	        
	        Cilindro fg15 = new Cilindro();
	        fg15.setRaio(9);
	        fg15.setAltura(5);
	        fg15.calcAreaBase();
	        fg15.calcAreaTotalBase();
	        fg15.calcAreaLateral();
	        fg15.calcAreaTotal();
	        fg15.calcVolume();
	        fg15.mostrarAreaBase();
	        fg15.mostrarAreaTotalBase();
	        fg15.mostrarAreaLateral();
	        fg15.mostrarAreaTotal();
	        fg15.mostrarVolume();
	        fg15.calcAreaBase();
	        fg15.calcAreaTotalBase();
	        fg15.getAreaLateral();
	        fg15.getAreaTotal();
	        fg15.getVolume();
	        
	        
	        Paralelepipedo fg16 = new Paralelepipedo();
	        fg16.setComprimento(10);
	        fg16.setLargura(5);
	        fg16.setAltura(5);
	        fg16.calcAreaBase();
	        fg16.calcAreaTotal();
	        fg16.calcVolume();
	        fg16.mostrarAreaBase();
	        fg16.mostrarAreaTotal();
	        fg16.mostrarVolume();
	        fg16.calcAreaBase();
	        fg16.getAreaTotal();
	        fg16.getVolume();
	        
	        
	        Tetraedro fg17 = new Tetraedro();
	        fg17.setAresta(11);
	        fg17.calcAreaBase();
	        fg17.calcVolume();
	        fg17.mostrarAreaBase();
	        fg17.mostrarVolume();
	        fg17.calcAreaBase();
	        fg17.getVolume();
	        
	    }
	}

