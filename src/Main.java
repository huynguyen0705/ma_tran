import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaTran maTran = new MaTran();
        try {
            boolean isRunning = true;
            while (isRunning) {
            System.out.println("1. nhap vao 1 ma tran");
            System.out.println("2. in ra ma tran");
            System.out.println("3. thoat");
            System.out.println("moi nhap: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input < 1 || input > 3){
                System.out.println("Nhap sai");
            }
                switch (input) {
                    case 1:
                        System.out.println("Nhap so hang cho ma tran: ");
                        Scanner scanner1 = new Scanner(System.in);
                        int inputHang = scanner1.nextInt();
                        System.out.println("Nhap so cot cho ma tran: ");
                        Scanner scanner2 = new Scanner(System.in);
                        int inputCot = scanner2.nextInt();
                        maTran.TaoMaTran(inputHang, inputCot);
                        System.out.println("Nhap cac gia tri cho ma tran");
                        Scanner scanner3 = new Scanner(System.in);
                        maTran.NhapMaTran(scanner3);
                        break;
                    case 2:
                        maTran.InMaTran();
                        break;
                    case 3:
                        isRunning = false;
                }
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("tran mang");
        }catch (InputMismatchException e){
            System.out.println("sai tham so dau vao");
        }
    }
}