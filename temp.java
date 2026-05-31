import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the temperature in Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            double kelvin = celsius + 273.15;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            System.out.println("Temperature in Kelvin: " + kelvin);
        }
    }
}