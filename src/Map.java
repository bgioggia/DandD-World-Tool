import java.awt.*;
import java.util.*;
import Biomes.*;

public class Map {

    public HashMap<Posn, ABiome> zones = new HashMap();

    /* Map(int size) {
         generateMap(size);
     }


     private void generateMap(int size) {
         for (int i = 0; i < size * size; i++) {
             this.zones.add( new Glacier(i % size, i / size));
         }
     }

 }*/
    //HashMap to represent the zones
   //public HashMap<String, ABiome> zones; // = new HashMap<>();
    Random randTemp = new Random();

    Map(int size) {
        generateMap(size);
    }

    private void generateMap(int size) {
        for (int i = 0; i < size * size; i++) {
            if((i % 2) == 0) {
                this.zones.put((new Posn((i / size), (i % size))),
                        new Glacier(i / size, i % size));
            }
            /*else if((i % 5) == 0) {
                this.zones.put((Integer.toHexString(i / size) + (Integer.toHexString(i % size))),
                        new Badlands(i / size, i % size));
            }*/
            else {
                this.zones.put((new Posn((i / size), (i % size))),
                        new ConiferousMountain(i / size, i % size));
            }

        }

    }
}




      //  Integer.toHexString()