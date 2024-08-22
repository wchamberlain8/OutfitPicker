import javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Frame extends JFrame {
    
    public Frame(){
        setTitle("Outfit Picker");
        setSize(600, 1000);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpComponents();
    }

    private void setUpComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 0, 5));
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(600, 1000));

        JPanel topPane = new JPanel();
        topPane.setLayout(new java.awt.FlowLayout());
        panel.add(topPane);

        JPanel middlePane = new JPanel();
        panel.add(middlePane);
        

        JPanel bottomPane = new JPanel();
        panel.add(bottomPane);

        Tile hatTile = new Tile("HAT", 150, 150);
        hatTile.setBackground(Color.GREEN);
        topPane.add(hatTile);

        Tile outerwearTile = new Tile("OUTERWEAR", 200, 200);
        middlePane.add(outerwearTile);

        Tile shirtTile = new Tile("SHIRT", 200, 200);
        middlePane.add(shirtTile);

        Tile pantsTile = new Tile("PANTS", 150, 200);
        bottomPane.add(pantsTile);

        MenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);

        add(panel);
    }

}
