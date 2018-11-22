import java.awt.*;
import java.util.*;

public class SingleRegion extends ARegion {

    SingleRegion(String posn) {
        super(posn);
    }

    @Override
    public Image renderTerrain(String id) {
        return null;
    }

    @Override
    public Image addRivers(Image baseTerrain) {
        return null;
    }


}
