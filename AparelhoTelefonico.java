/**
 * Interface que define as funções básicas de um aparelho telefônico.
 * <p>
 * Esta interface pode ser implementada por classes que simulam o comportamento
 * de um telefone, permitindo realizar chamadas, atender chamadas e iniciar o correio de voz.
 * </p>
 */
public interface AparelhoTelefonico {

    /**
     * Realiza uma ligação para o número especificado.
     *
     * @param numero Número de telefone para o qual a ligação será realizada.
     */
    void ligar(String numero);

    /**
     * Atende uma chamada telefônica.
     */
    void atender();

    /**
     * Inicia o correio de voz.
     */
    void iniciarCorreioVoz();
}
