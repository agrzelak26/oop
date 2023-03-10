import java.util.Locale;

public class Polygon extends Shape {
    private Point[] arr;
    private Style style;

    public Polygon(int count, Style style){
        this.style = style;
        arr = new Point[count];
    }
    public Polygon(int count){
        arr = new Point[count];
    }

    public void setPoint(int index, Point point){
        arr[index] = point;
    }
    public static Polygon square(Segment segment, Style style){
        Point point = new Point((segment.getA().x + segment.getB().y)/2, (segment.getB().x + segment.getB().y)/2);
        Segment segmentprostopadly = Segment.perpendicular(segment, point)[0];
        Point[] points = {segment.getA(), segmentprostopadly.getA(), segment.getB(), segmentprostopadly.getB()};
        Polygon kwadrat = new Polygon(4);
        kwadrat.setPoints(points);
        return kwadrat;
    }

    public void setPoints(Point[] points){
        arr = points;
    }

    public String toSvg() {
        String pointsString = "";
        for(Point point : arr) {
            pointsString += point.x + "," + point.y + " ";
        }
        String styleString = "";
        if (this.style != null) {
            styleString = this.style.toSvg();
        }
        return String.format(Locale.ENGLISH, "<polygon points= \"%s\"%s />", pointsString, styleString);
    }
}