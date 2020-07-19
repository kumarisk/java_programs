import javax.swing.*;
import java.awt.*;
class JTextField_Ex1 extends JFrame
{
	Container con;
	Font f;
	JButton b1;
	JTextField txt;
	public JTextField_Ex1()
	{
		txt=new JTextField();
		con=getContentPane();
		b1=new JButton("Save");
		f=new Font("verdana",1,20);
		txt.setFont(f);
		setLayout(null);
		txt.setBounds(200,250,200,100);
		b1.setBounds(200,400,80,20);
		setVisible(true);
		setSize(1000,1000);
		txt.setText("Gayatri Infotech");
		add(txt);
		add(b1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Text Field");
	}
	public static void main(String args[])
	{
		JTextField_Ex1 jtxt=new JTextField_Ex1();
	}
}