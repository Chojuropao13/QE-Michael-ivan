import java.util.Scanner;

public class hasil_keuntungan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga_beli;
        int harga_jual;
        int keuntungan;

        System.out.println (" harga_jual: ");
        harga_jual = input.nextInt();

        System.out.println (" harga_beli : ");
        harga_beli = input.nextInt();

        keuntungan = (harga_jual-harga_beli);
        System.out.println (" keuntungan yang di dapat : " + keuntungan);
    }
}