import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

        Scanner sc = new Scanner(System.in);
        String menu;

        do
        {            
            System.out.println("+-----------------+");
            System.out.println("| S I A K   U B I |");
            System.out.println("+-----------------+");

            CRUD.readData(mhs);
            
            System.out.println("+---------------------------+");
            System.out.println("| 'C' Create Data Mahasiswa |");
            System.out.println("| 'U' Update Data Mahasiswa |");
            System.out.println("| 'D' Delete Data Mahasiswa |");
            System.out.println("+---------------------------+");

            System.out.print("Masukkan perintah yang ingin dijalankan ");

            menu = sc.nextLine();

            String nama = "", nim = "", prodi = "", fakultas = "";
            int target;
    
            switch (menu) {
                case "C":
                
                    System.out.println("+-----------------------+");
                    System.out.println("| Create Data Mahasiswa |");
                    System.out.println("+-----------------------+");

                    System.out.print("Nama          : ");
                    nama = sc.nextLine();
                    System.out.print("NIM           : ");
                    nim = sc.nextLine();
                    System.out.print("Program Studi : ");
                    prodi = sc.nextLine();
                    System.out.print("Fakultas      : ");
                    fakultas = sc.nextLine();
        
                    CRUD.createData(mhs, nama, nim, prodi, fakultas);
                break;

                case "U":
                    System.out.println("Masukkan nomor mahasiswa yang ingin diubah : ");

                    target = sc.nextInt();
                    sc.nextLine();

                    System.out.println("+-----------------------+");
                    System.out.println("| Update Data Mahasiswa |");
                    System.out.println("+-----------------------+");

                    if (target > 0 && target <= mhs.size())
                    {
                        System.out.println("Nama            : " + mhs.get(target - 1).getNama());
                        System.out.println("NIM             : " + mhs.get(target - 1).getNim());
                        System.out.println("Program Studi   : " + mhs.get(target - 1).getProdi());
                        System.out.println("Fakultas        : " + mhs.get(target - 1).getFakultas());

                        System.out.println("Masukkan data mahasiswa baru");

                        System.out.print("Nama          : ");
                        nama = sc.nextLine();
                        System.out.print("NIM           : ");
                        nim = sc.nextLine();
                        System.out.print("Program Studi : ");
                        prodi = sc.nextLine();
                        System.out.print("Fakultas      : ");
                        fakultas = sc.nextLine();

                        CRUD.updateData(mhs, target - 1, nama, nim, prodi, fakultas);
                    }
                    else
                    {
                        System.out.println("ERROR: Nomor tidak valid.");
                        System.out.println("Perintah dibatalkan.");
                    }
                break;

                case "D":
                    System.out.println("Masukkan nomor mahasiswa yang ingin dihapus : ");

                    target = sc.nextInt();
                    sc.nextLine();

                    System.out.println("+-----------------------+");
                    System.out.println("| Delete Data Mahasiswa |");
                    System.out.println("+-----------------------+");

                    if (target > 0 && target <= mhs.size())
                    {
                        System.out.println("Nama            : " + mhs.get(target - 1).getNama());
                        System.out.println("NIM             : " + mhs.get(target - 1).getNim());
                        System.out.println("Program Studi   : " + mhs.get(target - 1).getProdi());
                        System.out.println("Fakultas        : " + mhs.get(target - 1).getFakultas());

                        System.out.println("Apakah anda yakin ingin menghapus data mahasiswa tersebut (Y/N)?");

                        String confirm;
                        confirm = sc.nextLine();

                        if (confirm.equals("Y"))
                        {
                            CRUD.deleteData(mhs, target - 1);
                        }
                        else
                        {
                            System.out.println("Perintah dibatalkan.");
                        }
                    }
                    else
                    {
                        System.out.println("ERROR: Nomor tidak valid.");
                        System.out.println("Perintah dibatalkan.");
                    }
                break;
            }
        }
        while(menu != "X");

        sc.close();
    }
}
