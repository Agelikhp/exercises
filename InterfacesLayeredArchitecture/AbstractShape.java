package InterfacesLayeredArchitecture;

import java.util.Objects;

public class AbstractShape implements IShape, Cloneable {
    private long id;

    public void setId(long id)
    {
        this.id = id;
    }


    @Override
    public long getId()
    {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        AbstractShape that = (AbstractShape) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
