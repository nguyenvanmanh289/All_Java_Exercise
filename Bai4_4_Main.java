public class Bai4_4_Main {
    public static void main(String args[]){
        Bai4_4 sv1 = new Bai4_4();
        Bai4_4 sv2 = new Bai4_4();
        System.out.println("nhap tt sv1: ");
        sv1.setInfo();
        System.out.println("nhap tt sv2: ");
        sv2.setInfo();

        if(sv1.getPoint()>sv2.getPoint()) 
            System.out.print("sv1 diem cao hon");
        else 
            System.out.print("sv2 diem cao hon");
    }
}
