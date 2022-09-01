package trabalho01;

public class Main {

	public static void main(String[] args) {
		
		// Tamanho para teste
		int tamanho = 1000;
		
		System.out.println("LISTA ENCADEADA EST�TICA\n========================");
		
		System.out.println("\nTestes de tempo com a lista vazia\n---------------------------------");
		Trabalho01 lista1 = new RonaldMacario(); // <<----- CRIE O OBJETO DE SEU TRABALHO AQUI!
		lista1.criaLista(tamanho);
		Trabalho01 lista2 = new RonaldMacario(); // <<----- CRIE O OBJETO DE SEU TRABALHO AQUI!
		lista2.criaLista(tamanho);
		for (int i = 0; i < tamanho; i++) {
			ITAD tad = new Spartan();  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
			lista2.inserirNoFim(tad);
		}
		ITAD tad1 = new Spartan();  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
		ITAD tad2 = new Spartan();  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
		ITAD tad3 = new Spartan();  // <<---------- CRIE O OBJETO DE SEU TAD AQUI!
		
		
		System.out.println("\n\tInser��o no in�cio da lista\n\t----------------------------");
		System.out.println(lista1.print());
		
		long time = System.nanoTime();
		lista1.inserirNoInicio(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tRemo��o no in�cio da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		tad1 = lista1.removerNoInicio();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tInser��o no final da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		lista1.inserirNoFim(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tRemo��o no final da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		tad1 = lista1.removerNoFim();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tInser��o no meio da lista\n\t----------------------------");
		lista1.inserirNoFim(tad1);
		lista1.inserirNoFim(tad2);
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		lista1.inserirNoMeio(tad3, 1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		
		System.out.println("\n\tRemo��o no meio da lista\n\t----------------------------");
		
		System.out.println(lista1.print());
		
		time = System.nanoTime();
		tad1 = lista1.removerNoMeio(1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista1.print());
		

		
		System.out.println("\nTestes de tempo com a lista cheia\n---------------------------------");
		
		System.out.println("\n\tInser��o no in�cio da lista\n\t----------------------------");
		System.out.println(lista2.print());

		time = System.nanoTime();
		lista2.inserirNoInicio(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tRemo��o no in�cio da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		tad1 = lista2.removerNoInicio();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tInser��o no final da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		lista2.inserirNoFim(tad1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tRemo��o no final da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		tad1 = lista2.removerNoFim();
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tInser��o no meio da lista\n\t----------------------------");
		lista2.inserirNoFim(tad1);
		lista2.inserirNoFim(tad2);
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		lista2.inserirNoMeio(tad3, tamanho/2);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
		
		System.out.println("\n\tRemo��o no meio da lista\n\t----------------------------");
		
		System.out.println(lista2.print());
		
		time = System.nanoTime();
		tad1 = lista2.removerNoMeio(1);
		System.out.println("\nTempo: " + (System.nanoTime() - time));
		
		System.out.println(lista2.print());
	}

}
