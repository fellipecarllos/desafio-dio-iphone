package equipamentos.navegador;

public class Chrome implements Navegador {

    public void exibirPagina() {       
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
       System.out.println("Nova aba aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
    
}
