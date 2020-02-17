import java.util.Scanner;

public class tinhTongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sau khi nhập");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Nhập cột muốn tính");
        int index = scanner.nextInt();
        for (int j = index; j < column; ) {
            int tong = 0;
            for (int i = 0; i < row; i++) {
                tong += arr[i][j];
            }
            System.out.println(tong);
            break;
        }
    }
}
