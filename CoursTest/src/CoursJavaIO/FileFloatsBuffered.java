package CoursJavaIO;


import java.io.*;

public class FileFloatsBuffered {
	
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private DataOutputStream dos;
	private FileInputStream fis;
	private BufferedInputStream bis;
	private DataInputStream dis;
	private double note;

	public FileFloatsBuffered (float _note)
	{
		try {
			fos = new FileOutputStream("./files/file_float.bin");
			fis = new FileInputStream("./files/file_float.bin");
			bos = new BufferedOutputStream(fos);
			bis = new BufferedInputStream(fis);
			dos = new DataOutputStream(bos);
			dis = new DataInputStream(bis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		note = _note;
	}
	public double read()
	{
		try {
			return dis.readDouble();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0.f;
	}
	public void write()
	{
		try {
			dos.writeDouble(note);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void closeOutput()
	{
		try {
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeInput()
	{
		try {
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
