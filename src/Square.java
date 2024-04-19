public class Square extends Shape {
    private  double widht;
    public Square(String color, double widht ) {
        super(color);
        this.widht=widht;
    }

    @Override
    public void resize(double rate) {
        this.widht*=rate;
    }

    @Override
    public double CalculateArea(){
        return Math.pow(widht,2);
    }
}
