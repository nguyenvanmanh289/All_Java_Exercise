import java.util.Scanner;
public class Bai2_9 {
    public static void main(String args[]){
        float sum = 1.0f;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao n so can tinh: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            float mauso =1.0f;
            for(int j=i;j>=1;j--){
                mauso*=j;
            }
            float x= (int)i;
            sum+=x/mauso;
        }
        System.out.print("tong S = 1 /1! + 2 /2! + ....+ n / n! la: "+sum);
    }
}
