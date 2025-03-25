class Advogado {
    private String nome;
    private String oab;
    private String especialidade;

    public Advogado(String nome, String oab, String especialidade) {
        this.nome = nome;
        this.oab = oab;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getOab() {
        return oab;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}