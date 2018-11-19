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
        int value = 0;
        switch(hex) {
            case "a":
                value = 10;
                break;
            case "b":
                value = 11;
                break;
            case "c":
                value = 12;
                break;
            case "d":
                value = 13;
            case "e":
                value = 14;
                break;
            case "f":
                value = 15;
                break;
            default:
                value = Integer.parseInt(hex);
                break;
        }
        return value;
    }



    //creates image of cell based
    private Image renderCell() {
        if (this.hasHills) {

        }

        if (this.hasMountains) {

        }
    }

}
