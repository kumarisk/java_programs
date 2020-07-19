import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;
import java.awt.*;

public class AddComponentOnJFrameAtRuntime extends JFrame implements ActionListener
{
JPanel panel;

public AddComponentOnJFrameAtRuntime()
{
 super("Add component on JFrame at runtime");
 setLayout(new BorderLayout());
 panel=new JPanel();
 panel.setLayout(new FlowLayout());
 add(panel,BorderLayout.CENTER);
 JButton button=new JButton("CLICK HERE");
 add(button,BorderLayout.SOUTH);
 button.addActionListener(this);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(500,500);
 setVisible(true);
}

public void actionPerformed(ActionEvent evt)
{
 panel.add(new JButton("Button"));
 panel.revalidate();
 validate();
}

public static void main(String[]args)
{
 AddComponentOnJFrameAtRuntime acojfar=new AddComponentOnJFrameAtRuntime();
 final JFrame frame = new JFrame("Test");
    frame.setLayout(new GridLayout(0, 1));

    frame.add(new JButton(new AbstractAction("Click to add") {
        @Override
        public void actionPerformed(ActionEvent e) {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    frame.add(new JLabel("Bla"));
                    frame.validate();
                    frame.repaint();
                }
            });
        }
    }));

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.setVisible(true);
}
}