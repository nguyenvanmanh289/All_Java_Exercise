import java.util.Scanner;

public class Bai6_4 {
    public static void main(String args[]){
        System.out.print("nhap vao chuoi de dao nguoc trat tu: ");
        Scanner sc = new Scanner(System.in);
        String x = sc .nextLine();

        String string[] = x.split(" ");
        String a = "";
        for (String item : string) {
            StringBuilder flipItem = new StringBuilder(item);
            a += flipItem.reverse().toString()+" ";
        }
       
       
       System.out.print("chuoi da dao la: "+a.trim());
    }
}
