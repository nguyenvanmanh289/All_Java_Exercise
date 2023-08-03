import java.util.Scanner;
public class Bai1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("nhap vao so nguyen a: ");
        a= scan.nextInt();

        System.out.println("nhap vao so nguyen a: ");
        b= scan.nextInt();

        System.out.println("tong 2 so la: "+ (a+b));
        System.out.println("hieu 2 so la: "+ (a-b));
                System.out.println("thhuong 2 so la: "+(a/b));
                        System.out.println("du 2 so la: "+ (a%b));



    }
}
