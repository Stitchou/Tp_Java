package gest;

public class note extends Gestion
{
	private float val;
	private String matiere;
	
	public float getVal() {
		return val;
	}

	public void setVal(float val) {
		this.val = val;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public note()
	{
		this.val=0;
		this.matiere=null;
	}
	
	public note(float val,String matiere)
	{
		this.val=val;
		this.matiere=matiere;
	}
	
	public void print ()
	{
		System.out.println(matiere+" "+val);
	}
}
