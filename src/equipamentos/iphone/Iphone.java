package equipamentos.iphone;
import equipamentos.navegador.Navegador;
import equipamentos.reprodutor.ReprodutorDigital;
import equipamentos.telefone.Telefone;

public class Iphone implements ReprodutorDigital, Telefone, Navegador {

  
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

  
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

  
    public void ligar() {
        System.out.println("Ligando...");
    }

   
    public void atender() {
        System.out.println("Atendendo...");
    }

   
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

   
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
