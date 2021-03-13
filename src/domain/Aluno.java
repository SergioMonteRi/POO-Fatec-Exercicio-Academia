package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataInscricaoPlano;
    private Date dataTerminoPlano;

    public Aluno() {
    }

    public Aluno(String nome, Integer idade, Integer id, Date dataInscricaoPlano, Date dataTerminoPlano) {
        super(nome, idade, id);
        this.dataInscricaoPlano = dataInscricaoPlano;
        this.dataTerminoPlano = dataTerminoPlano;
    }

    public Date getDataInscricaoPlano() {
        return dataInscricaoPlano;
    }

    public void setDataInscricaoPlano(Date dataInscricaoPlano) {
        this.dataInscricaoPlano = dataInscricaoPlano;
    }

    public Date getDataTerminoPlano() {
        return dataTerminoPlano;
    }

    public void setDataTerminoPlano(Date dataTerminoPlano) {
        this.dataTerminoPlano = dataTerminoPlano;
    }

    @Override
    public String toString() {
        return
                "\n Nome = " + getNome() +
                "\n Data de Inscrição do Plano = " + sdf.format(getDataInscricaoPlano()) +
                "\n Data do Término do Plano = "  + sdf.format(getDataTerminoPlano());
    }
}
