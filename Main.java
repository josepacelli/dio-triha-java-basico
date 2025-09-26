public class TesteiPhone {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        iPhone meuiPhone = new iPhone("iPhone 2G", "iOS 1.0");

        System.out.println("=== TESTE IPHONE ===");
        System.out.println("Modelo: " + meuiPhone.getModelo());
        System.out.println("Versão SO: " + meuiPhone.getVersaoSO());

        // Ligando o dispositivo
        System.out.println("\n--- Ligando o iPhone ---");
        meuiPhone.ligarDispositivo();

        // Testando funcionalidades do Reprodutor Musical
        System.out.println("\n--- Testando Reprodutor Musical ---");
        meuiPhone.tocar(); // Sem música selecionada
        meuiPhone.selecionarMusica("Imagine - John Lennon");
        meuiPhone.tocar();
        meuiPhone.pausar();

        // Testando funcionalidades do Aparelho Telefônico
        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuiPhone.ligar("(11) 99999-9999");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador Internet
        System.out.println("\n--- Testando Navegador Internet ---");
        meuiPhone.exibirPagina("https://www.apple.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();

        // Testando com iPhone desligado
        System.out.println("\n--- Testando com iPhone Desligado ---");
        meuiPhone.desligarDispositivo();
        meuiPhone.tocar();
        meuiPhone.ligar("(11) 88888-8888");
        meuiPhone.exibirPagina("https://www.google.com");
    }
}
