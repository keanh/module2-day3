import java.util.Scanner;

public class timGTLNMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print("Nhập phần tử thứ [" + i+", " +j+"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sau khi nhập");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.print("\n");
        }

        int max = arr[0][0];
        int indexRow=0;
        int indexColumn=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    indexRow=i;
                    indexColumn=j;
                }
            }
        }
        System.out.println("GTLN là: " + max + " ở vị trí: " + indexRow + ", " + indexColumn);
    }
}
