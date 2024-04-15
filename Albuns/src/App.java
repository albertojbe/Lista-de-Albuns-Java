import Lista.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lista de Albuns\n");
        Banda Metallica = new Banda("Metallica");
        Albuns RtL = new Albuns("Ride the Lighting", 1984, Metallica, "Thrash Metal");
        Albuns MoP = new Albuns("Master of Puppets", 1986, Metallica, "Thrash Metal");
        Metallica.adicionarAlbum(RtL);
        Metallica.adicionarAlbum(MoP);
        Metallica.imprimirInformacoes();
    }

}
