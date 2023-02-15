public class Mahasiswa
{
    private String nama;
    private String nim;
    private String prodi;
    private String fakultas;

    public Mahasiswa()
    {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    public Mahasiswa(String str1, String str2, String str3, String str4)
    {
        this.nama = str1;
        this.nim = str2;
        this.prodi = str3;
        this.fakultas = str4;
    }

    public String getNama()
    {
        return this.nama;
    }

    public void setNama(String str)
    {
        this.nama = str;
    }

    public String getNim()
    {
        return this.nim;
    }

    public void setNim(String str)
    {
        this.nim = str;
    }

    public String getProdi()
    {
        return this.prodi;
    }

    public void setProdi(String str)
    {
        this.prodi = str;
    }

    public String getFakultas()
    {
        return this.fakultas;
    }

    public void setFakultas(String str)
    {
        this.fakultas = str;
    }
}