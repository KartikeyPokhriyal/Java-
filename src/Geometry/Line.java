package Geometry;

import com.sun.corba.se.impl.oa.poa.POAImpl;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {

    Point startPoint;
    Point endPoint;

    public Line( int x1, int y1, int x2, int y2) {

        startPoint = new Point(x1, y1);
        endPoint = new Point(x2,y2);

    }


    public double getLength() {

        return sqrt(
            pow(endPoint.get_X_Values() - startPoint.get_X_Values(), 2) +
            pow(endPoint.get_Y_Values() - startPoint.get_Y_Values(), 2)
        );
    }

    public boolean compareTo(Line line) {
        return (this.getLength() == line.getLength());
    }
}

