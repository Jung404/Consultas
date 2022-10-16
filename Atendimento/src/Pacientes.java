public class Pacientes {
    private String nome;
    private String cpf;
    private String dataNasc;
    private int numPaciente;

    public Pacientes() {
     
    }

    public Pacientes(String nome, String cpf, String dataNasc, int numPaciente) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.numPaciente = numPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getNumPaciente() {
        return numPaciente;
    }

    public void setNumPaciente(int numPaciente) {
        this.numPaciente = numPaciente;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "Nome = " + nome + ", cpf = " + cpf + ", Data de nascimento = " + dataNasc + ", Número do Paciente = " + numPaciente + '}';
    }
}
