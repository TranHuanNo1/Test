package Bai1;
import java.util.Scanner;
import java.lang.Math;

public class Bai1b {
    public static void ChinhPhuong() {

            int n;
            boolean res;
            Scanner sc;
            do {
                System.out.print("Nhập số cần kiểm tra ");
                sc = new Scanner(System.in);
                n = sc.nextInt();
            }while(n <= 0);

            res = check_square_num(n);
            if(res) {
                System.out.println(n + " Là số chính phương");
            }
            else {
                System.out.println(n + " Không phải là số chính phương");
            }

            sc.close();
        }

        public static boolean check_square_num(int n) {

            int temp = (int)Math.sqrt(n);
            if(temp*temp == n) {
                return true;
            }
            else {
                return false;
            }
        }

}