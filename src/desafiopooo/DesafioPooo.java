
package desafiopooo;


public class DesafioPooo {

    // Classe de Teste Main
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 2000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 1000);
       
        gerente.exibirInformacoes();
        desenvolvedor.exibirInformacoes();
       
        System.out.println("Bônus customizado para Gerente (com valor fixo): " +
            gerente.calcularBonus(0.20, 400));
        System.out.println("Bônus customizado para Gerente (sem valor fixo): " +
            gerente.calcularBonus(0.20));
        System.out.println("Bônus customizado para Desenvolvedor (com valor fixo): " +
            desenvolvedor.calcularBonus(0.10, 300));
        System.out.println("Bônus customizado para Desenvolvedor (sem valor fixo): " +
            desenvolvedor.calcularBonus(0.10));
    }

   
    
}
