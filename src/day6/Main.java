package day6;


public class Main {

    public static void main(String[] args) {



String pizza = bakePizza("flat bread", "mozrella", "pepporoni");
System.out.println(pizza);




    }

    String pizza;


    static String bakePizza(String bread){
        return bread + "pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + "pizza";
    }
    static String bakePizza(String bread, String cheese,String topping){
        return topping + " " + cheese + bread + "pizza";
    }
}
