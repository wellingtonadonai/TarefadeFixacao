package SalarioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Digite o salario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Digite o imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("O salario Bruto é? ");
        System.out.println(funcionario.salarioLiquido());

        System.out.println("O salario liquido é? ");
        System.out.println(funcionario.aumentoDeSalario());


    }
}
