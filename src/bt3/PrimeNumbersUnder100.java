package bt3;

public class PrimeNumbersUnder100 {

    public static void main(String[] args) {
        System.out.println("Prime numbers less than 100 are:");
        for (int i = 2; i < 100; i++) { // Duyệt các số từ 2 đến 99
            if (isPrime(i)) { // Kiểm tra nếu số đó là số nguyên tố
                System.out.print(i + " "); // In số nguyên tố
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
