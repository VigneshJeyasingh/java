import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("\t*****Royal Bank Of JAVA*****");
        System.out.println("Are you here to get a mortage? (yes or no)");
        String decision=scan.nextLine();
        if(decision.equals("yes")){
            System.out.println("\nGreat! In one line"+"\nHow much money do you have in your savings?"+"\nAnd ,how must do you own in credit card debt?");
        double savings=scan.nextDouble();
        double debt=scan.nextDouble();
        System.out.println("\nHow many years you worked for?");
        int years=scan.nextInt();
        System.out.println("What is your name?");
        String name=scan.next();
        

        if(savings>=10000 && debt<5000 && years >2 ){
            System.out.println("Congratulations " +name+ " you have been approved!");
        }
         
        
        else{
            System.out.println("Sorry,you are not eligible for a mortage");
        }

    }else{
            System.out.println("\nOk have a nice day!");
        }
        
        
        scan.close();
        
    }
    
}
