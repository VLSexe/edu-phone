package funcionalidades.aparelhoTelefonico;

public interface AparelhoTelefonico {
    public static void ligar(String numero){
        System.out.println("Ligando para "+numero);
    }
    public static void atender(){
        System.out.println("Chamada iniciada!");
    }
    public static void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
