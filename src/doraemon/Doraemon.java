/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doraemon;
import java.awt.*;
import java.applet.Applet;

/**
 *
 * @author abhij
 */
public class Doraemon extends Applet implements Runnable{

    /**
     * @param args the command line arguments
     */

    int i=0;
   public void start()
   {
       Thread t=new Thread(this);
       t.start();
   }
   public void run()
   {
       while(true)
       {
           repaint();
           try
           {
               if(i==100)
               {
                   i=i-100;
               }
               i=i+25;
               Thread.sleep(100);
           }
           catch(InterruptedException e)
           {
               
           }       
       }
   }
   public void paint(Graphics g)
   {
       this.setSize(1200,500);
       setBackground(Color.orange);
       
       //name
       Font fn=new Font("Gabriola",Font.BOLD,100);
       g.setFont(fn);
       g.setColor(Color.CYAN);
       g.drawString("Doraemon",380,80);
       Font fn1=new Font("TimesRoman",Font.BOLD,100);
       g.setFont(fn1);
       g.drawString("By Java Applet",250,470);
       g.fillOval(680,150, 10, 10);
       g.fillOval(690,155, 20, 20);
       g.fillOval(710,165, 25, 25);
       g.fillRoundRect(720,180, 200,100,50,50);
       g.setColor(Color.orange);
        g.drawString("Hii!",740,260);
       
       //Face
       g.setColor(Color.CYAN);
       g.fillOval(500, 100,150,160);
       g.setColor(Color.black);
       g.drawOval(500, 100,150,160);
       g.setColor(Color.white);
       g.fillOval(510,120,130,140);
       g.setColor(Color.red);
       g.fillOval(568,137,15,15);
       g.setColor(Color.black);
       g.drawOval(568,137,15,15);
       g.setColor(Color.WHITE);
       g.fillOval(569,137,7,7);
       g.setColor(Color.black);
       g.drawOval(550,110,25,30);
       g.fillOval(562,122,10,13);
       g.setColor(Color.WHITE);
       g.fillOval(565,128,5,5);
       g.setColor(Color.BLACK);
       g.drawOval(574,110,25,30);
       g.fillOval(578,122,10,13);
       g.drawLine(575,175,575,148);  
       g.setColor(Color.WHITE);
       g.fillOval(580,128,5,5);
       g.setColor(Color.black);
       g.drawArc(512,150,80,30,130,150);
       g.drawArc(577,150,58,28,260,160);
       g.setColor(Color.RED);
       g.fillArc(540,148,65,70,170,200);
       g.setColor(Color.black);
       g.drawArc(540,148,65,70,170,200);
       g.setColor(Color.ORANGE);
       g.fillOval(558,200,33,20);
       g.setColor(Color.black);
       g.drawOval(558,200,33,20);
       
       g.setColor(Color.BLACK);
       g.drawLine(560,150,510,140);
       g.drawLine(560,160,510,160);
       g.drawLine(560,170,510,180);
       g.drawLine(640,140,590,150);
       g.drawLine(640,160,590,160);
       g.drawLine(640,180,590,170);
       
       //Body
       g.setColor(Color.cyan);
       g.fillRoundRect(510,255,120,130,40,40);
       g.setColor(Color.black);
       g.drawRoundRect(510,255,120,130,40,40);
       g.setColor(Color.white);
       g.fillOval(520,230,100,120);
       g.setColor(Color.red);
       g.fillOval(529,248,80,8);
       g.setColor(Color.yellow);
       g.fillOval(557,253,30,30);
       
       
       //right hand
       g.setColor(Color.black);
       g.drawLine(520,257,450,300-i);
       g.setColor(Color.cyan);
       g.drawLine(520,258,450,301-i);
       g.drawLine(520,259,450,302-i);
       g.drawLine(520,260,450,303-i);
       g.drawLine(520,261,450,304-i);
       g.drawLine(520,262,450,305-i);
       g.drawLine(520,263,450,306-i);
       g.drawLine(520,264,450,307-i);
       g.drawLine(520,265,450,308-i);
       g.drawLine(520,266,450,309-i);
       g.drawLine(520,267,450,310-i);
       g.drawLine(520,268,450,311-i);
       g.drawLine(520,269,450,312-i);
       g.drawLine(520,270,450,313-i);
       g.drawLine(520,271,450,314-i);
       g.drawLine(520,272,450,315-i);
       g.drawLine(520,273,450,316-i);
       g.drawLine(520,274,450,317-i);
       g.drawLine(520,275,450,318-i);
       g.drawLine(520,276,450,319-i);
       g.setColor(Color.black);
       g.drawLine(520,277,450,320-i);
       g.setColor(Color.white);
       g.fillOval(435,295-i,26,35);
       g.setColor(Color.black);
       g.drawOval(435,295-i,26,35);
       //left hand
       g.drawLine(700,300,621,257);
       g.setColor(Color.cyan);
       g.drawLine(700,301,621,258);
       g.drawLine(700,302,621,259);
       g.drawLine(700,303,621,260);
       g.drawLine(700,304,621,261);
       g.drawLine(700,305,621,262);
       g.drawLine(700,306,621,263);
       g.drawLine(700,307,621,264);
       g.drawLine(700,308,621,265);
       g.drawLine(700,309,621,266);
       g.drawLine(700,310,621,267);
       g.drawLine(700,311,621,268);
       g.drawLine(700,312,621,269);
       g.drawLine(700,313,621,270);
       g.drawLine(700,314,621,271);
       g.drawLine(700,315,621,272);
       g.drawLine(700,316,621,273);
       g.drawLine(700,317,621,274);
       g.drawLine(700,318,621,275);
       g.setColor(Color.black);
       g.drawLine(700,319,621,276);
       g.setColor(Color.white);
       g.fillOval(680,290,26,35);
       g.setColor(Color.black);
       g.drawOval(680,290,26,35);
       
       //bell
       g.setColor(Color.black);
       g.drawArc(555,260,50,20,80,80);
       g.drawArc(555,263,50,20,80,80);
       g.drawArc(570,272,5,25,5,70);
       g.setColor(Color.RED);
       g.fillOval(570,267,7,7);
       
       //bag
       g.setColor(Color.black);
       g.drawArc(540,260,65,70,170,200);
       g.drawArc(542,260,60,68,170,200);
       g.drawLine(540,288,605,288);
       
       //leg
       g.setColor(Color.orange);
       g.fillArc(540,337,60,50,250,50);
       g.setColor(Color.white);
       g.fillOval(510,375,50,30);
       g.fillOval(580,375,50,30);
       g.setColor(Color.black);
       g.drawOval(510,375,50,30);
       g.drawOval(580,375,50,30);
       
       
   }
    
}
