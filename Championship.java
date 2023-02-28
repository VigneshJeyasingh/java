public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        //to give a common condition margin(variable)were used//
        int margin =  gryffindor -ravenclaw;
        if(margin>=300){
            System.out.println("graffindor are the champions");
        }else if(margin>=0){
            System.out.println("in second place,Graffindor");

        }else if(margin>=-100){
            System.out.println("in third place ,Graffindor");
        }else{
            System.out.println("in fourth place,Graffindor");
        }


        
    }
}
