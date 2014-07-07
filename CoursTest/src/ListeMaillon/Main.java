package ListeMaillon;

public class Main {

	public static void main(String[] args) {
		Liste l = new Liste();
		for(char c ='a'; c<'z';c++)
			l.add(c);
		l.print();

	}

}
