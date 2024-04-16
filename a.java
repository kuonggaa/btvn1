import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        // Sử dụng phương thức để kiểm tra số nhập vào là số nguyên tố hay không
        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }

        // Sử dụng vòng lặp để in ra các số từ 1 đến số nhập vào
        System.out.println("Các số từ 1 đến " + number + " là:");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }

    // Phương thức kiểm tra một số có phải là số nguyên tố hay không
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
