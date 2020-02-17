import java.util.Scanner;

public class findPoisition {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm vị trí");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên " + input_name +" là " + (i+1));
                isExist = true;
                break;
            }
        }
        if (isExist = false){
            System.out.println("Không tìm thấy " + input_name +" trong danh sách");
        }
    }
}
