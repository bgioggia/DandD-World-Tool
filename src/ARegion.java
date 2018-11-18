import Biomes.*;
import java.util.*;
import java.awt.*;

public abstract class ARegion implements IRegion{

    HashMap<String, ABiome> regionList;

    //Abstract Constructor
    ARegion() {
        this.populateRegionList();

    }

    //
    public void populateRegionList() {
        this.regionList.put("GM", new Glacier(Color.blue, false, "000000"));
        this.regionList.put("MN", new ABiome());
        this.regionList.put("MM", new ABiome());
        this.regionList.put("CM", new ABiome());
        this.regionList.put("DM", new ABiome());
        this.regionList.put("JM", new ABiome());

    }


}
