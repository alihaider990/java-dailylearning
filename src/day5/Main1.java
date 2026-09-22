package day5;
import java.util.Scanner;



public class Main1 {
public static void main(String[] args)  {

    String name = "ali";
    String reversed = "";

    for(int i = name.length() -1; i >= 0; i--){
        reversed += name.charAt(i);
    }
    System.out.println(reversed);



}
}
