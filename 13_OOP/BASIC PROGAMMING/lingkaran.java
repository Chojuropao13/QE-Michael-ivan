import java.util.Scanner;
public class lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double luas, phi = 3.14;
        int r;

        System.out.print("masukan jari : ");
        r = input.nextInt();

        luas = phi*r*r;
        System.out.println (" luas lingkaran adalah " + luas);
    }
}
