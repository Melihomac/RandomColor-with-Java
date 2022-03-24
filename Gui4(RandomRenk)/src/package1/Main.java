package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JPanel {
    public Color Main() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return (new Color(red,green,blue));
    }
    public class MouseListener extends MouseAdapter {
        @Override
        public void mouseClicked (MouseEvent e) {
            setBackground(Main());
        }
    }
    public Main() {
        setBackground(Main());
        addMouseListener(new MouseListener());
    }
    public static void main (String args []) {
        JFrame gui = new JFrame();
        gui.setTitle("Rastgele Renkler");
        gui.setSize(300,300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(5,5));
        for (int x= 1; x<=25; x++) {
            Main m = new Main();
            pane.add(m);
        }
        gui.setVisible(true);
    }
}
