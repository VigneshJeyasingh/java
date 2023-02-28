import java.util.Scanner;

public class Dealership2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();
            //here in switch statement key is "option" and value is "a ,b"
        switch (option){
            case "a":
                System.out.println("what s your budget?");
                int budget = scan.nextInt();
                if(budget>=10000){
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have License? Write 'yes' or 'no' ");
                    scan.nextLine();
                    String license=scan.nextLine();
                    System.out.println("\nDo you have insurence ? Write 'yes' or 'no' ");
                    scan.nextLine();
                    String insurence=scan.nextLine();
                    System.out.println("What is your Credit score ?");
                    int credit = scan.nextInt();
                    if(license.equals("yes") && insurence.equals("yes") && credit>700){
                        System.out.println("Sold! plesure doing business with you");
                    }else{
                        System.out.println("sorry you are not eligible");
                    }
                       

                }else{
                    System.out.println("we don't sell car under 10000");
                }break;


            case "b": 
                System.out.println("What is your car valued ?");
                int value=scan.nextInt();
                System.out.println("What is your selling price ?");
                int price = scan.nextInt();
                if(value>price && price<30000){
                    System.out.println("we will buy your car");

                }else{
                    System.out.println("we are not intrested");
                }break;
            default:System.out.println("you choose invalid option");
        }
    

        scan.close();

    }
}
 
