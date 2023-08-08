import java.util.Scanner;
public class chuyenXe_main {
    public static void main(String args[]){
        System.out.println("========= QUAN LI CHUYEN XE =========");

        int n;
        do{
            System.out.println(" chon: \n1 de nhap danh sach chuyen xe noi thanh\n  2 de nhap danh sach chuyen xe ngoai thanh .  . ... ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }
        while(n!=1 && n!=2);
        init(n);
        
    }

    public static void init(int n){
        Scanner sc = new Scanner(System.in);
        if(n==1){
            System.out.print("ban chon nhap danh sach chuyen xe noi thanh !\n");
            System.out.print("nhap so luong chuyen xe: ");
            int sch = sc.nextInt();
            
            chuyenXeNoiThanh[] arr = new chuyenXeNoiThanh[sch];
            for(int i =0;i<sch;i++){
                System.out.println("nhap vao chuyen xe thu: "+(i+1));
                arr[i] = new chuyenXeNoiThanh("", "", 0, 0, "",0);
                arr[i].nhapTT();
                System.out.print("==================\n\n");
            }
            float sum=0;
            for(int i=0; i<sch;i++){
                sum+=arr[i].doanhThu();
            }
            System.out.print("tong doanh thu chuyen xe noi thanh la: "+sum);
        }
        else{
            System.out.print("ban chon nhap danh sach chuyen xe ngoai thanh !\n");
            System.out.print("nhap so luong chuyen xe: ");
            int sch = sc.nextInt();
            
            chuyenXeNgoaiThanh[] arr = new chuyenXeNgoaiThanh[sch];
            for(int i =0;i<sch;i++){
                System.out.println("nhap vao chuyen xe thu: "+(i+1));
                arr[i] = new chuyenXeNgoaiThanh("", "", 0, 0, "",0);
                arr[i].nhapTT();
                System.out.print("===============\n\n");
            }
            float sum=0;
            for(int i=0; i<sch;i++){
                sum+=arr[i].doanhThu();
            }
            System.out.print("tong doanh thu chuyen xe ngoai thanh la: "+sum);
        }

    }

    
}
