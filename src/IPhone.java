public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private String paginaAtual;
    private boolean chamadaAtiva;
    private boolean musicaTocando;

    // Reprodutor Musical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            musicaTocando = true;
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            musicaTocando = false;
            System.out.println("Música pausada.");
        }
    }

    @Override
    public void pararMusica(String nome) {
        musicaTocando = false;
        musicaAtual = null;
        System.out.println("Música parada.");
    }

    @Override
    public void selecionarMusica(String nome) {
        this.musicaAtual = nome;
        System.out.println("Música selecionada: " + nome);
    }

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        chamadaAtiva = true;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        chamadaAtiva = true;
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz...");
    }

    // Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Atualizando: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    public void exibirMenu() {
        System.out.println("Menu: Música | Telefone | Navegador");
    }
}