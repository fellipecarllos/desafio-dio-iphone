import equipamentos.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        System.out.println("Telefone");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

         System.out.println("Reoprodutor Digital");
         iphone.selecionarMusica();
         iphone.tocar();
         iphone.pausar();

         System.out.println("Navegador");
         iphone.exibirPagina();
         iphone.adicionarNovaAba();
         iphone.atualizarPagina();
        

    }
}
