import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choise, result= 0;

        System.out.println("Kalkulator");
        System.out.println("\n");
        System.out.println("1. TAMBAH ");
        System.out.println("2. KURANG ");
        System.out.println("3. PERKALIAN ");
        System.out.println("4. PEMBAGIAN ");

        System.out.print("MASUKAN ANGKA pertama: ");
        numbers1 = input.nextInt();
        System.out.print("MASUKAN ANGKA kedua : ");
        numbers2 = input.nextInt();

        System.out.println("YANG MAU DIJALANKAN NOMER : ");
        choise = input.nextInt();

        switch (choise)
        {

            case 1 : result = numbers1 + numbers2; break;
            case 2 : result = numbers1 - numbers2; break;
            case 3 : result = numbers1 * numbers2; break;
            case 4 : result = numbers1 / numbers2; break;
            default : System.out.println("maaf");
        }
        System.out.println ("hasil :" + result);
    }
}