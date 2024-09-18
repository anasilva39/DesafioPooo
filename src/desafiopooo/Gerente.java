
package desafiopooo;

// Classe Gerente
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20; // Bônus de 20% do salário
    }
}