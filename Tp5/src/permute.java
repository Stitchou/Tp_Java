import java.lang.*;

public class permute 
{
	public static void main(String [] args)
	{	
		int []a= { 10,20,30 };
		int []b={15,25,35};
		
		int []c ;
		c=a;
		a=b;
		b=c;
		
		StringBuffer [] [] t;
		t=new StringBuffer [4][];
		int i;
		
		for(i=0;i<t.length;i++)
		{
			t[i]=new StringBuffer [i+1];
		}
	}
	

}
 