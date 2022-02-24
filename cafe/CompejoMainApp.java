package profeb.clases.cafe;

public class CompejoMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo[] arrayComplejo= new Complejo[5];
		
		Complejo c1= new Complejo(3.0,2.0);
		Complejo c2= new Complejo(2.0,2.0);
		Complejo c3= new Complejo(3.0,2.0);
		
		arrayComplejo[0]=c1;
		arrayComplejo[1]=c2;
		arrayComplejo[2]=c3;
		arrayComplejo[arrayComplejo.length-1]= new Complejo(3,2);
		
		arrayComplejo[0].suma(arrayComplejo[2]);
		Complejo c4 = arrayComplejo[arrayComplejo.length-1];
		Complejo resultadoSuma=(c1).suma(c2);
		resultadoSuma=(c2).suma(c1);
		System.out.println(resultadoSuma=(c2).suma(c1));
		System.out.println(c1.equals(c3));
	}

}
