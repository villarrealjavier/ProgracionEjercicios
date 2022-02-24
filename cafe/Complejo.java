package profeb.clases.cafe;

import java.util.Objects;

public class Complejo {
	private Double parteReal;
	private Double parteImaginaria;
	
	
	
	//CONSTRUCTORES
	public Complejo(double parteReal,double parteImaginaria) {
		this.parteReal=parteReal;
		this.parteImaginaria=parteImaginaria;
		
		
	}
	
	
	//METODOS
	public Complejo suma(Complejo otroComplejo){
		double parteReal=this.parteReal + otroComplejo.getParteReal();
		double parteImaginaria=this.parteImaginaria+otroComplejo.getParteImaginaria();
		return new Complejo(parteReal,parteImaginaria);
	}
	
	//GETTERS AND SETTERS
	public double getParteReal() {
		return parteReal;
	}
	public void setParteReal(Double parteReal) {
		this.parteReal = parteReal;
	}
	public double getParteImaginaria() {
		return parteImaginaria;
	}
	@Override
	public int hashCode() {
		return Objects.hash(parteImaginaria, parteReal);
	}


	@Override
	public boolean equals(Object obj) {
		
		Complejo otro=(Complejo) obj;
		boolean sonIguales = false;
		if (this.parteReal.equals(otro.getParteReal()) && this.parteImaginaria.equals(otro.getParteImaginaria())) {
			sonIguales = true;
		}
		return sonIguales ;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+parteReal +" , "+ parteImaginaria+")";
	}


	public void setParteImaginaria(Double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
}
