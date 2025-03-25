abstract class Caso {
    protected Cliente cliente;
    protected String status;

    public Caso(Cliente cliente) {
        this.cliente = cliente;
        this.status = "Iniciado";
    }

    public abstract String detalhes();

    public String getStatus() {
        return status;
    }
}

