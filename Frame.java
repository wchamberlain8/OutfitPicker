import javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Frame extends JFrame {
    
    public Frame(){
        setTitle("Outfit Picker");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpComponents();
    }

    private void setUpComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 0, 5));
        panel.setBackground(Color.BLUE);

        JPanel topPane = new JPanel();
        topPane.setLayout(new java.awt.FlowLayout());
        panel.add(topPane);

        JPanel middlePane = new JPanel();
        panel.add(middlePane);
        

        JPanel bottomPane = new JPanel();
        panel.add(bottomPane);

        Tile newTile = new Tile("HAT");
        newTile.setBackground(Color.GREEN);
        topPane.add(newTile);

        MenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);

        add(panel);
    }

}
