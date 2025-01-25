import java.util.Scanner;
import java.util.ArrayList;


//Task #2 Write a program that finds the number of prime numbers that are less than or equal to 10,000,000.
public class Lab7 {
	//Check if num isPrime
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> primeList(int limit) {
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        ArrayList<Integer> primes = primeList(number);
        System.out.println("There are " + primes.size() + " prime numbers <= " + number + ".");
        System.out.println("Prime Numbers List: " + primes);
        
        input.close();
    }
}
