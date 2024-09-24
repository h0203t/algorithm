import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt()*60 + sc.nextInt() + 1395;
        sc.close();
        System.out.println((value/60)%24 + " " + value%60);
    }
}
