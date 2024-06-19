import java.util.Scanner;

public class tuhoc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap tong hai so: ");
        Float tong = sc.nextFloat();
        System.out.println(" nhap hieu hai so: ");
        Float hieu = sc.nextFloat();

        float x = (hieu + tong)/2;
        float y = ( tong - hieu)/2;


        System.out.println(" so be hon la: " +x);
        System.out.println(" so lon hoon la? " +y);
    }
}
