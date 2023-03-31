package trabalhojava;

public class Main {
	public static void main(String[] args) {
	
		int tamanhoVetor = 10;
		ClasseAviao vetAviao[] = new ClasseAviao[tamanhoVetor];// declaração e alocação de espaço para o vetor "v"
		
		//recriar como vetores
		ClasseAviao aviao = new ClasseAviao();
		System.out.println("****** Dados do Aviao ******");
		for (int i = 0; i < tamanhoVetor; i++) {
			vetAviao[i]  = aviao;
			System.out.println("****** Insira os Dados do " + (i + 1) + "º Avião ******");
			vetAviao[i] .Cadastrar();System.out.println("****** Listagem dos Dados do " + (i + 1) + "º Avião ******");
			vetAviao[i] .Imprimir();
			}
		
		
		
		ClasseNavio vetNavio[] = new ClasseNavio[10]; //recriar como vetores
		System.out.println("****** Dados do Navio ******");
		for (int i = 0; i < vetNavio.length; i++) {
			vetNavio[i] = new ClasseNavio();
			System.out.println("****** Insira os Dados do " + (i + 1) + "º Navio ******");
			vetNavio[i].Cadastrar();System.out.println("------ Listagem dos Dados do " + (i + 1) + "º Navio ******");
			vetNavio[i].Imprimir();
			}
		}
	}

