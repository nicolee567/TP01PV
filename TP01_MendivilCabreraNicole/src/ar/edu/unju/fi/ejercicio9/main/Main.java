package ar.edu.unju.fi.ejercicio9.main;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import ar.edu.unju.fi.ejercicio9.model.Producto;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Producto producto= new Producto();
      
        int n=1;
		while(n<=3) {
		System.out.println("Ingrese nombre del producto nº "+n );
	    producto.setNombre(sc.next());
	    
	    System.out.println("Ingrese codigo del producto");
	    producto.setCodigo(sc.next());
	    
	    System.out.println("Ingrese precio del producto");
	    producto.setPrecio(sc.nextFloat());
	   
	    System.out.println("Ingrese descuento del producto(entre 0 y 50%)");
	    producto.setDescuento(sc.nextByte());
	    
	   System.out.println("Datos ingresadoa del producto nº"+n);
	   System.out.println("Nombre: "+producto.getNombre());
	   System.out.println("Codigo: "+producto.getCodigo());
	   System.out.println("Precio: $"+producto.getPrecio());
	   System.out.println("Descuento: "+producto.getDescuento()+"%");
	   producto.calcularDescuento();
	   n++;
	   
		}
        	
		 sc.close();
	}

}
