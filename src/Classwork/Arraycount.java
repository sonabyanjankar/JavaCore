package Classwork;

public class Arraycount {
    public static void main(String[] args) {
        int count=0;
        char[] input = {'a', 'a', 'b', 'c', 'b', 'b', 'c', 'a', 'a', 'a'};
        int j=0;
        for (int i= 0; i<input.length ; i++){

            count=1;
            for ( j=i+1; j<input.length;j++){
                if(input[i]==(input[j])){
                    count++;
                }

            }
            System.out.println("Count for "+ input[i]+" is "+  count );

            }

        }

    }



