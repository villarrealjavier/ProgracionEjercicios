package profeb.clases.linea;

public class Linea {
	private Double p1;
	private Double p2;
	
	
	
	//CONSTRUCTOR
	public Linea(){
	}
	
	
	
	public Linea(Double p1, Double p2) {
		this.p1 = p1;
		this.p2 = p2;
	}



	//METODOS
	public double moverDerecha() {
	
		return 0;
	}
	
	public double moverIzquierda() {
		
		return 0;
	}
	
	public double moverArriba() {
		
		return 0;
	}
	
	public double moverAbajo() {
		
		return 0;
	}
	
	
	
	//GETTERS AND SETTERS
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
} 
