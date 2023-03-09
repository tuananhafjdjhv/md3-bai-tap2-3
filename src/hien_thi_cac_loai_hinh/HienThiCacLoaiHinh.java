package hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int choie;
            System.out.println("1.In hinh chu nhat \n" +
                    "2. in hinh tam giac vuong \n" +
                    "3. in hinh tam giac vuong \n" +
                    "4. Exit \n");
            System.out.println("Nhap lua chon ");
            choie = Integer.parseInt(input.nextLine());
            switch (choie) {
                case 1:
                    System.out.println("nhap chieu dai:");
                    int with = input.nextInt();
                    System.out.println("nhap chieu rong:");
                    int height = input.nextInt();
                    drawRecTanggle(with,height);
                case 2:
                    System.out.println("nhap do dai canh goc vuong:");
                    int canh = input.nextInt();
                    drawTritanggle(canh);
                case 3:
                    System.out.println("nhap do dai canh goc vuong:");
                    int h = input.nextInt();
                    drawCanTriangle(h);
                case 4:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);
                default:
                    System.err.println("lua chon khong hop le");
            }
        }
    }

    public static void drawRecTanggle(int with,int height ) {
        for (int i = 0; i < with; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }

    public static void drawTritanggle(int canh) {
        for (int i = 0; i < canh; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }

    public static void drawCanTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2*height-1 ; j++) {
                if (j>= height - i +1 && j<= height + i -1 ){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
