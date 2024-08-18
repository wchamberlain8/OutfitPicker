import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MenuBar extends JMenuBar {
    
    public MenuBar(){
        JMenu newMenu = new JMenu("File");
        addMenuItem(newMenu, "Save");

        this.add(newMenu);
    }


    private void addMenuItem(JMenu menu, String title) {
        JMenuItem menuItem = new JMenuItem(title);
        //menuItem.addActionListener(actionListener);
        menu.add(menuItem);
    }

}

