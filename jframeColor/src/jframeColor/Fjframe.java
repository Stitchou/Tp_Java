package jframeColor;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

 class Fjframe extends JFrame implements ActionListener
 {  JPanel panel;
     JMenuBar mbar;
     JMenu m1;
     JMenu m2;

  public Fjframe()
    { setTitle("Test de JFrame");
       setSize(300,200);
       // gestion evenementielle de la fermeture de la fenêtre
       addWindowListener(new WindowAdapter()
           {public void windowClosing(WindowEvent e)
                  {System.exit(0);
                  }
             } ) ;
        // utilisation d'un toolkit pour l'affichage
        // d'une icone associée à la fenêtre
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image JFrameIcon = tk.getImage("icon.gif");
        setIconImage(JFrameIcon);

        // insertion d'objets graphiques sur la fenêtre
        // à partir d'un panneau
        panel = new JPanel();

        Container contentPane = getContentPane();
        panel.setBackground(Color.blue);
        contentPane.add(panel);
        // Ajout d'une barre de menus à la fenêtre
        mbar = new JMenuBar();
        m1 = new JMenu("Couleur fond");
        JMenuItem m11 = new JMenuItem("Jaune");
        m11.addActionListener(this); // installation d'un écouteur d'action
        m1.add(m11);  // ajout d'une option à un menu
        JMenuItem m12 = new JMenuItem("Rouge");
        m12.addActionListener(this);
        m1.add(m12);
        m2 = new JMenu("Couleur menu");
        JMenuItem m21 = new JMenuItem("Bleu");
        m21.addActionListener(this);
        m2.add(m21);
        JMenuItem m22 = new JMenuItem("Vert");
        m22.addActionListener(this);
        m2.add(m22);
        mbar.add(m1);  // ajout de menus à la barre de menus
        mbar.add(m2);
        setJMenuBar(mbar);
     }

  public void actionPerformed(ActionEvent evt)
    {  if (evt.getSource()instanceof JMenuItem) 
             // gestion des événements liés aux menus
            { String ChoixOption = evt.getActionCommand();
               if (ChoixOption.equals("Jaune"))panel.setBackground(Color.yellow);
               else if (ChoixOption.equals("Rouge"))panel.setBackground(Color.red);
               else if (ChoixOption.equals("Bleu"))
                              {mbar.setBackground(Color.blue);
                                m1.setBackground(Color.blue);
                                m2.setBackground(Color.blue);
                              } 
               else if (ChoixOption.equals("Vert"))
                             {mbar.setBackground(Color.green);
                               m1.setBackground(Color.green);
                               m2.setBackground(Color.green);
                              };
               };
     }
 } 