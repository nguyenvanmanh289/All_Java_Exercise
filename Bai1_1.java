import java.util.Scanner;
public class Bai1_1{
    public static void main(String []args){
        String name , Class , field , sex , birthday , address ;

        System.out.println("hay nhap vao ho va ten: ");
        Scanner inp = new Scanner(System.in);
        name = inp.nextLine();
        
        System.out.println("hay nhap vao lop: ");
        Class = inp.nextLine();

        System.out.println("hay nhap vao truong: ");
        field = inp.nextLine();

        System.out.println("hay nhap vao gioi tinh: ");
        sex = inp.nextLine();

        System.out.println("hay nhap vao ngay sinh: ");
        birthday = inp.nextLine();

        System.out.println("hay nhap vao dia chi: ");
        address = inp.nextLine();


        System.out.println("////////====THONG TIN CUA "+name+" la: ");
        System.out.println("ho va ten: "+name+"\n"+
                            "lop: "+Class+"\n"+
                            "truong: "+field+"\n"+
                            "gioi tinh: "+sex+"\n"+
                            "ngay sinh: "+birthday+"\n"+
                            "que quan: "+address
        
        
        );

    }
}