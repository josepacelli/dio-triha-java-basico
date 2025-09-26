/**
 * Classe que representa um iPhone, implementando as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.
 * <p>
 * Esta classe simula o comportamento de um iPhone, permitindo realizar ações como tocar músicas, realizar chamadas,
 * navegar na internet, entre outras funcionalidades. Cada iPhone possui um modelo, uma versão do sistema operacional
 * e estados internos como ligado/desligado, música atual, página atual, etc.
 * </p>
 */
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo; // Modelo do iPhone
    private String versaoSO; // Versão do sistema operacional do iPhone
    private boolean ligado; // Indica se o iPhone está ligado
    private String musicaAtual; // Música atualmente selecionada
    private boolean tocando; // Indica se uma música está sendo tocada
    private String paginaAtual; // Página da web atualmente aberta
    private int numeroAbas; // Número de abas abertas no navegador

    /**
     * Construtor da classe iPhone.
     *
     * @param modelo Modelo do iPhone.
     * @param versaoSO Versão do sistema operacional do iPhone.
     */
    public iPhone(String modelo, String versaoSO) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
        this.ligado = false;
        this.tocando = false;
        this.numeroAbas = 0;
    }

    /**
     * Liga o dispositivo iPhone.
     */
    public void ligarDispositivo() {
        this.ligado = true;
        System.out.println("iPhone " + modelo + " ligado!");
    }

    /**
     * Desliga o dispositivo iPhone.
     */
    public void desligarDispositivo() {
        this.ligado = false;
        this.tocando = false;
        System.out.println("iPhone " + modelo + " desligado!");
    }

    // Implementação da interface ReprodutorMusical

    /**
     * Inicia a reprodução da música selecionada.
     */
    @Override
    public void tocar() {
        if (ligado) {
            if (musicaAtual != null) {
                tocando = true;
                System.out.println("Tocando música: " + musicaAtual);
            } else {
                System.out.println("Nenhuma música selecionada!");
            }
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    /**
     * Pausa a reprodução da música atual.
     */
    @Override
    public void pausar() {
        if (ligado && tocando) {
            tocando = false;
            System.out.println("Música pausada");
        } else if (!tocando) {
            System.out.println("Nenhuma música tocando");
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    /**
     * Seleciona uma música para reprodução.
     *
     * @param musica Nome da música a ser selecionada.
     */
    @Override
    public void selecionarMusica(String musica) {
        if (ligado) {
            this.musicaAtual = musica;
            System.out.println("Música selecionada: " + musica);
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    // Implementação da interface AparelhoTelefonico

    /**
     * Realiza uma ligação para o número especificado.
     *
     * @param numero Número de telefone para o qual a ligação será realizada.
     */
    @Override
    public void ligar(String numero) {
        if (ligado) {
            System.out.println("Ligando para " + numero + "...");
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    /**
     * Atende uma chamada telefônica.
     */
    @Override
    public void atender() {
        if (ligado) {
            System.out.println("Atendendo chamada...");
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    /**
     * Inicia o correio de voz.
     */
    @Override
    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Iniciando correio de voz...");
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    // Implementação da interface NavegadorInternet

    /**
     * Exibe a página da web especificada.
     *
     * @param url URL da página a ser exibida.
     */
    @Override
    public void exibirPagina(String url) {
        if (ligado) {
            this.paginaAtual = url;
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    /**
     * Adiciona uma nova aba ao navegador.
     */
    @Override
    public void adicionarNovaAba() {
        if (ligado) {
            numeroAbas++;
            System.out.println("Nova aba adicionada. Total de abas: " + numeroAbas);
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    /**
     * Atualiza a página da web atualmente aberta.
     */
    @Override
    public void atualizarPagina() {
        if (ligado && paginaAtual != null) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else if (paginaAtual == null) {
            System.out.println("Nenhuma página aberta!");
        } else {
            System.out.println("iPhone está desligado!");
        }
    }

    // Getters

    /**
     * Retorna o modelo do iPhone.
     *
     * @return Modelo do iPhone.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Retorna a versão do sistema operacional do iPhone.
     *
     * @return Versão do sistema operacional.
     */
    public String getVersaoSO() {
        return versaoSO;
    }

    /**
     * Verifica se o iPhone está ligado.
     *
     * @return True se o iPhone estiver ligado, caso contrário, false.
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * Retorna a música atualmente selecionada.
     *
     * @return Nome da música selecionada.
     */
    public String getMusicaAtual() {
        return musicaAtual;
    }

    /**
     * Verifica se uma música está sendo tocada.
     *
     * @return True se uma música estiver tocando, caso contrário, false.
     */
    public boolean isTocando() {
        return tocando;
    }

    /**
     * Retorna a página da web atualmente aberta.
     *
     * @return URL da página aberta.
     */
    public String getPaginaAtual() {
        return paginaAtual;
    }

    /**
     * Retorna o número de abas abertas no navegador.
     *
     * @return Número de abas abertas.
     */
    public int getNumeroAbas() {
        return numeroAbas;
    }
}
