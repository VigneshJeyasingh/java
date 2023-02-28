public class LogicalOperators {
    public static void main(String[]  args){
        int chemistryGrade = 72;
        int englishGrade = 65;
        String language = "java";
        //if any one condition true the or operator runs(||)
        if(chemistryGrade > 75 || englishGrade > 65 || language.equals("java")){
            System.out.println("you got a scholarship");
        }else {
            System.out.println("work hard next time");
        }
        //if both condition is true the and operator(&&) runs
        int credits = 75;
        double GPA = 2;
        if(credits >= 75 && GPA >=2){
            System.out.println("you earnes a diploma!");
        }else{
            System.out.println("sorry ,you need atleast 40 credits ana a minimum of 2 GPA");
        }

    }
    
}
