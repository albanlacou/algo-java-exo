package com.company;







public class Main {

    static void printScores(int tableau[]){

        for(int i = 0;i<5;i++){

            System.out.println(tableau[i]);

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


        float moyenne = ((score[1]+score[2]+score[3]+score[4]+score[0])/5);
        boolean moinsDe10 = MoinsDe10(score);
        System.out.println(moinsDe10);

    }

}
