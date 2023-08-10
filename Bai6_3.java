import java.util.Scanner;

public class Bai6_3{
    public static void main(String args[]){
        System.out.print("nhap vao chuoi so de chuyen doi thanh tien te: ");
        Scanner sc = new Scanner(System.in);
        String x = sc .nextLine();
    
        StringBuilder string = new StringBuilder(x);
        for(int i=x.length()-3;i>0;i-=3){
            string.insert(i, ".");
        }
        x=string.toString();
        System.out.print(x+"vnd");

    }
}