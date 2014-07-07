package CoursJavaIO;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceExample {

		public SequenceExample() throws FileNotFoundException
		{
			FileOutputStream fos = new FileOutputStream("./files/file_float.bin",true);
			DataOutputStream dos = new DataOutputStream(fos);
			try {
				dos.writeInt(20);
				dos.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			FileOutputStream fos2 = new FileOutputStream("./files/file_float2.bin",true);
			DataOutputStream dos2 = new DataOutputStream(fos2);
			try {
				dos2.writeInt(65);
				dos2.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			FileInputStream fis = new FileInputStream("./files/file_float.bin");
			FileInputStream fis2 = new FileInputStream("./files/file_float2.bin");
			SequenceInputStream sis = new SequenceInputStream(fis,fis2);
			int x=0,y;
			try {
				while((y=sis.read())!=-1){
					x+=y;		
				}
				sis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Resultat : "+x);
		}
}
