import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class RoundButton extends JButton implements ActionListener{

    private int radius;

    public RoundButton(int radius, String text) {
        this.radius = radius;
        setText(text);
        setContentAreaFilled(false);
        setBorderPainted(false);

        setPreferredSize(new Dimension(radius * 2, radius * 2));

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked!");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int diameter = Math.min(width, height);

        int x = (width - diameter) / 2;
        int y = (height - diameter) / 2;

        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
        
    }
}