class CasoTrabalhista extends Caso {
    public CasoTrabalhista(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String detalhes() {
        return "Caso Trabalhista para " + cliente.getNome();
    }
}