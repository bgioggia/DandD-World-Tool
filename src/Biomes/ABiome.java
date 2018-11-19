package Biomes;
import java.awt.*;
import java.util.*;

 public abstract class ABiome {
     private Color baseColor;
     private int x;
     private int y;
     private boolean isWater;
     private int treeDensity;
     private boolean hasMountains;
     private boolean hasHills;



    //Ocean constructor
    ABiome(Color color, boolean waterFlag, String posn) {
        this.baseColor = color;
        this.isWater = waterFlag;
        this.treeDensity = 0;
        this.hasMountains = false;
        this.x = this.getX(posn);
        this.y = this.getY(posn);

    }

    //Land Constructor
    ABiome(Color color, boolean isWater, int treeDensity, boolean hasMountains, boolean hasHills, String posn) {
        this.baseColor = color;
        this.isWater = isWater;
        this.treeDensity = treeDensity;
        this.hasMountains = hasMountains;
        this.hasHills = hasHills;
        this.x = this.getX(posn);
        this.y = this.getY(posn);


    }

    //Converts the first half of the hex string to a decimal integer
   private int getX(String posn) {
        return (this.convertHexToDec(posn.substring(0,1).toLowerCase()) * 16 * 16) +
                (this.convertHexToDec(posn.substring(1,2).toLowerCase()) * 16) +
                (this.convertHexToDec(posn.substring(2,3).toLowerCase()));
    }

    //Converts the second half of the hex string to a decimal integer
    private int getY(String posn) {
        return (this.convertHexToDec(posn.substring(3,4).toLowerCase()) * 16 * 16) +
                (this.convertHexToDec(posn.substring(4,5).toLowerCase()) * 16) +
                (this.convertHexToDec(posn.substring(5,6).toLowerCase()));
    }

    //convert a given hex value char to its associated int value
    private int convertHexToDec(String hex) {
        if(hex.equals("a")) {
            return 10;
        }
        else if(hex.equals("b")) {
            return 11;
        }
        else if(hex.equals("c")) {
            return 12;
        }
        else if(hex.equals("d")) {
            return 13;
        }
        else if(hex.equals("e")) {
            return 14;
        }
        else if(hex.equals("f")) {
            return 15;
        }
        else {
            return (Integer.parseInt(hex));
        }
    }

    //creates image of cell based
    private Image renderCell() {
        if (this.hasHills) {

        }

        if (this.hasMountains) {

        }
    }

}
