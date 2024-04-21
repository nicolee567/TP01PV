package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese un numero entre[3,10]");
		int i=sc.nextInt();
		int [] v1=new int [i];
		int suma=0;
		for(i=0;i<=v1.length;i++){
			System.out.println("Ingrese un numero para cargar el vector");
			int numero=sc.nextInt();
			suma=suma+numero;
			System.out.println("Posicion: " +i+ "\nNumero ingresado: "+numero);
		}
		System.out.println("Suma de los valores del vector: "+suma);
	}
	

}
