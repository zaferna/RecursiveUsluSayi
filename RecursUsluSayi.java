import java.util.Scanner;

public class RecursUsluSayi {

    static int sayi(int a, int b){
        int i,sum;
        sum=1;
        if(b==1) {
            return a;

        }


         return sayi(a,b-1)*a;

        }





    public static void main(String[] args) {

        int a,b ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Sayi Giriniz : ");
        a= inp.nextInt();
        System.out.print("Us Sayi Giriniz : ");
        b= inp.nextInt();


        System.out.print("sonuc : "+sayi(a,b));

    }
}
