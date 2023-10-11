package equipamentos.reprodutor;

public class Ipod implements ReprodutorDigital {

    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar() {
        System.out.println("Pausado");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
    

}
