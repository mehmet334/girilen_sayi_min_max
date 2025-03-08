import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
//        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("3 ve 4 'e tam bölünenleri bulmak istediniz sayıyı giriniz: ");
        int sayi= scanner.nextInt();
        int toplam = 0; // Bölünen sayıların toplamını tutacak değişken
        int adet = 0;   // Bölünen sayı adedini tutacak değişken

        for (int i = 1; i < sayi; i++) {
            if(i%12==0){
                System.out.println(i+" ");
                toplam+=i;
                adet++;
            }
        }
        if (adet>0){
            double ortalama=(double) toplam/adet;
            System.out.println("Ortalama: " + ortalama);
        }else  {
            System.out.println("Girilen aralıkta 3 ve 4 e tam bölenen sayı yoktur.");
        }
    }
}

