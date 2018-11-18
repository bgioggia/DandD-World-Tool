import java.awt.*;
import java.util.*;

public interface IRegion {

    //returns a base color for the terrain based on what
    //the ID value of the region is
    Image renderTerrain(String id);

    //Adds rivers to terrain based on what adjacent regions have rivers
    //connected to this one.
    Image addRivers(Image baseTerrain);

}
