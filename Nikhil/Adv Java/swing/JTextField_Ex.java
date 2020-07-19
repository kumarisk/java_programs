import javax.swing.*;
import java.awt.*;
class JTextField_Ex extends JFrame
{
	Container con;
	Font f;
	JTextField txt;
	public JTextField_Ex()
	{
		txt=new JTextField();
		con=getContentPane();
		f=new Font("verdana",1,20);
		txt.setFont(f);
		setLayout(null);
		txt.setBounds(200,250,100,50);
		setVisible(true);
		setSize(1000,1000);
		add(txt);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Text Field");
		txt.setToolTipText("Enetr name");
	}
	public static void main(String args[])
	{
		JTextField_Ex jtxt=new JTextField_Ex();
	}
}
