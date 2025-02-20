package mediaDoRetangulo;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Receber Largura: ");
        retangulo.largura = sc.nextDouble();

        System.out.println();
        System.out.println("Receber altura");
        retangulo.altura = sc.nextDouble();

        System.out.println("Esta é a Area do retangulo:");
        System.out.println(retangulo.areaDoRetangulo());

        System.out.println("Este é o perimetro do retangulo:");
        System.out.println(retangulo.perimetroDoRetangulo());

        System.out.println("Este é a diagonal do retangulo:");
        System.out.println(retangulo.diagonalDoRetangulo());





    }
}