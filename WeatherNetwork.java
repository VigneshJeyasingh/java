public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 10;  

        String forecast = "";

        if(temp <= -1){
            forecast="The forecast is freezing";
        }else if (temp <= 10){
            forecast="the forecast is chill. wear a coat";
        }else{
            forecast="its warm .Go outside";
        }
       
        System.out.println(forecast);
        //dont give quotation on the output value
        
    }
}
