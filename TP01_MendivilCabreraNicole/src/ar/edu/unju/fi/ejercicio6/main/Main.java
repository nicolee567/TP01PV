package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
//import java.time.Period;
import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear el objeto persona
		// instanciar un objeto de tipo persona
		Persona persona1 = new Persona();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese el dni:");
		String dni= sc.next();
		
		System.out.print("Ingrese nombre:");
		String nombre= sc.next();
	
		System.out.print("Ingrese el fecha de nacimiento(DD/MM/YY):");
		String fechaString= sc.next();
		
		System.out.print("Ingrese provincia:");
		String provincia= sc.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YY");
		LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);
		System.out.println(formatter.format(fechaNacimiento));
		
		//System.out.println(persona1);
		
		
		
		//Persona persona2= new Persona("41300625","Nicole", LocalDate.of(1998, 6, 20), "Jujuy"); 
		//Persona persona3= new Persona("36987421", "Rosa", LocalDate.of(1990,4,11));
		
		//persona3.setProvincia("Jujuy");
		//System.out.println(persona3.getProvincia());
		
		//int edad= persona1.calcularEdad();
		//persona1.verificarMayor(edad);
		
		//persona1.mostrarDatos(edad);
		
		//int edad= persona2.calcularEdad();
		//persona2.verificarMayor(edad);
		//persona2.mostrarDatos(edad);
	}

}
