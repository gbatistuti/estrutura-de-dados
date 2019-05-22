


public class Pilha {
	
	// Atributos
	private int[] pilha;
	private int topo;
	
	// Construtor
	public Pilha(int capacidade) {
		pilha = new int[capacidade];
		topo = -1;    // inicializa topo com -1 (pilha vazia)
	}

	// M�todos
	public boolean isEmpty() {
		return topo == -1;  // se topo for -1 a pilha est� vazia
		                    // e retornar� true
		                    // caso contr�rio, retornar� false
	}
	
	public boolean isFull() {
		return topo == pilha.length-1; //se topo for igual a 
		                       // pilha.length-1, a pilha est� cheia
		                       // e retornar� true
		                       // caso contr�rio, retornar� false
	}
	
    public void push(int info) {
    	if (isFull()) {
    		System.out.println("Pilha cheia");
    	}
    	else { // incrementa topo e coloca a info na pilha
    		   // �ndice topo
    		  // topo++;
    		  // pilha[topo]= info;

    		// a instru��o abaixo equivale �s 2 instru��es de cima
    		pilha[++topo]= info; 
    	}
    }
    
    public int pop() {
    	if (isEmpty()) {
    		System.out.println("Pilha vazia");
    		return -1;
    	}
    	else {
    		return pilha[topo--];
    		
    		// as 3 instru��es abaixo equivale � instru��o acima
    		// int retorno= pilha[topo];
    		// topo--;
    		// return retorno;
    	}
    }
}
