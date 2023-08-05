import java.util.Scanner;
public class Bai3_2 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap vao ban kinh R: ");
        float bk = sc.nextFloat();

        System.out.print("dien tich hinh tron co ban kinh R = "+bk+ " la: "+squareCircle(bk));
        
    }
    public static float squareCircle(float bk){
        return (bk*bk*3.14f);
    }
}