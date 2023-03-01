import java.util.Locale;

public class Main {
    public static final Point test = new Point(3, 4);
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point.x);
        test.x = 3;
        //<line x1=\"%f\" y1=\"%f\" x2=\"%f"\ y2=\"%f"\ style:"stroke:black" />"
        String s = String.format(Locale.ENGLISH,"<line x1=\"%f\" y1=\"%f\" x2=\"%f\" y2=\"%f\" style:\"stroke:black\" />\" ", point.x, point.y, test.x, test.y);
        System.out.println(s);

        int array[] = new int[4];
        array[2] = 2;

        int array2[] = new int[]{2, 3, 4, 5};


    }

}