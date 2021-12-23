package Excercice1;

public class MonTableau implements EstComparable {
	private int[] tableau;
	public MonTableau(int tableau []) {
		this.tableau = tableau;	
	}

	public int somme(){
		int somme = 0;
 
		for(int i = 0; i < tableau.length;i++)  {
			
			somme =somme+ tableau[i];	
		}
			return somme;
		
	}


	@Override
	public int compareA(Object o) throws RuntimeException{
		int res;
		
		try {
			if (o==null) {
				res =1;
				throw new NullPointerException();
			}
			
			else {
				MonTableau tab;
				tab = (MonTableau)o;
				if(this.somme()< tab.somme()) 
					res =-1;
			
				else if(this.somme()== tab.somme())
					res =0;
				else 
					res =1;
		
			return res;
	}}
	catch(NullPointerException e) {
		System.out.print("Attention l’objet passé en paramètre est Null. l'exception n°:");
		return 1;
	}
		
	}
	

}



