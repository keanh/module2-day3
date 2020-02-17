import java.util.Scanner;

public class timGTNN {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Không được nhập quá 20");
            }
        }while (size > 20);

        array = new int[size];
        int i=0;
        while (i<array.length){
            array[i] = scanner.nextInt();
            i++;
        }

        int min = array[0];
        int index = 1;
        for (int j=0;j<array.length;j++){
            if (min > array[j]){
                min = array[j];
                index = j+1;
            }
        }
        System.out.println("Số nhỏ nhất là " + min + " ở vị trí " + index);
    }
}
