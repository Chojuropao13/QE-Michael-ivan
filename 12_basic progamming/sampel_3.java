import java.util.Scanner;

public class sampel_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga_jual, harga_beli, kerugian, keuntungan, sampel_3;

        System.out.println (" harga_beli : ");
        harga_beli = input.nextInt();

        System.out.println (" harga_jual : ");
        harga_jual = input.nextInt();

        if ( harga_jual > harga_beli) {
            keuntungan = (harga_jual-harga_beli);
            System.out.println (" TERNYATA ANDA UNTUNG SEBESAR : " + keuntungan);
        } else if ( harga_jual < harga_beli ) {
            kerugian = (harga_jual-harga_beli);
            System.out.println (" TERNYATA ANDA RUGI : " + kerugian);
        } else {
            System.out.println ("maaf ternyata anda untung kaga rugi ya kaga");
        }
    }
}

