import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
public class SvgScene {
    private List<Polygon> polygons;
    public SvgScene(){
        polygons = new ArrayList<Polygon>();
    }

    public void addPolygon(Polygon polygon){
        polygons.add(polygon);
    }
    /*public void save(String path){
        FileWriter file;
        try {
                file = new FileWriter(path);
        }
        catch(Exception cokolwiek){}
        for (Polygon p: this.polygons){
            file.write(p.toSvg());
        }
        catch(Exception){return;}
    }*/
}
