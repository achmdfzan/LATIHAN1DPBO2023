#include "CRUD.cpp"

int main()
{
    vector<Mahasiswa> mhs;

    do
    {
        system("cls");

        cout << "+-----------------+" << endl;
        cout << "| S I A K   U B I |" << endl;
        cout << "+-----------------+" << endl << endl;

        CRUD::readData(mhs);

        cout << "+---------------------------+" << endl;
        cout << "| 'C' Create Data Mahasiswa |" << endl;
        cout << "| 'U' Update Data Mahasiswa |" << endl;
        cout << "| 'D' Delete Data Mahasiswa |" << endl;
        cout << "+---------------------------+" << endl << endl;

        cout << "Masukkan perintah yang ingin dijalankan : ";

        char menu;
        cin >> menu;
        getchar();

        switch (menu)
        {
            case 'C':
                CRUD::createData(mhs);
            break;
            
            case 'U':
                CRUD::updateData(mhs);
            break;

            case 'D':
                CRUD::deleteData(mhs);
            break;
        }
    }
    while (true);
}