import java.util.ArrayList;
import java.util.List;

// Singleton para Gestão do Escritório
class EscritorioAdvocacia {
    private static EscritorioAdvocacia instancia;
    private List<Advogado> advogados;
    private List<Cliente> clientes;
    private List<Caso> casos;

    private EscritorioAdvocacia() {
        advogados = new ArrayList<>();
        clientes = new ArrayList<>();
        casos = new ArrayList<>();
    }

    public static synchronized EscritorioAdvocacia getInstance() {
        if (instancia == null) {
            instancia = new EscritorioAdvocacia();
        }
        return instancia;
    }

    public void adicionarAdvogado(Advogado advogado) {
        advogados.add(advogado);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarCaso(Caso caso) {
        casos.add(caso);
    }

    public List<Advogado> listarAdvogados() {
        return new ArrayList<>(advogados);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }

    public List<Caso> listarCasos() {
        return new ArrayList<>(casos);
    }
}