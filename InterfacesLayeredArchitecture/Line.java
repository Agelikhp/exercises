package InterfacesLayeredArchitecture;

public class Line extends AbstractShape implements ILine{
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public Line(Line other) {
        super.setId(other.getId());
        this.length = other.length;
    }

    public double getLength(){
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(!(o instanceof Line))
            return false;
        if (!super.equals(o))
            return false;
        Line line = (Line) o;
        return Double.compare(line.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(length);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Line(this);
    }
}
