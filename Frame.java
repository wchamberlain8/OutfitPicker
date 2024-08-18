import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Frame extends JFrame {
    
    public Frame(){
        setTitle("Outfit Picker");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpComponents();
    }

    private void setUpComponents(){
        JPanel panel = new JPanel(new BorderLayout());

        JPanel topPane = new JPanel();
        JPanel middlePane = new JPanel();
        JPanel bottomPane = new JPanel();

        JLabel topLabel = new JLabel("TOP");
        JLabel middleLabel = new JLabel("MIDDLE");
        JLabel bottomLabel = new JLabel("BOTTOM");

        MenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);

        topPane.setPreferredSize(new Dimension(200, 200));
        middlePane.setPreferredSize(new Dimension(200, 200));
        bottomPane.setPreferredSize(new Dimension(200, 200));
        topPane.setBackground(Color.BLUE);

        topPane.add(topLabel);
        middlePane.add(middleLabel);
        bottomPane.add(bottomLabel);

        panel.add(topPane, BorderLayout.NORTH);
        panel.add(middlePane, BorderLayout.CENTER);
        panel.add(bottomPane, BorderLayout.SOUTH);

        add(panel);
    }

}
