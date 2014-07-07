package CoursJavaIO;


import java.io.*;

public class FileFloats {
	
	private FileOutputStream fos;
	private DataOutputStream dos;
	private FileInputStream fis;
	private DataInputStream dis;
	private double note;

	public FileFloats (float _note)
	{
		try {
			fos = new FileOutputStream("./files/file_float.bin");
			fis = new FileInputStream("./files/file_float.bin");
			dos = new DataOutputStream(fos);
			dis = new DataInputStream(fis);
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
