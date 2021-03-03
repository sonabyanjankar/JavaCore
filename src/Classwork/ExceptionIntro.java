package Classwork;

public class ExceptionIntro {

    public static void main(String[] args) throws InterruptedException {

        int num = 100;
        Thread.sleep(500);

        try{
            int result=num/0;

        }
        catch (Exception e){
            System.out.println("Number is not divisible by 0 ");
            System.out.println(e.getMessage());

        }

        finally{
            System.out.println("This program has no result ");
        }




    }
}
