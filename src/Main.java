import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.HashMap;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Biomes.*;

public class Main extends JPanel {
    Map world;

    public Main() {
       world = new Map(100);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        /*for(ABiome biome: world.zones) {
            this.renderCell(g2d, biome);
        }*/

        for (java.util.Map.Entry<Posn,ABiome> entry : world.zones.entrySet()) {
            this.renderCell(g2d, world.zones.get(entry.getKey()));
        }

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
