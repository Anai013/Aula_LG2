import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		pilha.push("Guilherme");
		System.out.println(pilha);

		pilha.push("Anna");
		System.out.println(pilha);

		String k1 = pilha.pop();
		System.out.println(k1);

		String k2 = pilha.pop();
		System.out.println(k2);

		System.out.println(pilha.vazia());
		pilha.push("kauã");
		System.out.println(pilha.vazia());

		System.out.println(pilha);

		Stack<String> stack = new Stack<String>();
		stack.push("Guilherme");
		stack.push("Kauã");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		String nome = stack.peek();
		System.out.println(nome); 
		
		System.out.println(stack);
	}

}
