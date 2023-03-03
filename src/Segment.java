public class Segment {
    Point first, second;

    public Segment(Point first, Point second){
        this.first = first;
        this.second = second;
    }

    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecond() {
        return second;
    }

    public void setSecond(Point second) {
        this.second = second;
    }
    public double getDistance(){
        return Math.hypot(first.x - second.x, first.y - second.y);
        //return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 2));
    }

    public double[] getline(){
        double x1 = first.x;
        double y1 = first.y;
        double x2 = second.x;
        double y2 = second.y;
        double a = (y1 - y2) / (x1 - x2);
        double b = y2 - x1 * a;
        return new double[] {a, b};
    }
}
