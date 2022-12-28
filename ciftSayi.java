import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Sayı Giriniz: ");
        sayi= inp.nextInt();

        for(int i = 1 ;i <=sayi ; i++ ){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
