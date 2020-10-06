package com.company;







public class Main {

    static void printScores(int tableau[]){

        for(int i = 0;i< tableau.length;i++){

            System.out.print(tableau[i]+"|");

        }
    }

    static int BestScore(int tableau[]){
        int max = -10;

        for(int i = 0;i<5;i++){
             max = 0;

            if (tableau[i]>max){
                max = tableau[i];

            }

        }return max;
    }

    static boolean MoinsDe10(int tableau[]){
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
