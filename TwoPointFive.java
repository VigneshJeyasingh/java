import java.util.Scanner;

public class TwoPointFive{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your first name?");
        String firstName =scanner.nextLine();
        System.out.println("what is your last name");
        String lastName=scanner.nextLine();
        System.out.println("How old are you?");
        int age= scanner.nextInt();
        System.out.println("Make a username");
        scanner.nextLine();//its a nextline trap used to aviod skipping when we used after nextint or nextdouble//
        String userName=scanner.nextLine();
        System.out.println("what city do you livein ?");
        String city=scanner.nextLine();
        System.out.println("what country is that?");
        String country=scanner.nextLine();
        
        System.out.println("Thanku For Joining Javagram");
        System.out.println("\nHere is the information You Entered:");
        System.out.println("\tFirst Name:"+firstName);
        System.out.println("\tLast Name:"+lastName);
        System.out.println("\tAge:"+age);
        System.out.println("\tuser name:"+userName);
        System.out.println("\tCity:"+city);
        System.out.println("\tcountry:"+country);
        scanner.close();

        

        
        
        
        
    }
}
    
