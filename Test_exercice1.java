package Excercice1;

public class Test_exercice1 {
public static void main(String[]args) {
		
		
		int[] tab1= new int []{1,2,3,4};
		int[] tab2= new int [] {-1,2,-3,4,5};
		 
		MonTableau tableau1 = new MonTableau(tab1);
		MonTableau tableau2 = new MonTableau(tab2);
		System.out.println(tableau1.compareA(tableau2));
		
	
	}


}
