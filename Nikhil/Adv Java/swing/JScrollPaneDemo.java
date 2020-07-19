import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

class JScrollPaneDemo
{
  public static void main(String[] args)
  {
    new JScrollPaneDemo();
  }
  
  public JScrollPaneDemo()
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        JTextArea textArea = new JTextArea();
        textArea.setText("xx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\n");
        JScrollPane scrollPane = new JScrollPane(textArea);
        JFrame frame = new JFrame("JScrollPane Test");
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(240, 180));
        frame.setLocationRelativeTo(null);
		frame.setVisible(true);
      }
    });
  }
}