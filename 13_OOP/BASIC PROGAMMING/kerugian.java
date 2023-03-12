import java.util.Scanner;

public class kerugian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga_beli;
        int harga_jual;
        int kerugian;

        System.out.println (" harga_jual: ");
        harga_jual = input.nextInt();

        System.out.println (" harga_beli : ");
        harga_beli = input.nextInt();

        kerugian = (harga_jual-harga_beli);
        System.out.println (" kerugian yang di dapat : " + kerugian);
    }
}