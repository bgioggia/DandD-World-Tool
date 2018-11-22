import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Biomes.*;

public class Main extends JPanel {

    Map world = new Map();
    ABiome biome1 = new Glacier("000001");
    ABiome biome2 = new Badlands("000002");
    ABiome biome3 = new ConiferousHills("001001");
    ABiome biome4 = new DeadForest("003003");

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        this.renderCell(g2d, biome1);
        this.renderCell(g2d, biome2);
        this.renderCell(g2d, biome3);
        this.renderCell(g2d, biome4);
    }

    public void renderCell(Graphics2D g2d, ABiome biome) {
        g2d.setColor(biome.getBaseColor());
        g2d.fillRect(biome.getX() * 20, biome.getY() * 20, 20, 20);
    }

    public static void main(String[] argv) {
        Main map = new Main();
        JFrame frame = new JFrame("Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(map);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
