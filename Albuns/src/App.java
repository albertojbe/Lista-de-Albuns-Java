import java.util.ArrayList;
import java.util.Scanner;
import Classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Banda> listaBandas = new ArrayList<>();
        ArrayList<Albuns> listaAlbuns = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        if(tela(scan) == 1){
            opcao1(scan, listaAlbuns, listaBandas);
            opcao2(listaAlbuns);
        }
    }

    public static int tela (Scanner scan){
        System.out.println("Catalogo de Músicas\n");
        System.out.println("Opções:");
        System.out.println("1. Adicionar Album");
        System.out.println("2. Listar Albuns");
        System.out.println("3. Listar Bandas");
        System.out.println("4. sair");
        System.out.format("Digite sua opção: ");
        return scan.nextInt();
    }

    public static void opcao1 (Scanner scan, ArrayList<Albuns> listaAlbuns, ArrayList<Banda> listaBandas){
        int contador = 0;
        String teste = scan.nextLine();
        System.out.format("Nome: ");
        String nome = scan.nextLine();
        System.out.format("Ano: ");
        String ano = scan.nextLine();
        System.out.format("Banda ");
        String banda = scan.nextLine();
        System.out.format("Gênero: ");
        String genero = scan.nextLine();
        listaAlbuns.add(new Albuns(nome, ano, banda, genero));
        for(Banda bandaClasse:listaBandas){
            if(bandaClasse.getNome() == banda){
                contador = 1;
            }
        }
        if (contador == 0){
            Banda bandaClasse = new Banda(banda);
            bandaClasse.adicionarAlbum(new Albuns(nome, ano, banda, genero));
            listaBandas.add(bandaClasse);
        }
    }
    public static void opcao2(ArrayList<Albuns> listaAlbuns){
        for(Albuns album:listaAlbuns){
            System.out.println(album);
        }
    }
}
