public class Atendimentos {
    private int numAtendimento, numPasta;
    private String tipoAtendimento, dataAtendimento;

    public Atendimentos() {
    }

    public Atendimentos(int numAtendimento, int numPasta, String tipoAtendimento, String dataAtendimento) {
        this.numAtendimento = numAtendimento;
        this.numPasta = numPasta;
        this.tipoAtendimento = tipoAtendimento;
        this.dataAtendimento = dataAtendimento;
    }

    public int getNumAtendimento() {
        return numAtendimento;
    }

    public void setNumAtendimento(int numAtendimento) {
        this.numAtendimento = numAtendimento;
    }

    public int getNumPasta() {
        return numPasta;
    }

    public void setNumPasta(int numPasta) {
        this.numPasta = numPasta;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    @Override
    public String toString() {
        return "Atendimentos{" + "Número do atendimento = " + numAtendimento + ", Número da pasta = " + numPasta + ", Tipo do atendimento = " + tipoAtendimento + ", Data do atendimento=" + dataAtendimento + '}';
    }
}
