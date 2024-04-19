 abstract public class Shape implements  Resizable {

    private final String color;


     public Shape(String color) {
         this.color = color;

     }

        public abstract double CalculateArea();

     public abstract void resize(double rate);

     }