package Bai2;
import java.util.Scanner;

public class Bai2e {
    public static void Bai2e_GiaiThua() {
        int rs;
        rs = 0;
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số cần tính : ");
        int N = in.nextInt();
        for(int i=1;i<=N;i++){
            a = 1;
            for(int j=1;j<=i;j++){
                a = a * j;
            }
            rs = rs + a;
        }
        if (N == 0) {
            System.out.println("Kết quả  là : 0");
        }  else{
            System.out.println("Kết quả  là : " + rs);
        }
    }
}
