package com.company;







public class Main {
    /**
     *affiche le tableau des scores
     *
     *
     *
     *  @param tableau de scores
     */
    public static void printScores(int tableau[]){

        for(int i = 0;i< tableau.length;i++){

            System.out.print(tableau[i]+"|");

        }
    }

    /**
     * trouve le meilleur scores
     * @param tableau de scores
     * @return le nombre maximum de mon tableau
     */
    public static int BestScore(int tableau[]){
        int max = -10;

        for(int i = 0;i<5;i++){
             max = 0;

            if (tableau[i]>max){
                max = tableau[i];

            }

        }return max;
    }

    /**
     * cherche si un des scores est inferieur a 10
     * @param tableau de score
     * @return boolean qui dit si un des nombres est inferieur a 10
     */
    public static boolean MoinsDe10(int tableau[]){
        boolean isMoinsDe10 = false;
        for(int i=0;i<tableau.length;i++){
           if (tableau[i]<10){
               isMoinsDe10 = true;
               return isMoinsDe10;
           }

        }return false;
    }




    public static void main(String[] args) {
	int[] score = new int[5];
	    score[0] = 74;
        score[1] =75 ;
        score[2] =25 ;
        score[3] =45 ;
        score[4] =76 ;

        float moyenne = 0;
        for(int i = 0;i< score.length;i++){
            moyenne = moyenne+score[i];



        }
        moyenne = moyenne/score.length;
        System.out.printf("ta moyenne est de: "+moyenne);



    }

}
