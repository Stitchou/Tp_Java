package eleve;

public class Adresse implements Cloneable{
	private String rue;
	private int numero;
	private String ville;
	private int codepostale;
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodepostale() {
		return codepostale;
	}
	public void setCodepostale(int codepostale) {
		this.codepostale = codepostale;
	}
	
	public Object clone ()
	{
		try{
			celeve tmp= (celeve) super.clone();
			return tmp;
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}

}
