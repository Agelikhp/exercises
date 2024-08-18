package InterfacesLayeredArchitecture;

public class Circle extends AbstractShape implements ICircle{
    private double radius;

    public Circle(double radius) {
        this.radius =  radius;
    }

    public Circle(Circle other) {
        super.setId(other.getId());
        this.radius = other.radius;
    }


    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle))
            return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(radius);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle(this);
    }
}
