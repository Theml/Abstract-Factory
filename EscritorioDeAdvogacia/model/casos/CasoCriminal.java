class CasoCriminal extends Caso {
    public CasoCriminal(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String detalhes() {
        return "Caso Criminal para " + cliente.getNome();
    }
}