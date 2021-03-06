package essai;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.sun.awt.AWTUtilities;



public class ESSAI extends JFrame {

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
               ESSAI thisClass = new ESSAI();
               thisClass.setVisible(true);
           }
      });
   }

   public ESSAI() {
      super();
      setSize(300, 200);
      JButton jButton = new JButton();
      jButton.setBounds(275, 10, 20, 20);
      jButton.setUI(new javax.swing.plaf.basic.BasicButtonUI());
      jButton.setBorder(null);
      jButton.setText("x");
      jButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent e) {
            System.exit(0);
         }
      });
      JPanel jContentPane = new JPanel();      
      jContentPane.setLayout(null);
      jContentPane.add(jButton);
      this.setContentPane(jContentPane);
      setUndecorated(true);
      Shape sh = new RoundRectangle2D.Double(0, 0, 300, 200, 50, 50);
      AWTUtilities.setWindowShape(this, sh); // la fen�tre est un rectangle aux coins arrondis
      AWTUtilities.setWindowOpacity(this,0.9F); // la fen�tre est l�g�rement transparente.
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}