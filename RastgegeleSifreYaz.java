package RastgeleSifreYazdirma;
import java.util.Random;
import java.util.Scanner;

public class RastgegeleSifreYaz {
    public static void main(String[] args) {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        Scanner input=new Scanner(System.in);

        System.out.print("şifre kaç basamaklı olacak=");
        int uzunlukdegeri=input.nextInt();
        System.out.println(sifreolusturma(uzunlukdegeri));

    }
    static char[]sifreolusturma(int uzunlukdegeri)
    {
String karakter="QWERTYUIOPĞÜASDFGHJKLŞİ"+
        "qwertyuıopğüasdfghjkllşi"+
        "ZXCVBNMÖÇzxcvbnmöç"+
        "!'^+%&/()=?_-?*<>£#$½{[]}";
String deger=karakter;
char[] sifre=new char[uzunlukdegeri];
int i;
for(i=0; i<uzunlukdegeri; i++){
    Random rastgelesifre=new Random();
    sifre[i] +=deger.charAt(rastgelesifre.nextInt(deger.length()));
        }
System.out.println("..LUTFEN BEKLEYİN...");
int gerisayim;
for(gerisayim=0; gerisayim<=4; gerisayim++){
    System.out.println("Şifreniz oluşturuluyor..."+(4-gerisayim));
    try
    {
Thread.sleep(1000);


}
catch(InterruptedException e){
    System.out.println(e);
        }
}
        System.out.print("oluşturulan şifre=");
return sifre;
}
}

