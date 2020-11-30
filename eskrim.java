import java.util.Scanner;
import java.io.*;

public class eskrim {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        String yn = "";
        do {
            System.out.println("==============================");
            System.out.println("\t Happy Ice Cream");
            System.out.println("==============================");
            System.out.print("Pilihan Rasa:\n 1. Vanila \n 2. Chocolate \n 3. Mix\n");
            System.out.print("Masukkan Pilihan :");
            pilih = input.nextInt();
            System.out.println("================");
            System.out.print("Pesanan sudah sesuai (Y/N) ? ");
            yn = masuk.readLine();
            System.out.println("================");
        } while (yn.equals("n") || yn.equals("N"));
        switch (pilih) {
            case 1:
                System.out.println("Anda Memilih Varian Vanila");
                break;
            case 2:
                System.out.println("Anda Memilih Varian Chocolate");
                break;
            case 3:
                System.out.println("Anda Memilih Varian Mix");
                break;
            default:
                System.out.println("Salah Pilih ! :(");
        }
    }
}