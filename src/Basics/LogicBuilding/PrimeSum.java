import java.util.*;
class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit: ");
        int limit = sc.nextInt();
        sc.close();

        int sum = sumPrime(limit);
        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumPrime(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {  // Fixed variable naming issue
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
} 
 













