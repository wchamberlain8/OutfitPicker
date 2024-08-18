import javax.swing.*;

public class main{

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {

        }

        SwingUtilities.invokeLater(() -> {
            Frame frame = new Frame();
            frame.setVisible(true);
        });

    }

}