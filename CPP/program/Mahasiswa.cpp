#include <bits/stdc++.h>

using namespace std;

class Mahasiswa
{
    private:
    
        string nama;
        string nim;
        string prodi;
        string fakultas;

    public:

        Mahasiswa(){}

        Mahasiswa(string str1, string str2, string str3, string str4)
        {
            nama = str1;
            nim = str2;
            prodi = str3;
            fakultas = str4;
        }

        ~Mahasiswa(){}

        string getNama()
        {
            return nama;
        }

        void setNama(string str)
        {
            nama = str;
        }

        string getNim()
        {
            return nim;
        }

        void setNim(string str)
        {
            nim = str;
        }

        string getProdi()
        {
            return prodi;
        }

        void setProdi(string str)
        {
            prodi = str;
        }

        string getFakultas()
        {
            return fakultas;
        }

        void setFakultas(string str)
        {
            fakultas = str;
        }
};