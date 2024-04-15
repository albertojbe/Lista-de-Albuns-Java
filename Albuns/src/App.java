import java.util.Scanner;
import Lista.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        if(tela(scan) == 1){
            opcao1(scan);
        }
    }

    public static int tela(Scanner scan){
        System.out.println("Catalogo de Músicas\n");
        System.out.println("Opções:");
        System.out.println("1. Adicionar Album");
        System.out.println("2. Adicionar Banda");
        System.out.printf("Digite sua opção: ");
        return scan.nextInt();
    }
    public static void opcao1(Scanner scan){
        System.out.printf("Nome: ");
        String nome = scan.nextLine();
        System.out.printf("Ano: ");
        String ano = scan.nextLine();
        System.out.printf("Banda: ");
        String banda = scan.nextLine();
        System.out.printf("Gênero: ");
        String genero = scan.nextLine();
        Banda bandaClasse = new Banda(banda);
        Albuns album = new Albuns(nome, ano, bandaClasse, genero);

    }
}
