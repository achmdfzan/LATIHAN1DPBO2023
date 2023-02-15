
#   Saya Achmad Fauzan NIM 2108061 mengerjakan soal Latihan Praktikum 1 dalam mata
#   kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya
#   tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from Mahasiswa import Mahasiswa
from CRUD import CRUD
from os import system

# list mahasiswa
mhs = []
# objek CRUD
c = CRUD()

while True:
    system("cls")

    print("+-----------------+")
    print("| S I A K   U B I |")
    print("+-----------------+")

    # tampilkan data mahasiswa yang tersedia
    c.readData(mhs)

    print("+---------------------------+")
    print("| 'C' Create Data Mahasiswa |")
    print("| 'U' Update Data Mahasiswa |")
    print("| 'D' Delete Data Mahasiswa |")
    print("+---------------------------+")

    # scan perintah untuk operasi selanjutnya
    menu = input("Masukkan perintah yang ingin dijalankan : ")

    # jika perintah merupakan create
    if menu == 'C':
        # panggil method untuk menambah data
        CRUD.createData(mhs)
    # jika perintah merupakan update
    elif menu == 'U':
        # panggil method untuk mengubah data
        CRUD.updateData(mhs)
    #jika perintah merupakan delete
    elif menu == 'D':
        # panggil method untuk menghapus data
        CRUD.deleteData(mhs)