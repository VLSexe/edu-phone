package iphone;


import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.navegadorInternet.NavegadorInternet;
import funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        int abaAtual = 0;
        NavegadorInternet.exibirPagina("google");
        abaAtual = abaAtual+1;
        NavegadorInternet.atualizarPagina();
        abaAtual = abaAtual+1;
        NavegadorInternet.adicionarNovaAba(abaAtual);

        AparelhoTelefonico.ligar("40028922");
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();

        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        ReprodutorMusical.selecionarMusica("Them Changes");
        abaAtual = abaAtual+1;
        NavegadorInternet.adicionarNovaAba(abaAtual);
    }
}

