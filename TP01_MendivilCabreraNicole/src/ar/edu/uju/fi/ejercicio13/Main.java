package ar.edu.uju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] v1=new int [8];
		
		for(int i=0; i<v1.length; i++) {
		System.out.println("Ingrese 8 numeros:");
		int numero=sc.nextInt();
		System.out.println("Indice: " +i+ "\nNumero ingresado: "+numero);
		}
		
	}

}

