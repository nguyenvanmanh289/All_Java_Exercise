import java.util.Scanner;
public class Bai2_1{
    public static void main(String args[]){
        System.out.print("nhap vao so luong so can nhap: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("nhap so thu: "+i+": ");
            arr[i] = sc.nextInt();
            if(arr[i]%4==0 || arr[i]>299 && arr[i]<400){
                sum+=arr[i];
            }
        }
        sc.close();
        System.out.print("Tong cac so chia het cho 4 hoac co chu so hang tram la 3 la: "+sum);
    }
}