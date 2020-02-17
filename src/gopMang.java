import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1,size2;
        System.out.println("Nhập size cho mảng 1");
        size1=scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Nhập size cho mảng 2");
        size2=scanner.nextInt();
        int[] arr2 = new int[size2];

        int i=0;
        int j=0;
        System.out.println("Mảng 1");
        while (i<arr1.length){
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng 2");
        while (j<arr2.length){
            arr2[j] = scanner.nextInt();
            j++;
        }

        int k=0;
        int m=0;
        int[] arr3 = new int[size1 + size2];
        for (i=0;i<arr1.length;i++){
            arr3[i] = arr1[k];
            k++;
        }

        for (i=arr1.length;i<arr3.length;i++){
            arr3[i] = arr2[m];
            m++;
        }

        System.out.println("Sau khi gộp");
        for (i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }
    }
}
