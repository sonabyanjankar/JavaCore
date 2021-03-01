package Classwork;

public class Breaks {

    public static void main(String[] args) {

        int j;

        for(j=0; j<=10; j++){

            if(j==5){
                continue;
            }
            System.out.println(j);
        }


        int k;
        for(k=0; k<=10;k++){

            if (k==5){
                break;
            }
            System.out.print(k);

        }

    }



}
