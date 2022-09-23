import java.util.Scanner;

public class okulpuanlari {

    private static int puan;

    public static void main(String[] args){
       System.out.println("puanlarigiriniz");
       Scanner scan= new Scanner(System.in);
       int puani=scan.nextInt();
        if (puan<=0 && puan <= 35){
           System.out.println ("harf notunuz:FF");
       } else if (puan>35 && puan <= 50) {
            System.out.println ("harf notunuz:DC");
        }  else if (puan>50 && puan <= 70) {
            System.out.println ("harf notunuz:BB");
        }  else if (puan>70 && puan <= 100) {
            System.out.println ("harf notunuz:AA");
        }
          else if (puan > 100){
            System.out.println ("hatalı giriş yaptınız");
        }
    }
}