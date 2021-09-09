import java.applet.Applet; 
 import java.awt.*; 
 import java.awt.event.*; 
 @Deprecated(since = "4.5", forRemoval = true)
 public class shapedrawing extends Applet 
 { 
       public static void main(String[] args) 
    { 
      Frame drawing = new Frame("DrawingApplet"); 
      drawing.setSize(500, 500); 
      Applet shapedrawing = new shapedrawing(); 
      drawing.add(shapedrawing); 
      drawing.setVisible(true); 
      drawing.addWindowListener(new WindowAdapter() { 
      public void windowClosing(WindowEvent e) {System.exit(0); } 
                                                                              }); 
   } 
            public void paint(Graphics g) 
             { 
				          g.setColor(Color.red);
				          g.fillOval(0,0,170,175);

				          g.setColor(Color.yellow);
						  g.fillRect(100,190,170,175);
     
                          int x1[] = { 250,320,170,250 }; 
                          int y1[] = { 100,150,150,100}; 
                       
					      g.setColor(Color.blue);
						  g.fillPolygon(x1, y1,4);
        } 
 } 