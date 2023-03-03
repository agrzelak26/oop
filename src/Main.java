import java.util.Locale;

public class Main {
    public static final Point test = new Point(3, 4);
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point.x);
        test.x = 3;
        String s = String.format(Locale.ENGLISH,"<line x1=\"%.2f\" y1=\"%.2f\" x2=\"%.2f\" y2=\"%.2f\" style:\"stroke:black\" />\" ", point.x, point.y, test.x, test.y);
        System.out.println(s);

        int array[] = new int[4];
        array[2] = 2;

        int array2[] = new int[]{2, 3, 4, 5};

    }

    public Segment perpendicular(Segment segment, Point point){
        //Wyznaczenie prostej przechodzącej przez segment
        double[] lineSegment = {0, 0};
        lineSegment = segment.getline();
        //Wyznacznie współczynnika kierunkowego prostej prostopadłej.
        double a = -1 / lineSegment[0];
        double[] ppndline = {a, 0};
        //Znalezienie takiej stałej, aby druga prosta przechodziła przez punkt.
        ppndline[1] = point.y - a * point.x;
        //Znalezienie punktów leżących na prostej prostopadłej, które są w odpowiedniej odległości od zadanego punktu.

        return segment;
    }

}