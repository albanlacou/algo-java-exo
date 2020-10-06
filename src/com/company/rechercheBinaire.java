package com.company;

public class rechercheBinaire {

    public static int rechercheBinaire(int tableau[],int nbRecherche) {
        int valeurMax = tableau[tableau.length - 1];
        int valeurMin = tableau[0];
        int i = tableau.length-1;
        while(nbRecherche != tableau[i]){//tant que le nombres n'a pas été trouver alors repete
            if(nbRecherche<valeurMin || nbRecherche>valeurMax){
                return -1;
            }

            i = (valeurMin+valeurMax)/2;    //prend la moitier des deux bornes

            if(nbRecherche<tableau[i]){
                valeurMax = i;
            }else if(nbRecherche>tableau[i]){
                valeurMin = i;
            }if(valeurMin == valeurMax) {
                if (valeurMin == nbRecherche) {
                    return i-1;
                } else if(valeurMax ==nbRecherche){
                    return i;
                }else{
                    return -1;
                }
            }
        }if(nbRecherche == tableau[i]){
            return i;
        }return -1;






    }







    public static void main(String[] args) {

        int[] nombreCroissant = {1,2,3,4,5,6,7,8,9,11,12,13,15,16,17,18,19,20};
        int resultat =rechercheBinaire(nombreCroissant,5);
        System.out.print(resultat);

    }
}
