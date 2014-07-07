package tpGraphique;



import tpGraphique.*;
import javax.swing.SwingUtilities;
public class appli {

		public static void main ( String [] args)
		{
			Runnable r = new Runnable ()
			{
			    public void run()  {
			        new exo1bis();
			    }
			};
			SwingUtilities.invokeLater(r);
		}
}
