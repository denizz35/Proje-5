import java.util.Scanner;

public class BasamakAyirici {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir pozitif sayı giriniz: ");
        int sayi = input.nextInt();

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;
        int binler = (sayi / 1000) % 10;
        int elliler = (sayi / 10000) % 10;

        System.out.println("Girilen sayının basamakları şu şekildedir: " +
                "Birler Basamağı: " + birler + "\n" +
                "Onlar Basamağı: " + onlar + "\n" +
                "Yüzler Basamağı: " + yuzler + "\n" +
                "Binler Basamağı: " + binler + "\n" +
                "Elliler Basamağı: " + elliler);
    }
}