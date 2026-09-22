package day5;

public class Main2 {
    public static void main(String[] args){
        String car = "madam";
        String reversed ="";

        for(int i = car.length() - 1; i >= 0; i--){
            reversed += car.charAt(i);
        }
        if(reversed.equals(car)){
            System.out.println("this string is palindrome");
        }
        else{
            System.out.println("this string is not palindrome");
        }


    }
}
