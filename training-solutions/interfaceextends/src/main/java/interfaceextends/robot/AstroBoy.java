package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{
    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
        Point point = new Point(position.getX(), position.getY(), altitude);
        path.add(point);
        this.position = point;
    }

    @Override
    public void moveTo(Point position) {
        path.add(position);
        this.position = position;
    }

    @Override
    public void fastMoveTo(Point position) {
        Point point = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        flyTo(point);
        liftTo(0);
    }

    public void flyTo(Point position){
        path.add(position);
        this.position = position;
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public long getAltitude() {
        return position.getZ();
    }

    public int getAngle() {
        return angle;
    }
}
