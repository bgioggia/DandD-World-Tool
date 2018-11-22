import java.awt.*;
import java.util.*;

public class CompoundRegion extends ARegion {

    CompoundRegion(String posn) {
        super(posn);
    }

    @Override
    public Image renderTerrain(String id) {
        return null; //(//Image) (new java.awt.geom.Ellipse2D.Double());
    }

    @Override
    public Image addRivers(Image baseTerrain) {
        return null;
    }
}
