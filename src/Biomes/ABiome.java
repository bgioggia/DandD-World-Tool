package Biomes;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;


 public abstract class ABiome {
     private Color baseColor;
     private int x;
     private int y;
     private int treeDensity;
     private int terrainType;

     public Color getBaseColor() {
         return this.baseColor;
     }

     public int getX() {
         return this.x;
     }

     public int getY() {
         return this.y;
     }


     //Constructor
     ABiome(Color color, int posn, int terrainType, int treeDensity) {
         this.baseColor = color;
         this.treeDensity = treeDensity;
         this.terrainType = terrainType;
         this.x = this.getX(posn);
         this.y = this.getY(posn);
     }

     //Converts the first half of the hex string to a decimal integer
     private int getX(String posn) {
         return Integer.parseInt(posn.substring(0,3), 16);
        /* return (this.convertHexToDec(posn.substring(0, 1).toLowerCase()) * 16 * 16) +
                 (this.convertHexToDec(posn.substring(1, 2).toLowerCase()) * 16) +
                 (this.convertHexToDec(posn.substring(2, 3).toLowerCase()));*/
     }

     //Converts the second half of the hex string to a decimal integer
     private int getY(String posn) {
         return Integer.parseInt(posn.substring(3,6), 16);
         /*return (this.convertHexToDec(posn.substring(3, 4).toLowerCase()) * 16 * 16) +
                 (this.convertHexToDec(posn.substring(4, 5).toLowerCase()) * 16) +
                 (this.convertHexToDec(posn.substring(5, 6).toLowerCase()));*/
     }

     //creates image of cell based
     private Image renderCell(Graphics g) {
         Graphics2D g2d = (Graphics2D) g;

         switch (this.terrainType) {
             case 1:  //hills
                 break;
             case 2:  //mountains
                 break;
             case 3:  //dunes
                 break;
             case 4:  //water
                 break;
             case 5: //dead hills
                 break;
             default: //flat
                 break;
         }

         switch (this.treeDensity) {
             case 1: //forest
                 break;
             case 2: //Jungle
                 break;
             case 3: //fungal
                 break;
             case 4: //dead forest
                 break;
             case 5: //Wetlands
                 break;
             default: //none
                 break;
         }

         return null;
     }
 }

