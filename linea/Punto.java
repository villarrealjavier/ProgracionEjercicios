package profeb.clases.linea;

import java.util.Objects;

public class Punto {
	private Double ejeX;
	private Double ejeY;
	
	
	
	//CONSTRUCTOR
	public Punto(double ejeX, double ejeY) {
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}
	
	
	//GETTERS AND SETTERS
	public double getEjex() {
		return ejeX;
	}
	public void setEjex(double punto1) {
		this.ejeX = punto1;
	}
	public double getEjey() {
		return ejeY;
	}
	public void setEjey(double punto2) {
		this.ejeY = punto2;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ejeX, ejeY);
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales=true;
		}else {
			Punto other = (Punto) obj;
			if (other != null && (other.getEjex().eqq))
		}
			
		
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(ejeX) == Double.doubleToLongBits(other.ejeX)
				&& Double.doubleToLongBits(ejeY) == Double.doubleToLongBits(other.ejeY);
	}


	@Override
	public String toString() {
		return "Punto [ejeX=" + ejeX + ", ejeY=" + ejeY + "]";
	}
	
}
