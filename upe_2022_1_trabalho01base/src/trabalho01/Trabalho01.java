package trabalho01;

public interface Trabalho01 {
	
	String getEstudante();

	void criaLista(int tamanho);
	ITAD[] getLista();
	ITAD get(int index);
	int getQuantidade();
	
	void inserirNoInicio(ITAD tad);
	void inserirNoFim(ITAD tad);
	void inserirNoMeio(ITAD tad, int posicao);
	ITAD removerNoInicio();
	ITAD removerNoFim();
	ITAD removerNoMeio(int posicao);
	
	String print();
	
}
