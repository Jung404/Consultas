public class Medicos {
    private String nome, especializacao, cpfMedico;
    private int numeroDoRegistroDoMedico;

    public Medicos() {
    }

    public Medicos(String nome, String especializacao, String cpfMedico, int numeroDoRegistroDoMedico) {
        this.nome = nome;
        this.especializacao = especializacao;
        this.cpfMedico = cpfMedico;
        this.numeroDoRegistroDoMedico = numeroDoRegistroDoMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getCpfMedico() {
        return cpfMedico;
    }

    public void setCpfMedico(String cpfMedico) {
        this.cpfMedico = cpfMedico;
    }

    public int getNumeroDoRegistroDoMedico() {
        return numeroDoRegistroDoMedico;
    }

    public void setNumeroDoRegistroDoMedico(int numeroDoRegistroDoMedico) {
        this.numeroDoRegistroDoMedico = numeroDoRegistroDoMedico;
    }

    @Override
    public String toString() {
        return "Medicos{" + "Nome = " + nome + ", Especialização = " + especializacao + ", cpf do Médico = " + cpfMedico + ", Número do registro do médico=" + numeroDoRegistroDoMedico + '}';
    }
}
