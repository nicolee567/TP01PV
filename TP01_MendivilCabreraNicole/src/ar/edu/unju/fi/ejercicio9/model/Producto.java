package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private Float precio;
	private Byte descuento;
	
	
	public Producto() { //CONSTRUCTOR POR DEFECTO
		
	}
	public Float calcularDescuento() {
		float precioDesc=0;
		if(descuento>0) {
			precioDesc= (descuento*precio)/100;
			System.out.println("El precio con descuento es: $"+precioDesc);
		}else {
			System.out.println("El producto no tiene descuento");
		}
		return precioDesc;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Byte getDescuento() {
		return descuento;
	}
	public void setDescuento(Byte descuento) {
		this.descuento = descuento;
	}
	
	
}
