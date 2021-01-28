import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {

	public static void main(String[] args) {

		Fila fila = new Fila();

		fila.adiciona("Dona Neves");
		fila.adiciona("Dona Nica");
		fila.adiciona("Gustavo");
		fila.adiciona("Arthur");
		System.out.println("Na fila de espera do banco: " + fila);

		String k1 = fila.remove();

		System.out.println("Já atendidas: " + k1);
		System.out.println("Ainda na Espera: " + fila);

		Queue<String> filaDoJava = new LinkedList<String>();

		filaDoJava.add("Arthur");
		String k2 = filaDoJava.poll();

		System.out.println(k2);

		System.out.println(fila);

	}
}
