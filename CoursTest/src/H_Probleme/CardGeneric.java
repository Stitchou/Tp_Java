package H_Probleme;

public abstract class CardGeneric implements ConstantsCards{
	static final int[] Color = {Trefle, Coeur, Pique, Carreau};
	static final int[] Cards = {As, 2, 3, 4, 5, 6, 7, 8, 9, 10, Valet, Dame, Roi};
	abstract public int getColor();
	abstract public int getValue();
	abstract public String convColorToString();
	abstract public String convValueToString();

}
