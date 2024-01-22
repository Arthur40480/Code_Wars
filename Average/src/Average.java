
public class Average {
    public static void main(String[] args) {
    	
//    	C'est la fin de l'année scolaire, moment fatidique de votre bulletin scolaire. Les moyennes doivent être calculées. 
//    	Tous les étudiants viennent vers vous et vous supplient de leur calculer leur moyenne. Facile ! 
//    	Il vous suffit d'écrire un script.
//    	Renvoie la moyenne du tableau donné arrondie à l’entier le plus proche.
//    	Le tableau ne sera jamais vide.
    	
        int[] marks = {1, 10, 18, 12, 8, 2, 20};
        System.out.println(getAverage(marks));
    }

    public static float getAverage(int[] marks) {
        float average = 0;
        for(int note : marks) average = average + note;
        return average/ marks.length;
    }
}
