package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int numero =scanner.nextInt();	
		
		if(numero %2 == 0) {//PAR
			numero=numero*3;
			System.out.println("El triple del numero par ingresado es: "+numero);
		}else if(numero %2 != 0){//IMPAR
			numero=numero*2;
			System.out.println("El doble del numero impar ingresado es: "+numero);
		}
	}
	

}
