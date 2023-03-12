import java.util.Scanner;

public class persegi_panjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("berhitung LUAS PERSEGI PANJANG");

        System.out.print(" inputkan panjang: ");
        panjang = input.nextInt();

        System.out.print(" inputkan lebar: ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println ("Luas persegi_panjang :  " + luas);
    }
}