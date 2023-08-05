import java.util.Scanner;
public class Bai2_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao n so can tinh: ");
        int n = sc.nextInt();
        float sum = 0.0f;
        for(int i=1;i<=n;i++){
            float x= (int)i;
            sum+=1.0/x;
        }
        System.out.print("tong S = 1 + 1/2 + 1/3 + ... + 1/n với n nguyên dương được nhập từ bàn phím la: "+sum);
    }
}
