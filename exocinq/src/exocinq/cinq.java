package exocinq;
import java.util.ArrayList;

public class cinq 
{
	
	public static void main(String [] args)
	{
		String[] tabmotgen= {"aas","ace","alu","are","api","ays","bec","bel","bey","ben","boy","deb","des","dom","dot","dow",
							"fax","fan","faq","fob","fem","hem","fop","man","mao","mug","mus","mie","sur","dey","mur"};
		ArrayList<ArrayList<String>> base=new ArrayList();
        ArrayList<String> voisins=new ArrayList();
        
        int i,j,k,nombretrouver,resultat,place;
        boolean ok;
        String initiale,comparer;
        
        for(i=0;i<tabmotgen.length-1;i++)
        {
        	initiale=tabmotgen[i];
        	voisins.add(initiale);
    		System.out.println(" ");
    		System.out.print(i+" "+initiale+" ");
        	for(j=0;j<tabmotgen.length-1;j++)
        	{
        		if(j!=i)
        		{
	        		comparer=tabmotgen[j];
	        		ok=false;
	        		nombretrouver=0;
	        		resultat=0;
	        		for(k=0;k<3;k++)
	            	{
	        			resultat=initiale.indexOf(comparer.charAt(k));
	            		if(resultat!=-1)
	            			nombretrouver++;
	            	}
	        		if(nombretrouver>1)
	        		{
	        			voisins.add(comparer);
	        			System.out.print(comparer+" ");
	        		}
        		}
        	}
        	base.add(i, voisins);
        }
       
	}
}
