import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
class TreeEx extends JFrame 
{
   JTree t;
   DefaultMutableTreeNode root,root1,node1,node2,node3,root2,node4,node5,node6;
   Font f;
   Component c;
   public TreeEx()
   {
	   f=new Font("arial",1,20);
	  // root.setFont(f);
     root=new DefaultMutableTreeNode("City");
     root1=new DefaultMutableTreeNode("Solapur");
	 root2=new DefaultMutableTreeNode("Pune");
	 node1=new DefaultMutableTreeNode("WIT");
	 node2=new DefaultMutableTreeNode("BMIT");
	 node3=new DefaultMutableTreeNode("Orchid");
	 node4=new DefaultMutableTreeNode("COP");
	 node5=new DefaultMutableTreeNode("MIT");
	 node6=new DefaultMutableTreeNode("VIT");
	 root1.add(node1);
	 root1.add(node2);
	 root1.add(node3);
	 root2.add(node4);
	 root2.add(node5);
	 root2.add(node6);
	 root.add(root1);
	 root.add(root2);
	 t=new JTree(root);
	/*   c = t.getCellRenderer().getTreeCellRendererComponent(t,node1, false, false, false, 0, false);
	c.setFont("verdana",1,30); */

	 add(t);
   }
   public static void main(String args[])
   {
      TreeEx te=new TreeEx();
	  te.setSize(1000,1000);
	  te.setVisible(true);
   }
}