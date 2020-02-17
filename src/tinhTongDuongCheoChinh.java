import java.util.Scanner;

public class tinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,column;
       do {
           System.out.println("Nhập số hàng");
           row = scanner.nextInt();
           System.out.println("Nhập số cột");
           column = scanner.nextInt();
           if (row != column){
               System.out.println("Không phải ma trận vuông");
           }
       }while (row != column);

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

        int tong=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (i==j){
                    tong += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các đường chéo chính là: " + tong + "\t");
    }
}
