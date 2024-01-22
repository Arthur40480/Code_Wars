
public class Exercice {

	public static void main(String[] args) {
		
//		Dans cette mission simple, on vous donne un nombre et vous devez le rendre négatif. 
//		Mais peut-être que le chiffre est déjà négatif ?
//		Le nombre peut déjà être négatif, auquel cas aucun changement n’est requis.
//		Zéro (0) n’est vérifié pour aucun signe spécifique. Les zéros négatifs n’ont aucun sens mathématique.
		
		makeNegative(1); // renvoie -1
		makeNegative(-5); // renvoie -5
		makeNegative(0); // renvoie 0
		
		System.out.println(makeNegative(1));
		System.out.println(makeNegative(-5));
		System.out.println(makeNegative(0));
	}
	
	public static int makeNegative(int number) {
		return(number < 0 || number == 0) ? number : -number;
	}

}
