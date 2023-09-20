package ModelElements;

import Service.Point3D;

import java.util.List;

public class Polygon {
    public Polygon(List<Point3D> points) {
        this.points = points;
    }

    public List<Point3D> points;

}
