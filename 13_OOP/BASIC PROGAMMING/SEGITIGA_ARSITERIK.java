import java.util.Scanner;


public class SEGITIGA_ARSITERIK {
    public static void main(String[] args) {

        int t;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        t = input.nextInt();
        input.close();

        int jum = 1;
        for(int i=1;i<=t;i++){
            //Membuat spasi
            for(int s=t-i;s>0;s--){
                System.out.print(" ");
            }

            for(int b=1;b<=jum;b++){
                if (b%2==0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            jum+=2; //Sama dengan jum = jum + 2
            System.out.print("\n");
        }
    }
}