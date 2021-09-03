package parimpar;

public class ImparPar {
	
	public static void main(String[] args) {
		
		int numeroRepeticao = 101;
		int contador = 0;
		
		while (contador < numeroRepeticao) {
			
			if (contador % 2 == 0) {
				System.out.println(contador +"- Par");
				contador = contador + 1;
			} else {
				System.out.println(contador +"- Ímpar");
				contador = contador + 1;
			}
			

		}
	}

}
