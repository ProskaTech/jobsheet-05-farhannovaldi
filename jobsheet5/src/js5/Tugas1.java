package js5;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1 {
    public static void main(String[] args) {
        // enter word 1
        BufferedReader data1 = new BufferedReader(new InputStreamReader(System.in));
        String kata1 = "";
        System.out.print("Please enter your words 1 = ");

        try {
            kata1 = data1.readLine();
        }

        catch (IOException e) {
            System.out.println("Error !");
        }

        // enter word 2
        BufferedReader data2 = new BufferedReader(new InputStreamReader(System.in));
        String kata2 = "";
        System.out.print("Please enter your words 2 = ");

        try {
            kata2 = data2.readLine();
        }

        catch (IOException e) {
            System.out.println("Error !");
        }

        // enter 3
        BufferedReader data3 = new BufferedReader(new InputStreamReader(System.in));
        String kata3 = "";
        System.out.print("Please enter your words 3 = ");

        try {
            kata3 = data3.readLine();
        }

        catch (IOException e) {
            System.out.println("Error !");
        }

        System.out.println(kata1 + " " + kata2 + " " + kata3);
    }
}