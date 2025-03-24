import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveConstruirMarcaMoto() {
        FabricaAbstract fabrica = new FabricaMoto();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Marca de Moto", veiculo.construirMarca);
    }

    @Test
    void deveConstruirMarcaCarro() {
        FabricaAbstract fabrica = new FabricaCarro();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Marca de Carro", veiculo.construirMarca);
    }

    @Test
    void deveConstruirModeloMoto() {
        FabricaAbstract fabrica = new FabricaMoto();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Modelo de Moto", veiculo.construirModelo);
    }

    @Test
    void deveConstruirModeloCarro() {
        FabricaAbstract fabrica = new FabricaCarro();
        Veiculo veiculo = new Veiculo(fabrica);
        assertEquals("Modelo de Moto", veiculo.construirModelo);
    }
}