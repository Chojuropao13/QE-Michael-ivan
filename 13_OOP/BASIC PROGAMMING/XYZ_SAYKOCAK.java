import java.util.Scanner;

public class XYZ_SAYKOCAK{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, j, Masukin;

        System.out.println(" Masukin: ");
        Masukin = input.nextInt();

        for ( i=0;  i<=Masukin; i++); {
            for( j=0; j<=Masukin; j++); {

                if (Masukin % 3 == 0) {
                    System.out.print("X");
                } else if (Masukin % 2 == 0) {
                    System.out.print("Z");
                }else {
                    System.out.print("Y");
                }
            }
            System.out.println();
        }
    }
}