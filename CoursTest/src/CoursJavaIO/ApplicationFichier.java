package CoursJavaIO;


import java.io.*;

public class ApplicationFichier {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*FileFloats wf = new FileFloats(2.0f);
		wf.write();
		wf.closeOutput();
		System.out.println("Lecture du fichier : "+wf.read());
		wf.closeInput();
		
		
		FileFloatsBuffered wfb = new FileFloatsBuffered(2.0f);
		wfb.write();
		wfb.closeOutput();
		System.out.println("Lecture du fichier en buffered: "+wfb.read());
		wfb.closeInput();*/
		
		
		//Lire a partir de plusieurs fichiers
		//SequenceExample sq = new SequenceExample();
		
		//Lire jusqu'à la fin du fichier
		/*FileInputStream fis = new FileInputStream("./files/file_float.bin");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		int somme = 0;
		boolean no_eof = true;
		try 
		{
			while(no_eof)
				somme+=dis.readInt();
		}catch(EOFException e){
			no_eof = false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Resultat de la somme : "+ somme);*/
		
		TextFileWriterReader gestion = new TextFileWriterReader("./files/file_test.txt");
		gestion.readAndPrintLineByLines();
		
	}

}
