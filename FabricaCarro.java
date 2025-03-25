public class FabricaCarro implements FabricaAbstract {
    
    public Marca createMarca() {
        return new MarcaCarro();
    }

    public Modelo createModelo() {
        return new ModeloCarro();
    }
}