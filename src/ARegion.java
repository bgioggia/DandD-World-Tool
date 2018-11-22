import Biomes.*;
import java.util.*;

public abstract class ARegion implements IRegion{
     String posn;
     HashMap<String, ABiome> regionList = new HashMap<>();

    //Abstract Constructor
    ARegion(String posn) {
        this.posn = posn;
        this.populateRegionList(posn);
    }

    //
    public void populateRegionList(String posn) {
        this.regionList.put("GM", new Glacier(posn));
        this.regionList.put("MN", new Mountain(posn));
     /*   this.regionList.put("MM", new MixedMountain(posn));
        this.regionList.put("CM", new ConiferousMountain(posn));
        this.regionList.put("DM", new DecidiousMountain(posn));
        this.regionList.put("JM", new JungleMountain(posn));
        this.regionList.put("JH", new JungleHills(posn));
        this.regionList.put("ST", new Steppe(posn));
        this.regionList.put("ZH", new FrozenHills(posn));
        this.regionList.put("HL", new Hills(posn));
        this.regionList.put("CH", new ConiferousHills(posn));
        this.regionList.put("DH", new DecidiousHills(posn));
        this.regionList.put("XH", new DeadHills(posn));
        this.regionList.put("BD", new Badlands(posn));
        this.regionList.put("SH", new ShurblandHills(posn));
        this.regionList.put("GH", new GrassyHills(posn));
        this.regionList.put("IH", new MixedHills(posn));
        this.regionList.put("DN", new SandDunes(posn));
        this.regionList.put("FF", new FrozenForest(posn));
        this.regionList.put("XF", new DeadForest(posn));
        this.regionList.put("CF", new ConiferousForest(posn));
        this.regionList.put("IF", new MixedForest(posn));
        this.regionList.put("FG", new Fungal(posn));
        this.regionList.put("DF", new DecidiousForest(posn));
        this.regionList.put("JG", new Jungle(posn));
        this.regionList.put("RD", new RockyDesert(posn));
        this.regionList.put("PF", new PalmForest(posn));
        this.regionList.put("CD", new ColdDesert(posn));
        this.regionList.put("SB", new Shrubland(posn));
        this.regionList.put("SD", new SandyDesert(posn));
        this.regionList.put("GL", new GrassLand(posn));
        this.regionList.put("PR", new Praire(posn));
        this.regionList.put("SL", new SnowField(posn));
        this.regionList.put("SV", new Savanna(posn));
        this.regionList.put("GR", new GrazingLand(posn));
        this.regionList.put("SW", new Swamp(posn));
        this.regionList.put("JL", new JungleLowlands(posn));
        this.regionList.put("CW", new ConiferousWetlands(posn));
        this.regionList.put("RS", new Marsh(posn));
        this.regionList.put("NG", new Mangrove(posn));
        this.regionList.put("JW", new JungleWetlands(posn));
        this.regionList.put("OC", new Ocean(posn));*/
    }
}
