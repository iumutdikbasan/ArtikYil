import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int yil;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yıl Giriniz : ");
        yil = inp.nextInt();

        int zodiac = yil%400;

        if ((zodiac%4)==0){
            System.out.println("Artik Yil");
        }
        else{
            System.out.println("Artik Yil Degil");
        }
    }
}
