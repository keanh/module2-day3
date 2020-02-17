import java.util.Scanner;

public class chen {
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
        int index;
        int j=0;
        int[] newArr = new int[size +1];
        System.out.println("Nhập số cần chèn");
        X=scanner.nextInt();
        System.out.println("Nhập vị trí");
        index=scanner.nextInt();
        if (index<0 && index > array.length-1){
            System.out.println("Không chèn được phần tử");
        }else {
           for (i=0;i<newArr.length;i++){
               if (i == index-1){
                   newArr[i] = X;
               }else{
                   newArr[i] = array[j];
                   j++;
               }
           }
        }

        System.out.println("Sau khi chèn là");
        for (i=0;i<newArr.length;i++){
            System.out.print(newArr[i]);
        }
    }
}
