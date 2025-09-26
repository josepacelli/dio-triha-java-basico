/**
     * Diagrama de classes representado em formato UML.
     * <p>
     * Este diagrama descreve as relações entre as interfaces ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
     * e a classe iPhone, que implementa essas interfaces. As interfaces definem as funções básicas para cada tipo de funcionalidade,
     * enquanto a classe iPhone implementa essas funções e adiciona atributos específicos.
     * </p>
     */
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        -String modelo
        -String versaoSO
        -boolean ligado
        +iPhone(String modelo, String versaoSO)
        +ligar()
        +desligar()
        +getModelo() String
        +getVersaoSO() String
        +isLigado() boolean
    }

    iPhone ..|> ReprodutorMusical : implements
    iPhone ..|> AparelhoTelefonico : implements
    iPhone ..|> NavegadorInternet : implements
