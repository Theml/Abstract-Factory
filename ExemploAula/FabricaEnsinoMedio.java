public class FabricaEnsinoMedio implements FabricaAbstrata{
  
  public Diploma createDiploma() {
    return new DiplomaEnsinoMedio();
  }

  public Historico createHistorico() {
    return new HistoricoEnsinoMedio();
  }
}
