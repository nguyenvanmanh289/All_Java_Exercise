import java.util.Scanner;
public class Bai6_6{
    public static void main(String args[]){
        System.out.print("nhap vao chuoi de dao nguoc trat tu: ");
        Scanner sc = new Scanner(System.in);
        String x = sc .nextLine();

        char first = x.charAt(0);
        char end = x.charAt(x.length()-1);
        System.out.print("ki tu dau: "+first+" \nki tu cuoi: "+end);
        
    }
}
