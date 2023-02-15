/*
    Saya Achmad Fauzan NIM 2108061 mengerjakan soal Latihan Praktikum 1 dalam mata
    kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// include class CRUD dan otomatis include class Mahasiswa
#include "CRUD.cpp"

int main()
{
    // deklarasi vector untuk objek mahasiswa
    vector<Mahasiswa> mhs;

    do
    {
        // bersihkan console
        system("cls");

        cout << "+-----------------+" << endl;
        cout << "| S I A K   U B I |" << endl;
        cout << "+-----------------+" << endl << endl;

        // tampilkan semua data mahasiswa yang tersedia
        CRUD::readData(mhs);

        cout << "+---------------------------+" << endl;
        cout << "| 'C' Create Data Mahasiswa |" << endl;
        cout << "| 'U' Update Data Mahasiswa |" << endl;
        cout << "| 'D' Delete Data Mahasiswa |" << endl;
        cout << "+---------------------------+" << endl << endl;

        cout << "Masukkan perintah yang ingin dijalankan : ";

        // scan perintah untuk operasi selanjutnya
        char menu;
        cin >> menu;
        getchar();

        switch (menu)
        {
            // jika perintah merupakan create
            case 'C':
                // panggil method untuk menambah data
                CRUD::createData(mhs);
            break;

            // jika perintah merupakan update
            case 'U':
                // panggil method untuk mengubah data
                CRUD::updateData(mhs);
            break;

            // jika perintah merupakan delete
            case 'D':
                // panggil method untuk mengubah data
                CRUD::deleteData(mhs);
            break;

            // jika perintah merupakan char lain maka loop akan langsung diulang
        }
    }
    while (true);
}