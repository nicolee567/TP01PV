package ar.edu.unju.fi.ejercicio8.main;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese el valor de n entero");
	    int n= sc.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
	
		calculadora.calcularSumatoria(n);
		
		System.out.println("------------------");
		
		calculadora.calcularProductoria(n);
		sc.close();
		

	}

}
