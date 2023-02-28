import java.util.Scanner;

public class VariableChallengeChatbot {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Learn the part:java chatbot");
        System.out.println("Hello what is your name");
        String name=scan.nextLine();
        System.out.println("Hi" +name+"!I'm javabot.where are you from?");
        String place=scan.nextLine();
        System.out.println("I hear it's beautiful at "+place+"!  i'm from a place called TCR");
        System.out.println("how old are you ?");
        int age=scan.nextInt();
        System.out.println("so you're "+age+", cool!i'm 400 years old ." );
        System.out.println("This means i'm "+(400/age)+" times older than you .");
        System.out.println("Enough about me . What's your favourite language?");
        scan.nextLine();   //to avoid nexttrap//
        String language=scan.nextLine();
        System.out.println(language+",that's great! Nice Chatting with you .I have to log off now. See ya!");
        scan.close();
    }
}
