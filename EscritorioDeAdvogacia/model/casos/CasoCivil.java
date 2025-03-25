class CasoCivel extends Caso {
    public CasoCivel(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String detalhes() {
        return "Caso Cível para " + cliente.getNome();
    }
}