public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("");
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        iphone.ligar("");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        iphone.exibirPagina("");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
