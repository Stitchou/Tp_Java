package H_Probleme;

public class Card extends CardGeneric implements ConstantsCards{

	private int Value; 
	private int Color;
	
	
	public Card(int _Value, int _Color)
	{
		Value = _Value;
		Color = _Color;
	}
	
	public int getColor() {
		// TODO Auto-generated method stub
		return Color;
	}

	
	public int getValue() {
		// TODO Auto-generated method stub
		return Value;
	}

	
	public String convColorToString() {
		switch(Color)
		{
			case Trefle : return "Trefle";
			case Pique : return "Pique";
			case Coeur : return "Coeur";
			case Carreau : return "Carreau";
			default :
				return "Erreur conversion";
		}
	}


	public String convValueToString() {
		switch(Value)
		{
		case As : return "As";
		case Valet : return "Valet";
		case Dame : return "Dame";
		case Roi : return "Roi";
		default :
			return new String(""+Value);
		
		}
	}

}
