import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveEmitirDiplomaEnsinoMedio() {
        FabricaAbstract fabrica = new FabricaEnsinoMedio();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Diploma de Ensino Medio", aluno.emitirDiploma);
    }

    @Test
    void deveEmitirHistoricoEnsinoMedio() {
        FabricaAbstract fabrica = new FabricaEnsinoMedio();
        Aluno aluno = new Aluno(fabrica);
        assertEquals("Historico de Ensino Medio", aluno.emitirHistorico);
    }
}