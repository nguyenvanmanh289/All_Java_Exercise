import java.util.Scanner;
public class Bai4_4 {

    private String name, Class ;
    private float mediumPoint;
    public Bai4_4(){

    };
    public void setInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten: ");
            name = sc.nextLine();
        System.out.println("nhap lop: ");
            Class = sc.nextLine();
        System.out.println("nhap diem: ");
            mediumPoint =sc.nextFloat();
        sc.close();
    }
    public float getPoint(){
        return mediumPoint;
    }
}
