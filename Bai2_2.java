import java.util.Scanner;
public class Bai2_2{
    public static void main(String args[]){
        System.out.println("nhap vao khoang so m->n");
        System.out.println("nhap m va n");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println("nhap vao so K: ");
        int k= scan.nextInt();

        int sum = 0;
        for(int i=m;i<n;i++){
            if(i%k==0){
                sum+=i;
            }    
        }
        System.out.println("tong cac so chia het cho 4 trong khoang "+m+" "+n+" la: "+sum);
    }
}