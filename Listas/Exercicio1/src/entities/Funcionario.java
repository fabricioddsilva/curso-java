package entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salary;

    public Funcionario(Integer id, String nome, Double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void salaryIncrease(double percentage){
        salary += percentage/100*salary;
    }

    @Override
    public String toString() {
        return
                id + ", " + nome + ", " + String.format("%.2f", salary);
    }
}


