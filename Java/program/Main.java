/*
    Saya Achmad Fauzan NIM 2108061 mengerjakan soal Latihan Praktikum 1 dalam mata
    kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // deklarasi sekaligus instansiasi ArrayList mahasiswa
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

        // deklarasi sekaligus instansiasi objek Scanner
        Scanner sc = new Scanner(System.in);
        String menu;

        do
        {            
            System.out.println("+-----------------+");
            System.out.println("| S I A K   U B I |");
            System.out.println("+-----------------+");

            // Tampilkan data mahasiswa yang tersedia
            CRUD.readData(mhs);
            
            System.out.println("+---------------------------+");
            System.out.println("| 'C' Create Data Mahasiswa |");
            System.out.println("| 'U' Update Data Mahasiswa |");
            System.out.println("| 'D' Delete Data Mahasiswa |");
            System.out.println("+---------------------------+");

            System.out.print("Masukkan perintah yang ingin dijalankan ");

            // scan perintah untuk operasi selanjutnya
            menu = sc.nextLine();

            // variabel-variabel untuk menampung input
            String nama = "", nim = "", prodi = "", fakultas = "";
            int target;
    
            switch (menu) {
                // jika perintah merupakan create
                case "C":
                    System.out.println("+-----------------------+");
                    System.out.println("| Create Data Mahasiswa |");
                    System.out.println("+-----------------------+");

                    // scan masing-masing data mahasiswa
                    System.out.print("Nama          : ");
                    nama = sc.nextLine();
                    System.out.print("NIM           : ");
                    nim = sc.nextLine();
                    System.out.print("Program Studi : ");
                    prodi = sc.nextLine();
                    System.out.print("Fakultas      : ");
                    fakultas = sc.nextLine();
    
                    // panggil method untuk menambah data
                    CRUD.createData(mhs, nama, nim, prodi, fakultas);
                break;

                // jika perintah merupakan update
                case "U":
                    System.out.println("Masukkan nomor mahasiswa yang ingin diubah : ");

                    // scan nomor mahasiswa yang ingin diupdate
                    target = sc.nextInt();
                    sc.nextLine();

                    System.out.println("+-----------------------+");
                    System.out.println("| Update Data Mahasiswa |");
                    System.out.println("+-----------------------+");

                    // jika nomor mahasiswa valid (ada dalam index ArrayList)
                    if (target > 0 && target <= mhs.size())
                    {
                        // Tampilkan dahulu data awal mahasiswa yang ingin diupdate
                        System.out.println("Nama            : " + mhs.get(target - 1).getNama());
                        System.out.println("NIM             : " + mhs.get(target - 1).getNim());
                        System.out.println("Program Studi   : " + mhs.get(target - 1).getProdi());
                        System.out.println("Fakultas        : " + mhs.get(target - 1).getFakultas());

                        System.out.println("Masukkan data mahasiswa baru");

                        // scan masing-masing data mahasiswa baru
                        System.out.print("Nama          : ");
                        nama = sc.nextLine();
                        System.out.print("NIM           : ");
                        nim = sc.nextLine();
                        System.out.print("Program Studi : ");
                        prodi = sc.nextLine();
                        System.out.print("Fakultas      : ");
                        fakultas = sc.nextLine();

                        // panggil method untuk mengubah data
                        CRUD.updateData(mhs, target - 1, nama, nim, prodi, fakultas);
                    }
                    // jika nomor mahasiswa tidak valid
                    else
                    {
                        System.out.println("ERROR: Nomor tidak valid.");
                        System.out.println("Perintah dibatalkan.");
                    }
                break;

                // jika perintah merupakan delete
                case "D":
                    System.out.println("Masukkan nomor mahasiswa yang ingin dihapus : ");

                    // scan nomor mahasiswa yang ingin dihapus
                    target = sc.nextInt();
                    sc.nextLine();

                    System.out.println("+-----------------------+");
                    System.out.println("| Delete Data Mahasiswa |");
                    System.out.println("+-----------------------+");

                    // jika nomor mahasiswa valid
                    if (target > 0 && target <= mhs.size())
                    {
                        // tampilkan dahulu data mahasiswa yang akan dihapus
                        System.out.println("Nama            : " + mhs.get(target - 1).getNama());
                        System.out.println("NIM             : " + mhs.get(target - 1).getNim());
                        System.out.println("Program Studi   : " + mhs.get(target - 1).getProdi());
                        System.out.println("Fakultas        : " + mhs.get(target - 1).getFakultas());

                        System.out.println("Apakah anda yakin ingin menghapus data mahasiswa tersebut (Y/N)?");

                        // scan konfirmasi user sebelum menghapus data
                        String confirm;
                        confirm = sc.nextLine();

                        // jika user mengkonfirmasi penghapusan
                        if (confirm.equals("Y"))
                        {
                            // panggil method untuk menghapus data
                            CRUD.deleteData(mhs, target - 1);
                        }
                        // jika user membatalkan penghapusan
                        else
                        {
                            System.out.println("Perintah dibatalkan.");
                        }
                    }
                    // jika nomor mahasiswa tidak valid
                    else
                    {
                        System.out.println("ERROR: Nomor tidak valid.");
                        System.out.println("Perintah dibatalkan.");
                    }
                break;
            }
        }
        while(menu != "X");

        // tutup objek scanner
        sc.close();
    }
}
