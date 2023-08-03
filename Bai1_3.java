import java.util.Scanner;
public class Bai1_3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.println("nhap vao so a va so b ");
        a= scan.nextInt();
        b= scan.nextInt();
        int c= (a>b)?a:b;
        System.out.println("so lon hon la: "+c );
        
    }
}