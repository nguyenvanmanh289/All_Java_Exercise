import java.util.Scanner;

public class Bai3_3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap vao so n de kiem tra chan le: ");
        int n = sc.nextInt();
        String str =Check(n)?"so chan":"so le";
        System.out.print("so vua nhap la so: "+str);

    }
    public static boolean Check(int n){
        if(n%2==0) return true;
        else return false;
    }
}
