class FabricaCasosCriminais implements FabricaCasos {
    public Caso criarCaso(Cliente cliente) {
        return new CasoCriminal(cliente);
    }
}