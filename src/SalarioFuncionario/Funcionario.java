package SalarioFuncionario;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
     return (imposto/100);
    }

    public double aumentoDeSalario(){
    return salarioBruto - imposto;
    }
}
