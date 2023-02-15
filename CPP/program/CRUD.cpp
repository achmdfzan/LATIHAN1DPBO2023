#include "Mahasiswa.cpp"

class CRUD
{
    private:

        static void borderLine(int a, int b, int c, int d, int e)
        {
            cout << "+-";
            for (int i = 0; i < a; i++) cout << "-";
            cout << "-+-";
            for (int i = 0; i < b; i++) cout << "-";
            cout << "-+-";
            for (int i = 0; i < c; i++) cout << "-";
            cout << "-+-";
            for (int i = 0; i < d; i++) cout << "-";
            cout << "-+-";
            for (int i = 0; i < e; i++) cout << "-";
            cout << "-+" << endl;
        }

        static void contentLine(int a, int b, int c, int d, int e, string p, string q, string r, string s, string t)
        {
            cout << "| " << p;
            for (int i = 0; i < (a - p.length()); i++) cout << " ";
            cout << " | " << q;
            for (int i = 0; i < (b - q.length()); i++) cout << " ";
            cout << " | " << r;
            for (int i = 0; i < (c - r.length()); i++) cout << " ";
            cout << " | " << s;
            for (int i = 0; i < (d - s.length()); i++) cout << " ";
            cout << " | " << t;
            for (int i = 0; i < (e - t.length()); i++) cout << " ";
            cout << " |" << endl;
        }

    public:

        static void createData(vector<Mahasiswa>& v)
        {
            system("cls");

            string nama = "", nim = "", prodi = "", fakultas = "";

            cout << "+-----------------------+" << endl;
            cout << "| Create Data Mahasiswa |" << endl;
            cout << "+-----------------------+" << endl << endl;

            cout << "Nama           : ";
            while(nama == "") getline(cin, nama);
            cout << "NIM            : ";
            while(nim == "") getline(cin, nim);
            cout << "Program Studi  : ";
            while(prodi == "") getline(cin, prodi);
            cout << "Fakultas       : ";
            while(fakultas == "") getline(cin, fakultas);

            Mahasiswa m(nama, nim, prodi, fakultas);

            v.push_back(m);

            cout << endl << "Data mahasiswa berhasil ditambahkan!";

            getchar();
        }

        static void readData(vector<Mahasiswa> v)
        {
            int lNo = 2, lNama = 4, lNim = 3, lProdi = 13, lFakultas = 8;

            if (v.size() >= 100) lNo = (to_string(v.size())).length();
            for (Mahasiswa m : v)
            {
                if (m.getNama().length() > lNama) lNama = m.getNama().length();
                if (m.getNim().length() > lNim) lNim = m.getNim().length();
                if (m.getProdi().length() > lProdi) lProdi = m.getProdi().length();
                if (m.getFakultas().length() > lFakultas) lFakultas = m.getFakultas().length();
            }

            if (v.size() == 0)
            {
                cout << "Data mahasiswa kosong." << endl;
            }
            else
            {
                borderLine(lNo, lNama, lNim, lProdi, lFakultas);
                contentLine(lNo, lNama, lNim, lProdi, lFakultas, "No", "Nama", "NIM", "Program Studi", "Fakultas");
                borderLine(lNo, lNama, lNim, lProdi, lFakultas);
                for (int i = 0; i < v.size(); i++)
                {
                    contentLine(lNo, lNama, lNim, lProdi, lFakultas, to_string(i + 1), v[i].getNama(), v[i].getNim(), v[i].getProdi(), v[i].getFakultas());
                }
                borderLine(lNo, lNama, lNim, lProdi, lFakultas);
            }

            cout << endl;
        }

        static void updateData(vector<Mahasiswa>& v)
        {
            cout << "Masukkan nomor mahasiswa yang ingin diubah : ";

            int target;
            cin >> target;

            system("cls");

            cout << "+-----------------------+" << endl;
            cout << "| Update Data Mahasiswa |" << endl;
            cout << "+-----------------------+" << endl << endl;

            if (target > 0 && target <= v.size())
            {
                cout << "Data mahasiswa yang akan diubah" << endl << endl;

                cout << "Nama           : " << v[target - 1].getNama() << endl;
                cout << "NIM            : " << v[target - 1].getNim() << endl;
                cout << "Program Studi  : " << v[target - 1].getProdi() << endl;
                cout << "Fakultas       : " << v[target - 1].getFakultas() << endl << endl;

                cout << "Masukkan data mahasiswa baru" << endl << endl;
                
                string nama = "", nim = "", prodi = "", fakultas = "";

                getchar();
                cout << "Nama           : ";
                getline(cin, nama); 
                cout << "NIM            : ";
                getline(cin, nim);
                cout << "Program Studi  : ";
                getline(cin, prodi);
                cout << "Fakultas       : ";
                getline(cin, fakultas);

                if (nama != "") v[target - 1].setNama(nama);
                if (nim != "") v[target - 1].setNim(nim);
                if (prodi != "") v[target - 1].setProdi(prodi);
                if (fakultas != "") v[target - 1].setFakultas(fakultas);

                cout << endl << "Data mahasiswa berhasil diubah!";
            }
            else
            {
                cout << endl << "ERROR: Nomor tidak valid." << endl << "Perintah dibatalkan.";
            }

            getchar();
            getchar();
        }

        static void deleteData(vector<Mahasiswa>& v)
        {
            cout << "Masukkan nomor mahasiswa yang ingin dihapus : ";

            int target;
            cin >> target;

            system("cls");

            cout << "+-----------------------+" << endl;
            cout << "| Delete Data Mahasiswa |" << endl;
            cout << "+-----------------------+" << endl << endl;

            if (target > 0 && target <= v.size())
            {
                cout << "Nama           : " << v[target - 1].getNama() << endl;
                cout << "NIM            : " << v[target - 1].getNim() << endl;
                cout << "Program Studi  : " << v[target - 1].getProdi() << endl;
                cout << "Fakultas       : " << v[target - 1].getFakultas() << endl;

                cout << endl << "Apakah anda yakin ingin mengahapus data mahasiswa tersebut (Y/N)? ";

                char confirm;
                cin >> confirm;

                if (confirm == 'Y')
                {
                    vector<Mahasiswa>::iterator it = v.begin();
                    for (int i = 0; i < target - 1; i++) it++;
                    v.erase(it);

                    cout << endl << "Data mahasiswa berhasil dihapus!";
                }
                else
                {
                    cout << endl << "Perintah dibatalkan.";
                }
            }
            else
            {
                cout << endl << "ERROR: Nomor tidak valid." << endl << "Perintah dibatalkan.";
            }

            getchar();
            getchar();
        }
};