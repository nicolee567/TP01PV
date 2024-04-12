package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1 y 9: ");
		int numero =scanner.nextInt();
		
        int resultado=0;  
        System.out.println("Tabla de multiplicar del "+numero);
		for(int i=0;i <= 10;i++) {
			resultado=numero*i;
			System.out.println(numero+" * "+i+" = "+resultado);	
		}
	}
}
