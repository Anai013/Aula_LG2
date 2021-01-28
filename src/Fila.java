import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> pessoas = new LinkedList<String>();

	public void adiciona(String pessoa) {
		pessoas.add(pessoa);
	}

	public String remove() {
		return pessoas.remove(0);
	}

	public boolean vazia() {
		return pessoas.isEmpty();
	}

	@Override
	public String toString() {
		return pessoas.toString();
	}
}
