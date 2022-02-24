package profeb.clases.matriz;

public class CrearMatriz {
	
	public static void main(String[] args) {
		crearMatrizDiagonal(3);
	}
	
	public static void crearMatrizDiagonal (int tamano){
		StringBuilder st = new StringBuilder();
		int[][] matriz =new int [tamano][tamano];
		int variable=1;
		for (int i =0; i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
					matriz[i][j]=variable;
					st.append(variable);
					variable++;
			
			}
			st.append("\n");
			
		}System.out.println(matriz);
		System.out.println(st);
		
		
	}
	public static void imprimirMatriz (int tamano) {
		StringBuilder st = new StringBuilder();
		int[][] matriz =new int [tamano][tamano];
		int variable=1;
		for (int i =0; i<matriz.length;i++) {
			for (int j=0; j<matriz[i].length;j++) {
					matriz[i][j]=variable;
					st.append(variable);
					variable++;
			
			}
			st.append("\n");
			
		}System.out.println(matriz);
		System.out.println(st);

	}
	
}
