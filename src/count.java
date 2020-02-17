import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập size");
            size=scanner.nextInt();
            if (size>30){
                System.out.println("Size không được vượt quá 30");
            }
        }while (size>30);

        array= new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Nhập điểm học sinh thứ " + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("Danh sách điểm thi");
        for (i=0;i<array.length;i++){
            System.out.println(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10){
                count ++;
            }
        }
        System.out.println("Số học sinh đạt là: " + count);
    }
}
