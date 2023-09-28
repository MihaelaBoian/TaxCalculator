public class Main {
    public static void main(String[] args) {

       double price = 50.95 ;

       double tax = 10.45 ;

       int quantity = 100;

       double total = 0;

       String message= "I want to by " +quantity+" shirt!";

       total = price*quantity*tax;

        System.out.println(message);

        System.out.println("Total cost with tax is " + total);

    }
}