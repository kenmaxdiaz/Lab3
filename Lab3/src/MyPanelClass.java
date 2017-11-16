import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
//                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        
//                      //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                      //Second Border
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1 + 4, y1 + 4, width - 8, height - 8);
//                        
//                      //CrossOne
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                      //CrossTwo
//                        g.setColor(Color.RED);
//                        g.drawLine(x2, y1, x1, y2);
                        
                        //Oval
//                          g.setColor(Color.LIGHT_GRAY);
//                          g.fillOval(getWidth()/2 - 55/2,getHeight()/2 - 55/2 , 55, 55);
                          
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        
                        //STRIPE1
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1+36, width + 1, 45);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1+140, width + 1, 45);
                        
//                        
                        //TRIANGLE
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1 + 150, getHeight()/2);
                        p3.addPoint(x1, getHeight());
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        //STAR
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 30, y1 + 103);
                        p2.addPoint(x1 + 46, y1 + 103);
                        p2.addPoint(x1 + 52, y1 + 88);
                        p2.addPoint(x1 + 58, y1 + 103);
                        p2.addPoint(x1 + 74, y1 + 103);
                        p2.addPoint(x1 + 61, y1 + 113);
                        p2.addPoint(x1 + 66, y1 + 128);
                        p2.addPoint(x1 + 52, y1 + 118);
                        p2.addPoint(x1 + 39, y1 + 128);
                        p2.addPoint(x1 + 43, y1 + 113);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}