import java.util.Scanner;

public class Bai6_1 {
    public static void main(String args[]){
        System.out.print("nhap vao chuoi de dao nguoc trat tu: ");
        Scanner sc = new Scanner(System.in);
        String x = sc .nextLine();

        String result[] = x.split(" ");
        String ho="";String tendem=""; String ten="";

        for(int i=1;i<result.length-1;i++){
            tendem+= result[i]+" ";
        }
        tendem = tendem.trim();
        ho = result[0];
        ten = result[result.length-1];
        System.out.print("Ho :"+ ho+" \nTen Dem: "+tendem+" \nTen: "+ten);

    }
}
