
public class Circle extends Shape{
    private  double radio;

    public Circle(String color, double radio) {
        super(color);
        this.radio=radio;
    }

    @Override
    public void resize(double rate) {
        this.radio*=rate;
    }

    @Override
    public double CalculateArea(){
        return (Math.PI*(Math.pow(radio,2)));
    }
}
