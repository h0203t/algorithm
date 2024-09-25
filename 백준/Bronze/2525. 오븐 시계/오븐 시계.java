import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h=scan.nextInt(),m=scan.nextInt(),time=scan.nextInt();
        h=(time+m)/60+h;
        h%=24;
        m=(time+m)%60;
        System.out.print(h+" "+m);
    }
}
