/* 
 * This program converts temperature from fahrenheit to celsius
 * Name: Francine Vo
 * UIN: 01253035
 * Date: 08/31/2023
 */
import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		//1- Declare variables
		double fahrenheit;
		double celsius;
		
		//2- Get the temperature in fahrenheit
		System.out.print("Enter the temperature in F: ");
		Scanner input = new Scanner(System.in);
		fahrenheit = input.nextDouble();
		
		//3- Convert the temperature to Celcius
		celsius = (fahrenheit - 32) / 1.8;
		
		//4- Output the result
		System.out.print(" Temp in Celsius = " + celsius);
		

	}

}
