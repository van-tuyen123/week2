import java.util.Scanner;

public class fibonacci {
    public static  void main(String[] args) {
        int n;
    String chuoi;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("nhap vao chuoi bat ky: ");
    chuoi = scanner.nextLine();
    System.out.println("Nhap vao so nguyenqqe: ");
    n = scanner.nextInt();
         
    if (n < 2) {
        System.out.println(chuoi);
    } else {
        for (int i = 0; i < n; i++) {
            // in chuỗi trên cùng 1 dòng
            System.out.print(chuoi);    
        }
    }
}
}

    