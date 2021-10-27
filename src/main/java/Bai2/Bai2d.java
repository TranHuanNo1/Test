package Bai2;
import java.util.Scanner;
public class Bai2d {
    public static void Bai2d_LuyThua() {
        int rs;
        rs = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số cần tính : ");
        int N = in.nextInt();
        for(int i=1;i<=N;i++){
            rs = rs * i;
        }
        if (N == 0) {
            System.out.println("Kết quả  là : 0");
        }  else{
            System.out.println("Kết quả là : " + rs);
        }
    }

}

