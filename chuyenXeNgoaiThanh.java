import java.util.Scanner;

public class chuyenXeNgoaiThanh extends chuyenXe{
    private String noiden;
    private int songaydi;
    
    public chuyenXeNgoaiThanh(String msc, String hoten, int soxe, float doanhthu,String noiden,int songaydi) {
        super(msc, hoten, soxe, doanhthu);
        this.noiden = noiden;
        this.songaydi = songaydi;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.print("nhap vao noi den: ");
            noiden = sc.nextLine();
        
        System.out.print("nhap vao so ngay di dc: ");
            songaydi = sc.nextInt();

        System.out.print("nhap vao doanh thu: ");
            doanhthu = sc.nextFloat();

    }
   
}
