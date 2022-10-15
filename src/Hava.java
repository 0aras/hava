import java.util.*;
import java.lang.*;

public class Hava {
    public static void main(String[] args) {
        System.out.println("Bana hava sıcaklığını söyle. hemen !!25");
        Scanner sc=new Scanner(System.in);
        int hava_d= sc.nextInt();
       if(hava_d<=5){
           System.out.println("Bu havada ancak kayak yapılır!!");
       }else if(hava_d>5&& hava_d<=15){
           System.out.println("hava serin ama sinema sıcaktır !!");
       }else if(hava_d>15&& hava_d<=25){
           System.out.println("Mis gibi bir hava tam piknik zamanı!!");
       }else if(hava_d>25){
           System.out.println("Sıcaktan ölme denize gir bari!!");
       }
    }
}
