class FabricaCasosTrabalhistas implements FabricaCasos {
    public Caso criarCaso(Cliente cliente) {
        return new CasoTrabalhista(cliente);
    }
}