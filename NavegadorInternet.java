/**
 * Interface que define as funções básicas de um navegador de internet.
 * <p>
 * Esta interface pode ser implementada por classes que simulam o comportamento
 * de um navegador, permitindo exibir páginas da web, adicionar novas abas e atualizar páginas.
 * </p>
 */
public interface NavegadorInternet {

    /**
     * Exibe a página da web especificada pelo URL.
     *
     * @param url Endereço da página da web a ser exibida.
     */
    void exibirPagina(String url);

    /**
     * Adiciona uma nova aba ao navegador.
     */
    void adicionarNovaAba();

    /**
     * Atualiza a página da web atualmente aberta.
     */
    void atualizarPagina();
}
