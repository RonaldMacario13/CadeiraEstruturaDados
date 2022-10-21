package trabalho01;

public class RonaldMacario implements Trabalho01 {

    private ITAD[] programaSPARTAN;
    private int quantidade = 0;
    private int tamanho;

    @Override
    public String getEstudante() {
        return "Rônald Macário Cavalcante";
    }

    @Override
    public void criaLista(int tamanho) {
        programaSPARTAN = new Spartan[tamanho];
        this.tamanho = programaSPARTAN.length;
    }

    @Override
    public ITAD[] getLista() {
        return programaSPARTAN;
    }

    @Override
    public ITAD get(int index) {
        ITAD item = programaSPARTAN[index];
        return item;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        if (quantidade == programaSPARTAN.length)
            return;
        for (int i = quantidade; i < 0; i++) {
            programaSPARTAN[i] = programaSPARTAN[i - 1];
        }
        programaSPARTAN[0] = tad;
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        if (quantidade == programaSPARTAN.length)
            return;
        programaSPARTAN[quantidade] = tad;
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (quantidade == programaSPARTAN.length)
            return;
        for (int i = quantidade; i < posicao; i++) {
            programaSPARTAN[i] = programaSPARTAN[i - 1];
        }
        programaSPARTAN[posicao] = tad;
        quantidade++;
    }

    @Override
    public ITAD removerNoInicio() {
        ITAD remover = programaSPARTAN[0];
        for (int i = 0; i < (programaSPARTAN.length - 1); i++) {
            programaSPARTAN[i] = programaSPARTAN[i + 1];
        }
        quantidade--;
        return remover;
    }

    @Override
    public ITAD removerNoFim() {
        ITAD remover = programaSPARTAN[getQuantidade() - 1];
        programaSPARTAN[quantidade - 1] = null;
        quantidade--;
        return remover;
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        ITAD remover = programaSPARTAN[posicao];
        programaSPARTAN[posicao] = null;
        for (int i = posicao; i < (programaSPARTAN.length - 1); i++) {
            programaSPARTAN[i] = programaSPARTAN[i + 1];
        }
        quantidade--;
        return remover;
    }

    @Override
    public String print() {
        String stg = "[";
        for(int i = 0; i<tamanho;i++){
            if(programaSPARTAN[i] != null){
                stg += programaSPARTAN[i].print();
            }else{
                stg += "null";
            }
            stg +=(i == tamanho-1)?"]":" -||- ";
        }
        return stg;
    }

    // @Override
    // public String print() {
    //     String x = "[";
    //     for (int i = 0; i < quantidade; i++) {
    //         x += programaSPARTAN[i];
    //     }
    //     return x + "]";
    // }

}
