/**
 * Interface que define as funções básicas de um reprodutor musical.
 * <p>
 * Esta interface pode ser implementada por classes que simulam o comportamento
 * de um reprodutor de música, permitindo tocar, pausar e selecionar músicas.
 * </p>
 */
public interface ReprodutorMusical {

    /**
     * Inicia a reprodução da música selecionada.
     */
    void tocar();

    /**
     * Pausa a reprodução da música atual.
     */
    void pausar();

    /**
     * Seleciona uma música para reprodução.
     *
     * @param musica Nome da música a ser selecionada.
     */
    void selecionarMusica(String musica);
}
