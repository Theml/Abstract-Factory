public class FabricaMoto implements FabricaAbstract {
    
     public Marca createMarca() {
        return new MarcaMoto();
    }

    public Modelo createModelo() {
        return new ModeloMoto();
    }
}