import java.util.Random;

/**
 * 
 */

/**
 * @author flaquitqm
 *
 */

public class PruebaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generando una lista de enteros
		SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
		Random num = new Random(100);
		//Se le a�aden 10 n�meros aleatorios
		for (int i=0; i<10; i++){
			lista.addLast(num.nextInt(100));
		}
		System.out.println(lista);
		

	}


}
