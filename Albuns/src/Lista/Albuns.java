package Lista;

public class Albuns {
    private String nome;
    private int ano;
    private Banda banda;
    private String gênero;
    
    public Albuns(String nome, int ano, Banda banda, String gênero) {
        this.nome = nome;
        this.ano = ano;
        this.banda = banda;
        this.gênero = gênero;
    }
    
    @Override
    public String toString(){
        String informacoes = String.format("Nome: %s\nAno de Lançamento: %d\nBanda: %s\nGenêro: %s\n", 
        this.nome, this.ano, this.banda.getNome(), this.gênero);
        return informacoes;
    }
}
