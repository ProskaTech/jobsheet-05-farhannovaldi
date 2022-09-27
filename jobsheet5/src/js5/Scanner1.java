package js5;

import java.util.Scanner;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
public class Scanner1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap : ");
        String nama = in.nextLine();

        System.out.print("Masukkan NIM : ");
        int NIM = in.nextInt();

        System.out.print("Masukkan Nilai : ");
        Float nilai = in.nextFloat();

        System.out.println("\nNama : " + nama +
                "\nNIM  : " + NIM +
                "\nNilai    : " + nilai);
    }
}