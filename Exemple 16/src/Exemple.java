class agreg {
	public agreg(){
		System.out.println("constructeur agreg");
	}
}
class BaseA{
	private int i=15;
	public BaseA() {
		System.out.println("constructeur base A");
	}
	public BaseA(int i){
		this.i=i;
		System.out.println("constructeur base A, i="+i);
	}
	public void traitement(){
		System.out.println("Traitement base A");
	}
}

class BaseB extends BaseA{
	public BaseB() {
		System.out.println("constructeur base b");
	}
	public void traitement () {
		System.out.println("traitement base B");
	}
}
class BaseC extends BaseB{
	public BaseC() {
		System.out.println("constructeur base c");
	}
	public void traitement () {
		System.out.println("traitement base C");
	}
}
class BaseD extends BaseA{
	private agreg ag;
	public BaseD() {
		ag = new agreg();
		System.out.println("constructeur base d, ag="+ag);
	}
	public void traitement () {
		super.traitement();
		System.out.println("traitement base d");
	}
}
public class Exemple {
public static void main(String [] args)
{
	BaseD d=new BaseD();
	BaseC c =new BaseC();
}
}
