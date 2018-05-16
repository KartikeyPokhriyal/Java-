

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    Point startPoint;
    Point endPoint;



    public Line( Point startPoint, Point endPoint) {

        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getLength() {

        return sqrt(
            pow(endPoint.getX() - startPoint.getX(), 2) +
            pow(endPoint.getY() - startPoint.getY(), 2)
        );
    }

    public boolean compareTo(Line line) {
        return (this.getLength() == line.getLength());
    }
}

