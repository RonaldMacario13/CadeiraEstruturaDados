package trabalho01;

import java.util.Random;

public class Spartan implements ITAD {

    private int id;
    private String nome;
    private float forca;
    private boolean compativel;

    public Spartan(){
        Random r = new Random();

        String[] nomes = {"Master Chief", "Cortana", "Catherine Halsey", "Miranda Keyes", "Árbitro", "Carter", "Kat", "Jun", "Emile", "Jorge", "Coronel Holland", "Edward Buck", "Bibliotecária", "Jared Miller", "Dalton", "Sarah Palmer", "Didact", "Holly Tanaka", "Linda", "Kelly", "Warden Eternal", "Flood", "Grunts"};
        id = r.nextInt(100000);
        nome = nomes[r.nextInt(nomes.length)];
        forca = r.nextInt(10000) + r.nextFloat();
        compativel = r.nextBoolean();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getCampo01() {
        return nome;
    }

    @Override
    public void setCampo01(String campo01) {
        this.nome = campo01;
    }

    @Override
    public float getCampo02() {
        return forca;
    }

    @Override
    public void setCampo02(float campo02) {
        this.forca = campo02;
    }

    @Override
    public boolean isCampo03() {
        return compativel;
    }

    @Override
    public void setCampo03(boolean campo03) {
        this.compativel = campo03;
    }

	@Override
	public String print() {
		return toString();
	}
	
	public String toString() {
		return "ID: "+getId()+ " -Nome dos bruxos: "+getCampo01()+" -Quantidade de magia :"+getCampo02()+
				" -Magia desbloqueada: "+isCampo03();
		
	}
    
}
