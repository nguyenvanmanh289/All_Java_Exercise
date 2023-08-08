import java.util.Scanner;
public class chuyenXeNoiThanh extends chuyenXe{

    private String sotuyen;
    private int sokmdi;
    
    public chuyenXeNoiThanh(){

    }
    public chuyenXeNoiThanh(String msc, String hoten, int soxe, float doanhthu,String sotuyen,int sokmdi) {
        super(msc, hoten, soxe, doanhthu);
        this.sotuyen = sotuyen;
        this.sokmdi = sokmdi;
    }
   
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        super.nhapTT();

        System.out.print("nhap vao ma so tuyen: ");
            sotuyen = sc.nextLine();
        
        System.out.print("nhap vao so km da di: ");
            sokmdi = sc.nextInt();

        System.out.print("nhap vao doanh thu: ");
            doanhthu = sc.nextFloat();
    }
}

