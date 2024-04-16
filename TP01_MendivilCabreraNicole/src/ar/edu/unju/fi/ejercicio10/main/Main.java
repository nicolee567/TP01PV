package ar.edu.unju.fi.ejercicio10.main;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        Pizza pizza= new Pizza();
      
        int n=1;
		while(n<=3) {
		System.out.println("Ingrese diametro de la pizza nº "+n);
		System.out.println("Valores permitidos:20,30 o 40");
	    pizza.setDiametro(sc.nextFloat());
	    
	    System.out.println("¿Desea ingredientes especiales?(true/false)");
	    pizza.setIngredientesEsp(sc.nextBoolean());
	    
	    
	    n++;
	    System.out.println("***Pizza "+n+" ***");
	    System.out.println("Diametro: "+pizza.getDiametro());
	    System.out.println("Ingredientes especiales: "+pizza.getIngredientesEsp());
	    System.out.println("Precio Pizza $"+pizza.calcularPrecio());
	    
	   
		}
		sc.close();	
		
	}


	}