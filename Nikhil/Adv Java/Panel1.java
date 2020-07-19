//Panel1.java

    import javax.swing.*;
    import java.awt.*;
    import java.net.URL;

    public class Panel1 extends JPanel {
        ImageIcon anotherIcon;

        public Panel1 ( ) {
            URL imageURL = Panel1.class.getResource("images/puppy.png");
            anotherIcon = new ImageIcon(imageURL);
        }

        public void paint(Graphics g) {
            super.paintComponent(g);
            anotherIcon.paintIcon(this, g, 0, 0);
        }
    }