package arithm;

public class application {
	public static void main (String [] args)
	{
		eleve e = new eleve();
		delegue d = new delegue();
		prof p = new prof();
		e.init();
		p.traitement(d,e);
	}

}
