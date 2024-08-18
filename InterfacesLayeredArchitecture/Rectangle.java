package InterfacesLayeredArchitecture;

public class Rectangle extends AbstractShape implements IRectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle (Rectangle other) {
        super.setId(other.getId());
        this.width = other.width;
        this.height = other.height;
    }

    @Override
    public double getArea() {

        return width * height;
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * (width + height));
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(!(o instanceof Rectangle))
            return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height,height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Rectangle(this);
    }
}
