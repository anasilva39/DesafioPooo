
package desafiopooo;


// Classe Desenvolvedor
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10; // Bônus de 10% do salário
    }
}
