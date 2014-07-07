package CoursJavaIO;

import java.io.*;

public class TextFileWriterReader {
	
	private String filename;
	private FileWriter fw;
	private PrintWriter pw;
	private FileReader fr;
	private BufferedReader br;
	
	
	public TextFileWriterReader(String _filename){
		filename = _filename;
		try {
			fw = new FileWriter(filename);
			pw = new PrintWriter(fw);
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readAndPrintLineByLines(){
		try {
			int lineNumber =0;
			String temp;
			while(br.ready())
			{
				System.out.println("Ligne : "+lineNumber+"// "+br.readLine());
				lineNumber++;
			}
		} catch (NullPointerException a)
		{
			System.out.println("Erreur : pointeur null");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void write(String _text){
		pw.print(_text);
	}

}
