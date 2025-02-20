package mediaDoRetangulo;

public class Retangulo {

    public double largura;
    public double altura;

    public double areaDoRetangulo(){
        return largura * altura;

    }
    public double perimetroDoRetangulo(){
        return 2 * (largura + altura);

    }
    public double diagonalDoRetangulo() {
        return Math.sqrt((largura * largura) + (altura * altura));
    }
}
