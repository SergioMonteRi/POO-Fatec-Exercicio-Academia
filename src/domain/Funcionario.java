package domain;

public class Funcionario extends Pessoa {

    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, Integer id, Double salario) {
        super(nome, idade, id);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                "\n Nome = " + getNome() +
                "\n Idade = " + getIdade() +
                "\n Salario = " + getSalario();
    }
}
