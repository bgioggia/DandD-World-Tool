import Biomes.*;
import java.util.*;

public abstract class ARegion implements IRegion{

    HashMap<String, ABiome> regionList = new HashMap<>();

    //Abstract Constructor
    ARegion() {
        this.populateRegionList();

    }

    //
    public void populateRegionList() {
        this.regionList.put("GM", new Glacier());
        this.regionList.put("MN", new Mountain());
        this.regionList.put("MM", new MixedMountain());
        this.regionList.put("CM", new ConiferousMountain());
        this.regionList.put("DM", new DecidiousMountain());
        this.regionList.put("JM", new JungleMountain());
        this.regionList.put("JH", new JungleHills());
        this.regionList.put("ST", new Steppe());
        this.regionList.put("ZH", new FrozenHills());
        this.regionList.put("HL", new Hills());
        this.regionList.put("CH", new ConiferousHills());
        this.regionList.put("DH", new DecidiousHills());
        this.regionList.put("XH", new DeadHills());
        this.regionList.put("BD", new Badlands());
        this.regionList.put("SH", new ShurblandHills());
        this.regionList.put("GH", new GrassyHills());
        this.regionList.put("IH", new MixedHills());
        this.regionList.put("DN", new SandDunes());
        this.regionList.put("FF", new FrozenForest());
        this.regionList.put("XF", new DeadForest());
        this.regionList.put("CF", new ConiferousForest());
        this.regionList.put("IF", new MixedForest());
        this.regionList.put("FG", new Fungal());
        this.regionList.put("DF", new DecidiousForest());
        this.regionList.put("JG", new Jungle());
        this.regionList.put("RD", new RockyDesert());
        this.regionList.put("PF", new PalmForest());
        this.regionList.put("CD", new ColdDesert());
        this.regionList.put("SB", new Shrubland());
        this.regionList.put("SD", new SandyDesert());
        this.regionList.put("GL", new GrassLand());
        this.regionList.put("PR", new Praire());
        this.regionList.put("SL", new SnowField());
        this.regionList.put("SV", new Savanna());
        this.regionList.put("GR", new GrazingLand());
        this.regionList.put("SW", new Swamp());
        this.regionList.put("JL", new JungleLowlands());
        this.regionList.put("CW", new ConiferousWetlands());
        this.regionList.put("RS", new Marsh());
        this.regionList.put("NG", new Mangrove());
        this.regionList.put("JW", new JungleWetlands());
        this.regionList.put("OC", new Ocean());


    }


}
