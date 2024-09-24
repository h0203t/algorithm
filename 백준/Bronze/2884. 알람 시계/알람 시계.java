import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 ~ 1439
        int value = sc.nextInt()*60 + sc.nextInt() + 1440;
        sc.close();
        value -= 45;

        System.out.println((value/60)%24 + " " + value%60);
    }
}
