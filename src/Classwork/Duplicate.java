package Classwork;

public class Duplicate {
    public static void main(String[] args) {
        int count=0;
        String [] names= {"John", "jack", "jack","Mark","Mark","Penny","jack"};
        int j=0;
        for (int i= 0; i<names.length ; i++){

            count=1;
            for ( j=i+1; j<names.length;j++){
                if(names[i].equals(names[j])){
                    count++;
                    names[j]="0";
                }
            }
            if(names[i]!="0"){
                if(count>1){   //for duplicates,  value should be atleast 2
                System.out.println("Count for "+ names[i]+" is "+  count );
                }
            }
        }

    }
}
