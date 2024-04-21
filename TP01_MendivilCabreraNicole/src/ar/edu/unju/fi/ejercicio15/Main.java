package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese un numero entre[5,10]");
		int i=sc.nextInt();
		String [] nombres=new String[i];
		if((i>=5) && (i<=10)) {
			for(i=0; i<=nombres.length; i++){
				System.out.println("Ingrese nombre de una persona");
				String nombre= sc.next();	

				System.out.println("Posicion: " +i+ "\nNombre ingresado: "+nombre);
		}
			System.out.println("Mostrar nombres desde el final del array");
			for(i=nombres.length; i>=0; i--){
				
				System.out.println("Posicion: " +i+ "\nNombre ingresado: "+nombre);
				
		}
				
}
}
}
