
package desafiopooo;

// Classe Abstrata Funcionario
abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método abstrato para calcular o bônus
    public abstract double calcularBonus();

    // Sobrecarga do método calcularBonus
    public double calcularBonus(double percentual) {
        return salario * percentual;
    }

    public double calcularBonus(double percentual, double valorFixo) {
        return (salario * percentual) + valorFixo;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }
}
