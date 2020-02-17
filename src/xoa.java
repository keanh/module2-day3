import java.util.Scanner;

public class xoa {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Không được nhập quá 20");
            }
        }while (size>20);

        array = new int[size];
        int i=0;
        while (i<array.length){
            array[i] = scanner.nextInt();
            i++;
        }

        int X;
        System.out.println("Nhập số cần xóa");
        X = scanner.nextInt();
        int c=0,j=0;
        while (j<array.length){
            if (array[j] != X){
                array[c] = array[j];
                c++;
            }
            j++;
        }
        size=c;
        System.out.println("Sau khi xóa:");
        for (i=0;i<size;i++) {
            System.out.print(array[i]);
        }
    }
}
