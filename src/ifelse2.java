import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        System.out.println(" nhap nam : ");
        Scanner sc = new Scanner(System.in);
        int nam = sc.nextInt();

        if(nam%4==0 && nam%100!=0 || nam%400==0)
        System.out.println(" nam "+nam + " la nam nhuan");
        else
        System.out.println(" nam " +nam + " khong phai la nam nuon");
    }
}
