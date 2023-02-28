import java.util.Scanner;
public class Main {

    public static int ustalma(int a, int b){
        if(b==0){
            return 1;
        }else {
            return a * ustalma(a, b-1);
        }
    }
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Taban Sayısını Gir: ");
            a = input.nextInt();
            System.out.print("Üs Sayısını Gir: ");
            b = input.nextInt();

            System.out.println("Sonuç : " + ustalma(a, b));
        }while(a>0);
    }
}