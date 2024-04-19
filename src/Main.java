//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle("Azul",5,4);
        Circle circle=new Circle("Rojo",6);
        Square square=new Square("Amarillo",4);
        System.out.println("Area del triangulo: "  + triangle.CalculateArea());
        System.out.println("Area del cuadrado : " + square.CalculateArea());
        System.out.println("Area del circulo : " + circle.CalculateArea());

        square.resize(2);
        circle.resize(2);
        triangle.resize(2);

        System.out.println(" \n Despues del resize: ");
        System.out.println("Area del triangulo : "  + triangle.CalculateArea());
        System.out.println("Area del cuadrado : " + square.CalculateArea());
        System.out.println("Area del circulo : " + circle.CalculateArea());

    }
}