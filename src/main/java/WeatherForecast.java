import java.util.Scanner;

/*
A program which suggests what clothing to wear
based on what the weather and temperature is.
 */

public class WeatherForecast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello there! In one word, please describe the weather:");
        String weather = sc.nextLine();

        System.out.println("What is the average temperature (°C)?");
        int temp = sc.nextInt();

//        If it is snowy AND the temperature is
//        less than or equal to 8:
        if (weather.equals("snowy") && temp <= 8) {
            System.out.println("Do not go outside without a coat, hat and scarf!");

//            If it is sunny OR the temperature is
//            greater than or equal to 28:
        } else if (weather.equals("sunny") || temp >= 28) {
            System.out.println("It's short sleeve season!");

//            If it's windy AND the temperature is
//            NOT greater than or equal to 18:
        } else if (weather.equals("windy") && !(temp >= 18)) {
            System.out.println("It seems a bit chilly outside. Wear a coat.");

//            If the weather is cloudy AND the temperature is
//            greater than or equal to 0 AND less than 20:
        } else if (weather.equals("cloudy") && (0 <= temp && temp < 20)) {
            System.out.println("Anything could happen. Wear a long sleeve and take an umbrella.");
        }
    }
}
