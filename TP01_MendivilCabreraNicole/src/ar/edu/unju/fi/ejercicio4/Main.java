package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 10: ");
		int numero =scanner.nextInt();
		int i=1;
		int factorial=1;
		
		while(i<=numero) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("El factorial de "+numero+" es: "+factorial);
	}
}
