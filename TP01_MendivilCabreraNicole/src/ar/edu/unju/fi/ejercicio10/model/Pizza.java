package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Float diametro;
	private Integer precio;
	private Double area;
	private Boolean ingredientesEsp;
	
	final Integer ADICIONAL20=500;
	final Integer ADICIONAL30=750;
	final Integer ADICIONAL40=1000;
	final Double PI=3.14159;
	
	
	public Integer calcularPrecio() {
		precio=0;
		if((diametro==20) && (ingredientesEsp=false)) {
			return precio= 4500 ;
			//System.out.println("Precio $"+precio);
		}else {
			if((diametro==20) && (ingredientesEsp=true)) {
				return precio=4500+ ADICIONAL20;
				//System.out.println("Precio $"+precio);
			}
		} 
		
		if((diametro==30) && (ingredientesEsp=false)) {
			return precio=4800;
			//System.out.println("Precio $"+precio);
		}else {
			if((diametro==30) && (ingredientesEsp=true)) {
				return precio=4800+ ADICIONAL30;
				//System.out.println("Precio $"+precio);
		} 
		}
		
		if((diametro==40) && (ingredientesEsp=false)) {
			return precio=5500;
			//System.out.println("Precio $"+precio);
		}else {
			if((diametro==40) && (ingredientesEsp=true)) {
				return precio=5500+ ADICIONAL40;
				//System.out.println("Precio $"+precio);
		}
		}
		return precio;	
	}
	
	public Double calcularArea(){
		Double resultado;
		resultado=Math.pow(diametro,2);
		area=PI*(resultado)/4;
		System.out.println("Área de la pizza: "+area);
		return area;
	}

	public Float getDiametro() {
		return diametro;
	}

	public void setDiametro(Float diametro) {
		this.diametro = diametro;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Boolean getIngredientesEsp() {
		return ingredientesEsp;
	}

	public void setIngredientesEsp(Boolean ingredientesEsp) {
		this.ingredientesEsp = ingredientesEsp;
	}

	public Integer getADICIONAL_IE_20() {
		return ADICIONAL_IE_20;
	}

	public Integer getADICIONAL_IE_30() {
		return ADICIONAL_IE_30;
	}

	public Integer getADICIONAL_IE_40() {
		return ADICIONAL_IE_40;
	}

	public Double getPI() {
		return PI;
	}	
	
	
}
