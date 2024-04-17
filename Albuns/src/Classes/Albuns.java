package Classes;

public class Albuns {
    private String nome;
    private String ano;
    private String banda;
    
    private String gênero;
    
    public Albuns(String nome, String ano, String banda, String gênero) {
        this.nome = nome;
        this.ano = ano;
        this.banda = banda;
        this.gênero = gênero;
    }
    
    @Override
    public String toString(){
        String informacoes = String.format("Nome: %s\nAno de Lançamento: %d\nBanda: %s\nGenêro: %s\n", 
        this.nome, this.ano, this.banda, this.gênero);
        return informacoes;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getAno() {
        return ano;
    }
    
    public String getBanda() {
        return banda;
    }
    
    public String getGênero() {
        return gênero;
    }
}
