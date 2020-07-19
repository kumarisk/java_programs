import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class Registration implements ActionListener 
{
	Connection con;
    PreparedStatement st;
	JFrame f;
	JPanel p;
	JTextField CA,NOC,SUR,FNM,MNM,MOB,FAGE,FMOB;
	JTextArea FNAME,AOC;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	JComboBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	JButton b1,jb2;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5;
	ResultSet rs;
	Object Date[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	Object Month[]={"January","February","March","April","May","June","July","August","September","October","November","Deember"};
	Object Year[]={1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005};
	Object Gender[]={"Male","Female"};
	Object Occupation[]={"Business","Service","Govt.Emp","Teacher","Other"};
	Object Course[]={"Diploma","B.E.","B.C.A.","B.COM","ICSE","CBSE"};
	Object University[]={"MSBTE","Solapur"};
	Object std[]={'I',"II","III","IV"};
	Object C_Applied[]={"C","C++","Java"};
	public Registration()
	{
		
	    try
		{
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin"); 
		  st=con.prepareStatement("insert into gayatri values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		}
        catch(Exception e){System.out.println("Exception1:"+e);}		
		
		f=new JFrame("My Frame");
		f.setSize(1000,1000);
		f.setVisible(true);
		p = new JPanel();
		//p.setSize(1000,1000);
		
		NOC=new JTextField();
		SUR=new JTextField();
		FNM=new JTextField();
		MNM=new JTextField();
		AOC=new JTextArea();
		MOB=new JTextField();
		FNAME=new JTextArea();
		FAGE=new JTextField();
		FMOB=new JTextField();		
		b1=new JButton("Save");
		l1=new Label("Course Applied:");
		l2=new Label("Name of candidate:");
		l3=new Label("Surname");
		l4=new Label("First name");
		l5=new Label("Middle name");
		l6=new Label("Address of candidate:");
		l7=new Label("Date of birth");
		l8=new Label("Gender");
		l9=new Label("Mobile");
		l10=new Label("Educational Qualifications");
		l11=new Label("Course");
		l12=new Label("University");
		l13=new Label("Year");
		l14=new Label("Information about parents");
		l15=new Label("Father's name");
		l16=new Label("Age");
		l17=new Label("Occupation");
		l18=new Label("Phone");
		
		c1=new JComboBox(C_Applied);
		c2=new JComboBox(Date);
		c3=new JComboBox(Month);
		c4=new JComboBox(Year);
		c5=new JComboBox(Gender);
		c6=new JComboBox(Course);
		c7=new JComboBox(University);
		c8=new JComboBox(std);
		c9=new JComboBox(Occupation);		 
		mb=new MenuBar();
		m1=new Menu("Student");
		m2=new Menu("Course Manage");
		m3=new Menu("Batches");
		mi1=new MenuItem("New");
		mi2=new MenuItem("Create");
		mi3=new MenuItem("Update");
		mi4=new MenuItem("Remove");
		p.setLayout(null);		
		m1.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		m2.add(mi4);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setMenuBar(mb);
		mi1.addActionListener(this);
		b1.addActionListener(this);
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,130,150,20);
		l3.setBounds(50,160,150,20);
		l4.setBounds(50,190,150,20);
		l5.setBounds(50,220,100,20);
		l6.setBounds(50,250,150,20);
		l7.setBounds(50,310,100,20);
		l8.setBounds(50,340,50,20);
		l9.setBounds(250,340,50,20);
		l10.setBounds(50,370,150,20);
		l11.setBounds(50,400,50,20);
		l12.setBounds(200,400,80,20);
		l13.setBounds(360,400,50,20);
		l14.setBounds(50,430,150,20);
		l15.setBounds(50,460,90,20);
		l16.setBounds(50,490,55,20);
		l17.setBounds(170,490,70,20);
		l18.setBounds(350,490,50,20);
			
		SUR.setBounds(200,160,300,20);
		FNM.setBounds(200,190,300,20);
		MNM.setBounds(200,220,300,20);
		AOC.setBounds(200,250,300,40);
		MOB.setBounds(300,340,100,20);
		FNAME.setBounds(170,460,300,20);
		FAGE.setBounds(100,490,50,20);
		FMOB.setBounds(410,490,100,20);
	 	
		c1.setBounds(200,100,100,20);
		c2.setBounds(170,310,40,20);
		c3.setBounds(230,310,80,20);
		c4.setBounds(330,310,80,20);
		c5.setBounds(130,340,80,20);
		c6.setBounds(110,400,80,20);
		c7.setBounds(270,400,80,20);
		c8.setBounds(390,400,40,20);
		c9.setBounds(250,490,90,20);
		b1.setBounds(300,550,80,30); 
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent windowEvent)
			{
				System.exit(0);
			}
		});
		f.add(p);
			 p.add(c1);	p.add(c2);	p.add(c3);	p.add(c4);		p.add(c5);
			p.add(c6);	p.add(c7);	p.add(c8);	p.add(c9);  
			p.add(NOC);	p.add(SUR);	p.add(FNM);	p.add(MNM);		p.add(AOC);	 
			p.add(MOB); p.add(FNAME);	p.add(FAGE); 	p.add(FMOB); 
			p.add(l1);	p.add(l2);	p.add(l3);	p.add(l4);	p.add(l5);	
			p.add(l6);	p.add(l7);	p.add(l8);	p.add(l9);	p.add(l10);	
			p.add(l11);	p.add(l12);	p.add(l13); p.add(l14);	p.add(l15);
			p.add(l16);	p.add(l17);	p.add(l18);	p.add(b1);
			p.setVisible(false);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
		{
			p.setVisible(true);
		}
		if(ae.getSource()==b1)
		{
			try
			{ 
			Statement st1=con.createStatement();
			rs=st1.executeQuery("select max(id_number) from gayatri");
			rs.next();
			int id=rs.getInt(1)+1; 
			st.setInt(1,id);
//			System.out.println(" max of gayatri= "+id);
			Object Course_applied=c1.getSelectedItem();	String Corse=Course_applied.toString();			st.setString(2,Corse);
			
			String Surname=SUR.getText();		st.setString(3,Surname);
			
			String First_name=FNM.getText();	st.setString(4,First_name);
			
			String Middle_name=MNM.getText();			st.setString(5,Middle_name);
						
			String address=AOC.getText(); 			st.setString(6,address);
			
			Object dd=c2.getSelectedItem();			String dat=dd.toString();
			
			Object mm=c3.getSelectedItem();String mont=mm.toString();String str=dat.concat(mont);
						
			Object yyyy=c4.getSelectedItem();String yer=yyyy.toString();String txt=str.concat(yer);  		st.setString(7,txt);
			
			Object gen=c5.getSelectedItem();String g=gen.toString();st.setString(8,g);
			
			String mob=MOB.getText();st.setString(9,mob);

			Object c=c6.getSelectedItem();String Y=c.toString();st.setString(10,Y);
					
			Object univer=c7.getSelectedItem();String uni=univer.toString();st.setString(11,uni);
			
			Object yr=c8.getSelectedItem();String yea=yr.toString();st.setString(12,yea); 
			
			String fnam=FNAME.getText();st.setString(13,fnam);
			
			int age=Integer.parseInt(FAGE.getText());st.setInt(14,age);
			
			Object occu=c9.getSelectedItem();String occ=occu.toString();st.setString(15,occ); 
			
			String fmob=FMOB.getText();st.setString(16,fmob);	 
			
			int result=st.executeUpdate(); System.out.println("\nRecord Inserted:"+result); 
		}
		catch(Exception e){System.out.println("\nException2:"+e);}
		try
		{
			st.close();
			con.close();				
		}
		catch(Exception e){}
		}
		
	}
	public static void main(String args[]) throws Exception
	{
		Registration r=new Registration();
	}
}