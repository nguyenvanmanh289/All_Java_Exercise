import java.util.Scanner;

public class chuyenXe {
    protected String msc;
    protected String hoten;
    protected int soxe; 
    protected float doanhthu;

    public chuyenXe(){
        
    }
    public chuyenXe(String msc,String hoten,int soxe, float doanhthu){
        this.msc = msc;
        this.hoten = hoten;
        this.soxe= soxe;
        this.doanhthu = doanhthu;
    }

    public float doanhThu(){
        return doanhthu;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ma so chuyen: ");
        
            msc = sc.nextLine();
        
        System.out.print("nhap vao ho ten nguoi lai xe: ");
            hoten = sc.nextLine();

        System.out.print("nhap vao so xe: ");
            soxe = sc.nextInt();
    }
}
