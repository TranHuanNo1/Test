package Bai1;
import java.util.Scanner;

public class Bai1a {
    public static void Bai1a_DoiXung() {
        Scanner sc = new Scanner(System.in);
        int num1, reversed = 0, original;
        System.out.println("\n\nNhập vào số cần kiểm tra: ");
        num1 = sc.nextInt();
        original = num1;
        for(;num1 != 0; num1 /= 10) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
        }

        if(reversed == original){
            System.out.println(original+ " là số đối xứng!!");
        }
        else{
            System.out.println(original+ " không phải là số đối xứng!!");
        }
    }
}