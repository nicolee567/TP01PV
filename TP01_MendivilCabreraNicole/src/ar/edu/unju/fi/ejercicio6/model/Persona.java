package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;

	// CONSTRUCTOR POR DEFECTO
	public Persona() { // persona1
		System.out.println("Se ha creado el objeto 1");
	}

	// persona2
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
		System.out.println("Se ha creado el objeto 2");
	}

	// persona3
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		System.out.println("Se ha creado el objeto 3");
	}

	public int calcularEdad() {
		LocalDate fechaA = fechaNacimiento;
		LocalDate fechaB = LocalDate.now();
		Period periodo = Period.between(fechaA, fechaB);
		System.out.printf("Periodo %s y %s" + " hay %d años, %d meses" + " y %d dias%n", fechaA, fechaB,
				periodo.getYears(), periodo.getMonths(), periodo.getDays());
		System.out.println("La persona tiene: " + periodo.getYears() + " años");
		return periodo.getYears();
	}

	public void verificarMayor(int edad) {
		if (edad >= 18) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}
	}

	public void mostrarDatos(int edad) {
		System.out.printf("Datos de la persona: \n");
		System.out.println("Nombre: " + nombre);
		System.out.println("Dni: " + dni);
		if (edad >= 18) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
