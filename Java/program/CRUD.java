import java.util.ArrayList;

public class CRUD
{
    private static void borderLine(int a, int b, int c, int d, int e)
    {
        System.out.print("+-");
        for (int i = 0; i < a; i++) System.out.print("-");
        System.out.print("-+-");
        for (int i = 0; i < b; i++) System.out.print("-");
        System.out.print("-+-");
        for (int i = 0; i < c; i++) System.out.print("-");
        System.out.print("-+-");
        for (int i = 0; i < d; i++) System.out.print("-");
        System.out.print("-+-");
        for (int i = 0; i < e; i++) System.out.print("-");
        System.out.println("-+");
    }

    private static void contentLine(int a, int b, int c, int d, int e, String p, String q, String r, String s, String t)
    {
        System.out.print("| " + p);
        for (int i = 0; i < (a - p.length()); i++) System.out.print(" ");
        System.out.print(" | " + q);
        for (int i = 0; i < (b - q.length()); i++) System.out.print(" ");
        System.out.print(" | " + r);
        for (int i = 0; i < (c - r.length()); i++) System.out.print(" ");
        System.out.print(" | " + s);
        for (int i = 0; i < (d - s.length()); i++) System.out.print(" ");
        System.out.print(" | " + t);
        for (int i = 0; i < (e - t.length()); i++) System.out.print(" ");
        System.out.println(" |");
    }

    public static void createData(ArrayList<Mahasiswa> v, String nama, String nim, String prodi, String fakultas)
    {
        v.add(new Mahasiswa(nama, nim, prodi, fakultas));

        System.out.println("Data mahasiswa berhasil ditambahkan!");
    }

    public static void readData(ArrayList<Mahasiswa> v)
    {
        int lNo = 2, lNama = 4, lNim = 3, lProdi = 13, lFakultas = 8;

        if (v.size() >= 100) lNo = (Integer.toString(lNo)).length();
        for (Mahasiswa m : v)
        {
            if (m.getNama().length() > lNama) lNama = m.getNama().length();
            if (m.getNim().length() > lNim) lNim = m.getNim().length();
            if (m.getProdi().length() > lProdi) lProdi = m.getProdi().length();
            if (m.getFakultas().length() > lFakultas) lFakultas = m.getFakultas().length();
        }

        if (v.size() == 0)
        {
            System.out.println("Data mahasiswa kosong.");
        }
        else
        {
            borderLine(lNo, lNama, lNim, lProdi, lFakultas);
            contentLine(lNo, lNama, lNim, lProdi, lFakultas, "No", "Nama", "NIM", "Program Studi", "Fakultas");
            borderLine(lNo, lNama, lNim, lProdi, lFakultas);
            for (int i = 0; i < v.size(); i++)
            {
                contentLine(lNo, lNama, lNim, lProdi, lFakultas, Integer.toString(i + 1), v.get(i).getNama(), v.get(i).getNim(), v.get(i).getProdi(), v.get(i).getFakultas());
            }
            borderLine(lNo, lNama, lNim, lProdi, lFakultas);
        }
    }

    public static void updateData(ArrayList<Mahasiswa> v, int i, String nama, String nim, String prodi, String fakultas)
    {
        v.get(i).setNama(nama);
        v.get(i).setNim(nim);
        v.get(i).setProdi(prodi);
        v.get(i).setFakultas(fakultas);

        System.out.println("Data mahasiswa berhasil diubah.");
    }

    public static void deleteData(ArrayList<Mahasiswa> v, int i)
    {
        v.remove(i);
        System.out.println("Data mahasiswa berhasil dihapus!");
    }
}
