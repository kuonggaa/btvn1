// public class LoopExample {
//     public static int sum(int n) {
//         int result = 0;
//         for (int i = 1; i <= n; i++) {
//             result += i;
//         }
//         return result;
//     }
// }

public class LoopExample {
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập một số nguyên làm đối số dòng lệnh.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int result = sum(n);
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + result);
    }
}

