import java.util.Scanner;

public class Bai6_2 {
    public static void main(String args[]){
        System.out.print("nhap vao chuoi de chuan hoa: ");
        Scanner sc = new Scanner(System.in);
        String x = sc .nextLine();

        String string[] = x.split(" ");
        String a = "";
        for (String item : string) {
           char up = Character.toUpperCase(item.charAt(0));
            a += item.replace(item.charAt(0), up)+" ";
        }
       System.out.print("chuoi sau khi chuan hoa: "+a.trim()+".");
    }

}
