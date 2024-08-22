import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Tile extends JPanel {

    private String text;
    private String imagePath;
    private int width;
    private int height;

    // Constructor to initialize the tile with text and image
    public Tile(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;

        imagePath = "resources/placeholders/placeholder.jpg";
        
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(width, height));
        
        //Creating the text/title label
        JLabel title = new JLabel(text, SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);
        
        //Creating the image section
        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(width - 50, height - 50, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(image));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);
        
        //Adding a border
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

}
