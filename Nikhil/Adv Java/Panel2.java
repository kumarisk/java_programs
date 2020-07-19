//Panel2.java

    import javax.swing.*;
    import java.awt.*;
    import java.net.URL;

    public class Panel2 extends JPanel {
        ImageIcon anotherIcon;

        public Panel2 ( ) {
            URL imageURL = Panel2.class.getResource("images/puppy2.png");
            anotherIcon = new ImageIcon(imageURL);
        }

        public void paint(Graphics g) {
            super.paintComponent(g);
            anotherIcon.paintIcon(this, g, 0, 0);
        }
    }