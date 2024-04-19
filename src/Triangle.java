public class Triangle extends Shape{

    private  double widht;
    private double height;

    public Triangle(String color, double widht, double height) {
        super(color);
        this.widht=widht;
        this.height=height;
    }

    @Override
    public void resize(double rate) {
        this.widht*=rate;
        this.height*=rate;
    }

    @Override
    public double CalculateArea() {
        return widht*height/2;
    }
}
