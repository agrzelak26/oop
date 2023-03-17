public class SolidFilledPolygon extends Polygon {
    public String color;
    public SolidFilledPolygon(Vec2[] points, String color) {
        super(points);
        this.color = color;
    }

    @Override
    public String toSvg(String parameters){
        String output = String.format("fill=\"%s\" %s ", color, parameters);
        return super.toSvg(output);
    }
}
