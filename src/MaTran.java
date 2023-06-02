import java.util.Scanner;

public class MaTran {
    private int SoHang;
    private int SoCot;
    private int[][] MaTran;
    public MaTran(){
        MaTran = new int[SoHang][SoCot];
    }


    public int getSoHang() {
        return SoHang;
    }

    public void setSoHang(int soHang) {
        SoHang = soHang;
    }

    public int getSoCot() {
        return SoCot;
    }

    public void setSoCot(int soCot) {
        SoCot = soCot;
    }

    public int[][] getMaTran() {
        return MaTran;
    }

    public void setMaTran(int[][] maTran) {
        MaTran = maTran;
    }
    public void TaoMaTran(int inputHang, int inputCot){
        setSoHang(inputHang);
        setSoCot(inputCot);
        MaTran = new int[getSoHang()][getSoCot()];

    }
    public void NhapMaTran(Scanner scanner) {
        for (int i = 0; i < getSoHang(); i++) {
            for (int j = 0; j < getSoCot(); j++) {
                System.out.println("Nhap vao phan tu tai vi tri [" + i + "][" + j + "]:");
                MaTran[i][j] = scanner.nextInt();
            }
        }
    }

    public void InMaTran() {
        System.out.println("Ma tran co " + getSoHang() + " hang va " + getSoCot() + " cot:");

        for (int i = 0; i < getSoHang(); i++) {
            for (int j = 0; j < getSoCot(); j++) {
                System.out.print(MaTran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
