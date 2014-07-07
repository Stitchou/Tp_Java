package gest;


public class Gestion {
		
	// Function ----------------------------------------------------------------------- 
	//print 
	public static void affich( note [][] tab)
	{
		int i,j;
		for(i=0;i<tab.length;i++)
		{
			try
			{
				for(j=0;j<tab[i].length;j++)
				{
					System.out.print("\nEleve : "+i+"  ");
					tab[i][j].print();
				}
			}
			catch (Exception e)
			{
				
			}
		}
	}
	// moyenne
	public static float calcMoy(note [][] tab,int rang)
	{
		int j;
		float result=0;
		
			try
			{
				for(j=0;j<tab[rang].length;j++)
				{
					result+=tab[rang][j].getVal();
				}
				
			}
			catch (Exception e)
			{
				return 0;
			}
		return result/tab[rang].length;
	}
	// add
	public static void add (note [][] tab,int rang,String matiere,float val)
	{
		note[] tmp= new note[tab[rang].length+1];
		note [] delet=tab[rang];
		int i;
		for(i=0;i<tab[rang].length;i++)
		{
			tmp[i]=tab[rang][i];
		}
		
		tmp[i]=new note(val,matiere);
		tab[rang]=tmp;
	}
	// nombre de moyenne 
	public static int calc(note [][] tab)
	{
		int result=1,i,j,cpt=0;
		for(i=0;i<tab.length;i++)
		{
			cpt=0;
			for(j=0;j<tab[i].length;j++)
			{
				if(!tab[i][j].getMatiere().equals("Moyenne"))
					cpt++;
			}
			if(cpt>result)
				result=cpt;
		}
		
		return result;
	}
	// tableau de moyenne 
	public static float [] moyennes (note [][] tab)
	{
		int cpt=0,i,j,k;
		for(i=0;i<tab.length;i++)
		{
			for(j=0;j<tab[i].length;j++)
			{
				if(tab[i][j].getMatiere().equals("Moyenne"))
					cpt++;
			}
		}

		k=0;
		float [] result= new float [cpt];
		for(i=0;i<tab.length;i++)
		{
			for(j=0;j<tab[i].length;j++)
			{
				if(tab[i][j].getMatiere().equals("Moyenne"))
					{
						result[k]=tab[i][j].getVal();
						k++;
					}
			}
		}
		return result;
	}
	// Main -----------------------------------------------------------------------
	public static void main (String [] args) throws Exception 
	{
		float result,tableau[];
		int i;
		note [][] noob = new note [2][] ;
		noob[0]=new note [3];
		noob[1]=new note [5];
		noob[0][0]=new  note(10,"francais");
		noob[0][1]=new  note(12,"anglais");
		noob[0][2]=new  note(19,"Math");
		noob[1][0]=new  note(18,"francais");
		noob[1][1]=new  note(10,"anglais");
		noob[1][2]=new  note(17,"math");
		noob[1][3]=new  note(9,"espagnol");
		noob[1][4]=new  note(5,"theorie des langages");
		
		affich(noob);
		result=calcMoy(noob,1);
		
		if(result!=0)
		{
			add(noob,1,"Moyenne",result);
		}
		
		affich(noob);
		result=calc(noob);
		System.out.println("\nnombre de matieres max : " + result);
		
		tableau=moyennes(noob);
		System.out.println("\nliste des moyennes : ");
		for(i=0;i<tableau.length;i++)
			System.out.println(tableau[i]);
	}
}
