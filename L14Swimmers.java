//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003
import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldFrame; 

public class L14Swimmers
{
   public static void main(String[] args)
   {
   
   //default, empty display
      Display.openWorld("");
      Display.setSize(10,10);
      Display.setSpeed(8);
      WorldFrame.getCurrent().setLocation(0, 0);
   
   //instantiates 4 Swimmers at their respective starting x-positions
      Swimmer mark = new Swimmer(2);
      Swimmer jack = new Swimmer(4);
      Swimmer bot = new Swimmer(6);
      Swimmer hint = new Swimmer(8);
   
   //Creates a threat object for each swimmer   
      Thread t1 = new Thread( mark );
      Thread t2 = new Thread( jack );
      Thread t3 = new Thread( bot );
      Thread t4 = new Thread( hint );

      
   /*Invokes the start method for each thread, which in turn,
   invokes the run method of the Swimmer class*/   
      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
}