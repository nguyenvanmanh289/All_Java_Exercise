import java.util.Scanner;
public class Bai4_3 {
    private String name , address , Class , msv , khoahoc;
    private int age , height , weight , numberPhone , cccd;

    public Bai4_3(String name , int age){
        this.name = name;
        this.age = age;
    }
    public Bai4_3(String name , String msv){
        this.name = name;
        this.msv = msv;
    }

    public Bai4_3(String name , String Class, int age){
        this.name = name;
        this.Class = Class;
        this.age = age;
    }
    
    public Bai4_3(String name , String msv , String Class , String address){
        this.name = name;
        this.msv = msv;
        this.Class = Class;
        this.address = address;
    }
    public Bai4_3(String name ,int age, int height, String msv , String Class , String address){
        this.name = name;
        this.msv = msv;
        this.Class = Class;
        this.address = address;
    }

    ///========Get set method=======//
    public void SetName(String newname){
        name = newname;
    }
    public String getName(){
        return name;
    }

    //======== methods =====// 
    public void setInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap vao thong tin sinh vien: \n");
        System.out.print("nhap ten: \n");
            name = sc.nextLine();
        System.out.print("nhap tuoi: \n");
            age = sc.nextInt();
        System.out.print("nhap LOP: \n");
            Class = sc.nextLine();
        System.out.print("nhap MSV: \n");
            msv = sc.nextLine();
        System.out.print("nhap Dia chi: \n");
            address = sc.nextLine();
        System.out.print("nhap Khoa hoc: \n");
            khoahoc = sc.nextLine();
        System.out.print("nhap Chieu cao: \n");
            height = sc.nextInt();
        System.out.print("nhap Can nang: \n");
            weight = sc.nextInt();
        sc.close();
    }

    public void getInfor(){
        System.out.print("thong tin sinh vien:"+ name +":  \n");
        System.out.print("ten: "+name+" \n");
            
        System.out.print("tuoi: "+age+" \n");
           
        System.out.print("LOP:"+Class+" \n");
            
        System.out.print("MSV: "+msv+" \n");
           
        System.out.print("Dia chi: "+address+" \n");
            
        System.out.print("Khoa hoc: "+khoahoc+" \n");
            
        System.out.print("Chieu cao: "+height+" \n");
            
        System.out.print("Can nang: "+weight+" \n");

    }
}
