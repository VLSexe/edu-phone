package funcionalidades.navegadorInternet;

public interface NavegadorInternet {
    public static void exibirPagina(String url){
        System.out.println("Navegando em: "+url);
    }
    public static void adicionarNovaAba(int abaAtual){
        System.out.println("Abas abertas: "+abaAtual);
    }
    public static void atualizarPagina(){
        System.out.println("Refresh...");
    }
}
