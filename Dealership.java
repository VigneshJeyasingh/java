import java.util.Scanner;

public class Dealership {
    public static void main(String[] args){
        Scanner order=new Scanner(System.in);
        System.out.println("Welcome to java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = order.nextLine();
        
        switch (option){
            case "a":System.out.println("you choose option "+ option);break;
            case "b":System.out.println("you choose option "+ option);break;
            default:System.out.println("you choose invalid option");
        }
        System.out.println("what is your budget ?");
        int budget = order.nextInt();
        System.out.println("Great! a Nissan Altima is availablefor $"+budget);
        System.out.println("Do you hava insurance? write 'yes' or 'no'");
        order.nextLine();// to avoid delimers in output//
        String answer=order.nextLine();
        System.out.println("Do you hava licence? write 'yes' or 'no'");
        String licence=order.nextLine();

        order.close();

    }
}
