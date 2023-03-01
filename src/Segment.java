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
}
