package ListeMaillon;

public class Liste {
		private Maillon top;
		
		
		private class Maillon 
		{
			private char c;
			private Maillon next;
			public Maillon()
			{
				next = null;
			}
			public Maillon(char _c, Maillon _m)
			{
				c = _c;
				next = _m;
			}
		}
	
		public Liste()
		{
			top = new Maillon();
		}
		public void add(char _c)
		{
			
			Maillon temp = new Maillon(_c,top);
			top = temp;
		}
		
		public void print()
		{
			while(top != null)
			{
				System.out.println(top.c);
				top = top.next;
			}
		}
	

}
