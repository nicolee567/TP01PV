package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private float diametro;
	private float precio;
	private float area;
	private boolean ingredientesEsp;
	
	final int ADICIONAL_IE_20=500;
	final int ADICIONAL_IE_30=750;
	final int ADICIONAL_IE_40=1000;
	
	
	
	
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public boolean isIngredientesEsp() {
		return ingredientesEsp;
	}
	public void setIngredientesEsp(boolean ingredientesEsp) {
		this.ingredientesEsp = ingredientesEsp;
	}
	public int getADICIONAL_IE_20() {
		return ADICIONAL_IE_20;
	}
	public int getADICIONAL_IE_30() {
		return ADICIONAL_IE_30;
	}
	public int getADICIONAL_IE_40() {
		return ADICIONAL_IE_40;
	}

	
}
