package flux;


import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.BufferedReader ;
import java.io.IOException ;
import java.io.PrintWriter;

public class Logs {

        // fonction d'écriture
	public void ecrire(String path, String text) 
	{
		PrintWriter ecri ;
		try
		{
			ecri = new PrintWriter(new FileWriter(path,true));
			ecri.println(text);
			ecri.flush();
			ecri.close();
		}
		catch (NullPointerException a)
		{
			System.out.println("Erreur : pointeur null");
		}
		catch (IOException a)
		{
			System.out.println("Problème d'IO : "+ a.getMessage()+" "+path+" "+text);
		}
	}
       public void clear (String path)
       {
    	   PrintWriter writer;
		try {
			writer = new PrintWriter(new FileWriter(path));
			writer.print("");
	    	writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
       }
        //fonction de lecture
        public String lire (String path) 
	{
		BufferedReader lect ;
		String tmp = "";
		int i=1;
		try
		{
			lect = new BufferedReader(new FileReader(path)) ;
			while (lect.ready()==true) 
			{
				tmp += i+" : "+lect.readLine()+"\n";
				i++;
			}
			lect.close();
		}//try
		catch (NullPointerException a)
		{
			System.out.println("Erreur : pointeur null");
		}
		catch (IOException a) 
		{
			System.out.println("Problème d'IO");
		}
		
		return tmp;
	} 
}
