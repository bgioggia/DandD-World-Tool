import java.awt.*;
import java.util.*;

public class CompoundRegion extends ARegion {

    CompoundRegion() {
        super();
    }

    @Override
    public Image renderTerrain(String id) {
        return (Image) (new java.awt.geom.Ellipse2D.Double());
    }

    @Override
    public Image addRivers(Image baseTerrain) {
        return null;
    }
}
