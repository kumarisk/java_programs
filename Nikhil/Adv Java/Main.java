import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class Main 
{    
	public static void main(String[] args) throws Exception
	{
            GridBagConstraints gbc = new GridBagConstraints();
            JFrame frame = new JFrame();
            frame.setLayout(new GridBagLayout());
            Panel s = new Panel1(); //picture 1
            Panel n = new Panel2(); //picture 2
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            gbc.weightx = 1;
            gbc.weighty = 1;
            gbc.fill = GridBagConstraints.BOTH;
            frame.add(n, gbc);
			gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            frame.add(s, gbc); //here is the problem, it replaces the previous panel
            frame.setSize(200,100);
            frame.setLocation(0,400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
