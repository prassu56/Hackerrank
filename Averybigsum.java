import java.util.Scanner;

public class Averybigsum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            sum += num;
        }
        System.out.println(sum);
    }
}