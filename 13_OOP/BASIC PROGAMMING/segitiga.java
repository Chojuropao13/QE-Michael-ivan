import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alas, tinggi;
        double luas;

        System.out.println("berhitung luas segitiga");

        System.out.print(" inputkan alas : ");
        alas = input.nextInt();

        System.out.print(" inputkan tinggi : ");
        tinggi = input.nextInt();

        luas = (alas * tinggi) * 0.5;

        System.out.println ("Luas segitiga : " + luas);
    }
}
