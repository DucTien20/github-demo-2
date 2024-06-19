import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap chieu cai (m):");
        double chieucao = sc.nextDouble();
        System.out.println(" nhap can nang (kg): ");
        double canNang = sc.nextDouble();
        double MBI = canNang/(Math.pow(chieucao,2));

        if(MBI<15) {
            System.out.println(" than hinh qua gay");
        } else {
            if(MBI >=15 && MBI <16)
                        System.out.println(" than hinh gay");
                    else if(MBI>=16 && MBI <18.5)
                        System.out.println(" than hinh hoi gay");
                    else if(18.5 <= MBI && MBI <25)
                        System.out.println(" thanh hinh binh thuong");
                    else
                        System.out.println(" thanh hinh dep");

        }


    }
}
