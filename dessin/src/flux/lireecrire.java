package flux;

import flux.*;

import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class lireecrire {
	
	private static FileInputStream fist;

	private static void ecrire (int note,String fic)throws IOException
	{
		try{
			FileOutputStream fos = new FileOutputStream(fic);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeInt(note);
			dos.close();
		}
		catch (IOException e)
		{
			new IOException();
		}
	}
	
	@SuppressWarnings("finally")
	private static double lire () throws IOException
	{
		int result=0;
		try{
			FileInputStream fis = new FileInputStream("f.bin");
			fist = new FileInputStream("f2.bin");
			SequenceInputStream fiste= new SequenceInputStream(fis, fist);
			BufferedInputStream bis = new BufferedInputStream(fiste);
			@SuppressWarnings("resource")
			DataInputStream dos = new DataInputStream(bis);
			while(true)
		    	result += dos.readInt();
		}
		catch (IOException e)
		{
			
			new IOException();
		}
		finally
		{
			return result;
		}
	}

	public static void main (String [] args) throws IOException
	{
		Logs loges = new Logs() ;
		double note =0;
		//note=lire();
		ecrire (12,"f.bin");
		ecrire (23,"f2.bin");
		note=lire();
		System.out.println(note);
		String lu= loges.lire("exo_java.txt");
		System.out.println(lu);
	}
}
