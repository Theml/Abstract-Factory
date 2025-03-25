class FabricaCasosCiveis implements FabricaCasos {
    public Caso criarCaso(Cliente cliente) {
        return new CasoCivel(cliente);
    }
}