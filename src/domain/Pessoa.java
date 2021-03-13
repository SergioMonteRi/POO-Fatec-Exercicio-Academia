package domain;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Integer id;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, Integer id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    
    public void setIdade(Integer id) {
        this.id = idade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id=" + id +
                '}';
    }
}
