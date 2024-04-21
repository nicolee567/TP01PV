package ar.edu.unju.fi.ejercicio7.main;
import ar.edu.unju.fi.ejercicio6.model.Persona;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Empleado empleado1= new Empleado("Juan Perez", "1245",  950000.75f);
		//System.out.println("Aumento de salario: $"+empleado1.aumentoSalario());
		dddddddddd
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese el nombre y apellido del empleado:");
		String nombre= sc.nextLine();
		System.out.print("Ingrese el legajo del empleado:");
		String legajo= sc.nextLine();
		System.out.print("Ingrese el salario del empleado:");
		Float salario= sc.nextFloat();
		Empleado empleado = new Empleado(nombre,legajo,salario);
		
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		System.out.println("Despues del aumento de salario: ");
		empleado.mostrarDatos();
		sc.close();
	}

}
