package CoursGraphics;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinesComponent extends JComponent implements MouseListener{
public boolean firstPoint;
private  static int x_1;
private  static int x_2;
private  static int y_1;
private  static int y_2;
private static class Line{
    final int x1; 
    final int y1;
    final int x2;
    final int y2;   
    final Color color;

    public Line(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }               
}

private final LinkedList<Line> lines = new LinkedList<Line>();

public void addLine(int x1, int x2, int x3, int x4) {
    addLine(x1, x2, x3, x4, Color.black);
}

public void addLine(int x1, int x2, int x3, int x4, Color color) {
    lines.add(new Line(x1,x2,x3,x4, color));        
    repaint();
}

public void clearLines() {
    lines.clear();
    repaint();
}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Line line : lines) {
        g.setColor(line.color);
        g.drawLine(line.x1, line.y1, line.x2, line.y2);
    }
}

public static void main(String[] args) {
    JFrame testFrame = new JFrame();
    testFrame.setTitle("Dessin de lignes");
    testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    final LinesComponent comp = new LinesComponent();
    comp.firstPoint = true;
    comp.setPreferredSize(new Dimension(1280, 720));
    testFrame.getContentPane().add(comp, BorderLayout.CENTER);
    JPanel buttonsPanel = new JPanel();
    JButton clearButton = new JButton("Clear");
    buttonsPanel.add(clearButton);
    comp.addMouseListener(comp);
    testFrame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
  
    clearButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            comp.clearLines();
        }
    });
    testFrame.pack();
    testFrame.setVisible(true);
}

@Override
public void mouseClicked(MouseEvent arg0) {
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	
	if(!firstPoint)
	{
		x_2 = arg0.getX();
		y_2 = arg0.getY(); 
		System.out.println("x2 :"+arg0.getX()+"/y2 :"+arg0.getY());
		Color randomColor = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
		addLine(x_1, y_1, x_2, y_2, randomColor);
		x_1 = x_2;
		y_1 = y_2;
	}
	else
	{
		x_1 = arg0.getX();
		y_1 = arg0.getY();
		System.out.println("x1 :"+arg0.getX()+"/y1 :"+arg0.getY());
		firstPoint = false;
	}
}

}