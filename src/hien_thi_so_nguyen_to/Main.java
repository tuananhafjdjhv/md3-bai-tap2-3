package hien_thi_so_nguyen_to;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong SNT can in ra: ");
        int soluong = input.nextInt();
        int count = 0;
        int n = 2;
        while (true){
            if (kiemtraSNT(n)){
                System.out.println(n);
                count++;
            }
            n++;
            if (count==soluong)
                break;
        }
    }


    public static boolean kiemtraSNT(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
