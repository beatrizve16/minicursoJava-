package teste.minicursoJava;
public class Retangulo {
    
    public double largura;
    public double altura;
    public double base;
    public double area;
    public double perimetro;
    public double diagonal;

    public double calcArea(double base,double altura){
        return base*altura;
    }
    public double calcPerimetro(double base,double altura){
        return (base*2)+(altura*2);
    }
    public double calcDiagonal(double base,double altura){
       diagonal= (base*base) + (altura+altura);
       
        return Math.sqrt(diagonal);
    }
}
