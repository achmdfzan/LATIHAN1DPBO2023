from Mahasiswa import Mahasiswa
from CRUD import CRUD
from os import system

mhs = []
c = CRUD()

while True:
    system("cls")

    print("+-----------------+")
    print("| S I A K   U B I |")
    print("+-----------------+")

    c.readData(mhs)

    print("+---------------------------+")
    print("| 'C' Create Data Mahasiswa |")
    print("| 'U' Update Data Mahasiswa |")
    print("| 'D' Delete Data Mahasiswa |")
    print("+---------------------------+")

    menu = input("Masukkan perintah yang ingin dijalankan : ")

    if menu == 'C':
        CRUD.createData(mhs)
    elif menu == 'U':
        CRUD.updateData(mhs)
    elif menu == 'D':
        CRUD.deleteData(mhs)