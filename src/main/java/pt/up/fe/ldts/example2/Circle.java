package pt.up.fe.ldts.example2;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() throws Exception {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() throws Exception {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(this.x, this.y, this.radius);
    }
}
