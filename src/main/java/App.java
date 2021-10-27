import java.util.Scanner;
import Bai1.Bai1a;
import Bai1.Bai1b;
import Bai2.Bai2d;
import Bai2.Bai2e;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Nhập bài toán cần làm : ");
    int N = in.nextInt();
      if (N==1) {
          Bai1a a = new Bai1a();
          a.Bai1a_DoiXung();
      }
      else if (N==2) {
          Bai1b b = new Bai1b();
          b.ChinhPhuong();
      }
      if (N==3) {
       Bai2d c = new Bai2d();
       c.Bai2d_LuyThua();
    }
      else if (N==4){
        Bai2e d = new Bai2e();
        d.Bai2e_GiaiThua();
    }
  }
}


