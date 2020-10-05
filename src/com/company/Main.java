package com.company;

public class Main {

    public static void main(String[] args) {
	int[] score = new int[5];
	    score[0] = 23;
        score[1] =75 ;
        score[2] =25 ;
        score[3] =45 ;
        score[4] =76 ;

        for(int i = 0;i<5;i++){
            System.out.println(score[i]);

        }
        float moyenne = ((score[1]+score[2]+score[3]+score[4]+score[0])/5);
        System.out.println("La moyenne de vos scores est:"+moyenne);

    }

}
