package Classes;

import java.util.ArrayList;

public class Banda {
    private String nome;
    
    private ArrayList<Albuns> albuns;
    
    public Banda(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }
    public void adicionarAlbum(Albuns album) {
        this.albuns.add(album);
    }
    
    public void imprimirInformacoes() {
        imprimir("Nome: " + nome);
        imprimir("Albuns: \n");
        for (Albuns album:albuns){
            System.out.println(album);
        }
    }
    
    public static void imprimir(String conteudo) {
        System.out.println(conteudo);
    }
    
    public String getNome() {
        return nome;
    }
}
