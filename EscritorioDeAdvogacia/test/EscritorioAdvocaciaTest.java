import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscritorioAdvocaciaTest {

    private EscritorioAdvocacia escritorio;
    private Cliente cliente1;
    private Cliente cliente2;
    private Advogado advogadoCivel;
    private Advogado advogadoCriminal;
    private FabricaCasos fabricaCasosCiveis;
    private FabricaCasos fabricaCasosCriminais;

    @BeforeEach
    void setUp() {
        // Resetar a instância singleton antes de cada teste
        escritorio = EscritorioAdvocacia.getInstance();
        
        // Limpar dados anteriores (se necessário)
        while (!escritorio.listarAdvogados().isEmpty()) {
            escritorio.listarAdvogados().remove(0);
        }
        while (!escritorio.listarClientes().isEmpty()) {
            escritorio.listarClientes().remove(0);
        }
        while (!escritorio.listarCasos().isEmpty()) {
            escritorio.listarCasos().remove(0);
        }

        // Preparar dados para os testes
        cliente1 = new Cliente("João Silva", "123.456.789-00");
        cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        advogadoCivel = new Advogado("Dr. Carlos", "12345", "Direito Cível");
        advogadoCriminal = new Advogado("Dra. Ana", "67890", "Direito Criminal");

        fabricaCasosCiveis = new FabricaCasosCiveis();
        fabricaCasosCriminais = new FabricaCasosCriminais();
    }

    @Test
    void testSingleton() {
        EscritorioAdvocacia escritorio2 = EscritorioAdvocacia.getInstance();
        
        // Verificar se as duas chamadas retornam a mesma instância
        assertSame(escritorio, escritorio2, 
            "Deve retornar a mesma instância de EscritorioAdvocacia");
    }

    @Test
    void testAdicionarCliente() {
        escritorio.adicionarCliente(cliente1);
        escritorio.adicionarCliente(cliente2);

        assertEquals(2, escritorio.listarClientes().size(), 
            "Deve conter 2 clientes");
        assertTrue(escritorio.listarClientes().contains(cliente1), 
            "Cliente 1 deve estar na lista");
        assertTrue(escritorio.listarClientes().contains(cliente2), 
            "Cliente 2 deve estar na lista");
    }

    @Test
    void testAdicionarAdvogado() {
        escritorio.adicionarAdvogado(advogadoCivel);
        escritorio.adicionarAdvogado(advogadoCriminal);

        assertEquals(2, escritorio.listarAdvogados().size(), 
            "Deve conter 2 advogados");
        assertTrue(escritorio.listarAdvogados().contains(advogadoCivel), 
            "Advogado Cível deve estar na lista");
        assertTrue(escritorio.listarAdvogados().contains(advogadoCriminal), 
            "Advogado Criminal deve estar na lista");
    }

    @Test
    void testCriarCasos() {
        // Criar casos usando as fábricas
        Caso casoCivel = fabricaCasosCiveis.criarCaso(cliente1);
        Caso casoCriminal = fabricaCasosCriminais.criarCaso(cliente2);

        escritorio.adicionarCaso(casoCivel);
        escritorio.adicionarCaso(casoCriminal);

        assertEquals(2, escritorio.listarCasos().size(), 
            "Deve conter 2 casos");
        
        // Verificar detalhes dos casos
        assertEquals("Caso Cível para João Silva", casoCivel.detalhes(), 
            "Detalhes do caso cível devem estar corretos");
        assertEquals("Iniciado", casoCivel.getStatus(), 
            "Status inicial do caso deve ser 'Iniciado'");
    }

    @Test
    void testIntegracaoEscritorio() {
        // Teste de integração completo
        escritorio.adicionarCliente(cliente1);
        escritorio.adicionarCliente(cliente2);
        escritorio.adicionarAdvogado(advogadoCivel);
        escritorio.adicionarAdvogado(advogadoCriminal);

        Caso casoCivel = fabricaCasosCiveis.criarCaso(cliente1);
        Caso casoCriminal = fabricaCasosCriminais.criarCaso(cliente2);
        escritorio.adicionarCaso(casoCivel);
        escritorio.adicionarCaso(casoCriminal);

        assertEquals(2, escritorio.listarClientes().size(), 
            "Deve conter 2 clientes");
        assertEquals(2, escritorio.listarAdvogados().size(), 
            "Deve conter 2 advogados");
        assertEquals(2, escritorio.listarCasos().size(), 
            "Deve conter 2 casos");
    }
}