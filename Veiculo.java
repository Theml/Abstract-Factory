public class Veiculo {

    private Marca marca;
    private Modelo modelo;

    public Veiculo (FabricaAbstract fabrica) {
        this.marca = fabrica.createMarca();
        this.modelo = fabrica.createModelo();
    }

    public String construirMarca() {
        return this.marca.construir();
    }

    public String construirModelo() {
        return this.modelo.construir();
    }
}
