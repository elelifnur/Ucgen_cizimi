import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        double kknr,uknr,dknr,u,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin Bir kenarını Giriniz: ");
        kknr = input.nextDouble();
        System.out.print("Üçgenin İkinci Kenarını Giriniz: ");
        uknr = input.nextDouble();
        System.out.print("Üçgenin Üçüncü Kenarını Giriniz: ");
        dknr = input.nextDouble();

        u = (kknr+uknr+dknr) /2;
        alan = Math.sqrt(u*(u-kknr)*(u-dknr)*(u-uknr));

        System.out.println(alan);


    }
}
