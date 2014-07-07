package liste;

public class listeSimplementchainee {
	
	
	
	class Maillon 
	{
		private char lettre;
		private Maillon next;
		public Maillon (char let,Maillon mail)
		{
			lettre=let;
			next=mail;
		}
	}
	
	private Maillon debut;
	
	public listeSimplementchainee ()
	{
		debut=null;
	}
	
	public void add (char C )
	{
		Maillon tmp;
		tmp=new Maillon(C,debut);
		debut=tmp;
	}
	
	
	public void print()
	{
		Maillon vue=debut;
		while (vue!=null)
		{
			System.out.println(vue.lettre);
			vue=vue.next;
		}
	}
	
	public static void main( String [] args)
	{
		listeSimplementchainee l = new listeSimplementchainee();
		 for(char c='a';c<='z';c++)
			 l.add(c);
		 l.print();
	}
	
}
