package domain;

public class Plano {

    private String plano;
    private Double valor;
    private Integer id;

    public Plano() {
    }

    public Plano(String plano, Double valor, Integer id) {
        this.plano = plano;
        this.valor = valor;
        this.id = id;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
