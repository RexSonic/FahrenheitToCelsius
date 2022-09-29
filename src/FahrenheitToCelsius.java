import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FahrenheitToCelsius {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hello. Please type your desired Temperature in Fahrenheit: ");
        double TempF = Double.parseDouble(br.readLine());
        double TempC = (5.0/9.0)* (TempF-32);
        System.out.println("Your desired temperature in Celsius is: "+TempC +" degrees");
    }
}