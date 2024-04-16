package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial(int n) {
		//System.out.println("Se creo la calculadora");
		this.n=n;
		
	}
	public void calcularSumatoria(int n) {
		for(int k=1 ; k<=n ;k++) {
			float expresion;
			double sumatoria=0;
			double resultado=0;
			expresion= ((k*(k+1))/2);
			resultado= Math.pow(expresion, 2);
			sumatoria=sumatoria+resultado;
			System.out.println("Resultado de la sumatoria "+k+" es: "+sumatoria);
		
		}	
	}
    public void calcularProductoria(int n) {
    	
		for(int k=1; k<=n; k++) {
			float productoria=1;
			float expresion;
			expresion= k*(k+4);
			productoria=productoria*expresion;
			//return productoria;
			
			System.out.println("Resultado de la productoria "+k+ " es: "+productoria);	
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
