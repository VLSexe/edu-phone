package funcionalidades.reprodutorMusical;

public interface ReprodutorMusical {
    public static void tocar() {
        System.out.println("Reproduzindo música");
    }
    public static void pausar(){
        System.out.println("Pausando Música");
    }
    public static void selecionarMusica(String musica){
        System.out.println("Reproduzindo "+musica);
    }
}
