import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        // Sử dụng lệnh rẽ nhánh để kiểm tra số nhập vào là chẵn hay lẻ
        if (number % 2 == 0) {
            System.out.println("Số bạn nhập vào là số chẵn.");
        } else {
            System.out.println("Số bạn nhập vào là số lẻ.");
        }

        // Sử dụng vòng lặp để in ra các số từ 1 đến số nhập vào
        System.out.println("Các số từ 1 đến " + number + " là:");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
