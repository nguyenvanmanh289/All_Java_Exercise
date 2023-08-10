import java.util.Scanner;

public class Bai6_5 {
    public static void main(String args[]){
        System.out.print("nhap vao chuoi de kiem tra palindrome: ");
        Scanner sc = new Scanner(System.in);
        String x = sc .nextLine();

       StringBuilder flip = new StringBuilder(x);
       if(x.equals(flip.reverse().toString())) System.out.print("chuoi da nhap la palindrome !");
       else System.out.print("chuoi da nhap ko phai palindrome");
       
    }
}