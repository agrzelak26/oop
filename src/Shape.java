public abstract class Shape {
    protected Style style;

    public Shape(Style s) {
        style = s;
    }
    public Shape(){
        style = new Style("none", "black", 1);
    }

    public abstract String toSvg();
}