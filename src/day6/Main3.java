package day6;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers  = {1,2,3,4,5,6,7,9};
        String[] fruits ={"apple","mango","orange"};
        boolean isFound = false;
        String target;

        System.out.println("enter a fruit you are searching for: ");
         target = scanner.nextLine();





        for(int i =0; i< fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound =true;
                break;
            }
            }
        if(!isFound){
            System.out.println("element not found in the array");
        }

        scanner.close();
        }


    }

