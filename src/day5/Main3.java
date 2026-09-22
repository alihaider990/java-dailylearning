package day5;

public class Main3 {
    public static void main(String[] args){

        int num =7;
        boolean isPrime = true;
if(num < 2){
    isPrime = false;
}else {
    for(int i =2; i < num; i++){
        if(num % i == 0) {
            isPrime = false;
        }

    }


         }
         if(isPrime){
             System.out.println("it is a prime number");
         }else {
             System.out.println("it is not a prime number");
         }










    }
}
