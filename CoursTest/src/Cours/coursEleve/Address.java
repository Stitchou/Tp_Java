package Cours.coursEleve;

public class Address implements Cloneable{
	private String temp;
	public Address()
	{
		this("");
	}
	public Address(String temp) {
		super();
		this.temp = temp;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException cnse)
		{
			return null;
		}
	}
}
