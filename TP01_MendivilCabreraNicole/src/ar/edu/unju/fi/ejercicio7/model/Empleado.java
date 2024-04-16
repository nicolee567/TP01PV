package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private String legajo;
	private Float salario;
	
	final float SALARIO_MINIMO=210000;
	final float AUMENTO_MERITO=20000;
	
	public Empleado(String nombre, String legajo, Float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if(salario>= SALARIO_MINIMO) {
			this.salario=salario;
		}else {
			this.salario=SALARIO_MINIMO;
		}
	}
	
	public Float aumentoSalario() {
		return this.salario += AUMENTO_MERITO;
		
	}
	public void mostrarDatos(){ 
		System.out.println("Datos del empleado ");
		System.out.println("Nombre y apellido del empleado:"+this.nombre);
		System.out.println("Legajo del empleado: "+this.legajo);
		System.out.println("Salario del empleado: "+this.salario);
		}
	}
	
