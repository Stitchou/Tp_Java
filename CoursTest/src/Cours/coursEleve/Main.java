package Cours.coursEleve;

import java.util.Arrays;



public class Main {

	
	public static void main(String[] args) {
		
		Eleve e1 = new Eleve("Rachid",15.f, "4, Rue Toto");
		Eleve e2 = new Eleve("Java", 13.f, "5, Rue Tata");
		e1.print();
		e2.print();
		Eleve e3 = e1.compare(e2);
		System.out.println("Eleve le plus long alphabétiquement :");
		e3.print();
		System.out.println("Sortie equals : "+e3.equals(e1));
		Eleve e4 = (Eleve) e3.clone();
		e4.setAdr("10, Rue du Plateau");
		e4.print();
		e3.print();
		Eleve[] array = {e1,e2,e3,e4};
		System.out.println("----------------------------------------------------------");
		for(int i =0; i < array.length ; i++)
			array[i].print();
		Arrays.sort(array);
		for(int i =0; i < array.length ; i++)
			array[i].print();
	}

}
