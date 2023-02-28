import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int score=0;
        System.out.println("1. Which country held the 2016 summer Olympics ? ");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy ");
        String answer1 = scan.nextLine();
        if(answer1.equals("c")){
            score+=5;
        }//else{
          //  score=0;
      //   }
        System.out.println("2. Which is the hottest plannet ? ");
        System.out.println("\ta) venus\n\tb) saturn\n\tc) mercury\n\td) mars ");
        String answer2 = scan.nextLine();
        if(answer2.equals("a")){
            score+=5;
        }//else{
          //  score=0;
        // }
        System.out.println("3. Which is the rarest blood type ? ");
        System.out.println("\ta) O\n\tb) A \n\tc) B\n\td) Ab-Negative ");
        String answer3 = scan.nextLine();
        if(answer3.equals("d")){
            score+=5;
        }//else{
             //   score=0;
          //   }
        System.out.println("4. Which one of these charecters is friends with Harry Potter ? ");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n\td) Vicky ");
        String answer4= scan.nextLine();
         if(answer4.equals("a") || answer4.equals("b")){
            score+=5;
         }//else{
            //score=0;
        // } 
        //all if conditions can be write in a step by step belown contineous
        

            System.out.println("Your final score is:"+score+"/20");
            if(score>=15){
                System.out.println("Wow , you know your stuff");
            }else if(score<15 && score>=5 ){
                System.out.println("Not bad!");
            }else{
                System.out.println("Better luck next time.");
            }
        
        scan.close();

        
    }
    
}
