import java.util.Scanner;

public class demKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str;
        System.out.println("Nhập chuỗi");
        str = scanner.nextLine();
        System.out.println("Nhập kí tự cần đếm trong chuỗi");
        char kiTu = scanner.nextLine().charAt(0);
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == kiTu){
                count++;
            }
        }
        System.out.println("Số lần kí tự " + kiTu + " xuất hiện là " + count);
    }
}
