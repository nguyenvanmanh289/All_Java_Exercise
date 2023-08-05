public class Bai2_7 {
    public static void main(String args[]){
        int quantity = 0;
        for(int i=1;i<=100;i++){
            if(i%3==0 || i%7==0){
                quantity+=1;
            }
        }
        System.out.print("so luong so chia het cho 3 hoac 7 la: "+quantity);
    }
}
