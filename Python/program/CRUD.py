from Mahasiswa import Mahasiswa
from os import system

class CRUD:

    def __borderLine(self, a, b, c, d, e):
        print("+-", end = "")
        for i in range(a): print("-", end = "")
        print("-+-", end = "")
        for i in range(b): print("-", end = "")
        print("-+-", end = "")
        for i in range(c): print("-", end = "")
        print("-+-", end = "")
        for i in range(d): print("-", end = "")
        print("-+-", end = "")
        for i in range(e): print("-", end = "")
        print("-+")
    
    def __contentLine(self, a, b, c, d, e, p, q, r, s, t):
        print("| " + p, end = "")
        for i in range(a - len(p)): print(" ", end = "")
        print(" | " + q, end = "")
        for i in range(b - len(q)): print(" ", end = "")
        print(" | " + r, end = "")
        for i in range(c - len(r)): print(" ", end = "")
        print(" | " + s, end = "")
        for i in range(d - len(s)): print(" ", end = "")
        print(" | " + t, end = "")
        for i in range(e - len(t)): print(" ", end = "")
        print(" |")

    def createData(v: list):
        system("cls")

        print("+-----------------------+")
        print("| Create Data Mahasiswa |")
        print("+-----------------------+")

        nama =      input("Nama             : ")
        nim =       input("NIM              : ")
        prodi =     input("Program Studi    : ")
        fakultas =  input("Fakultas         : ")

        v.append(Mahasiswa(nama, nim, prodi, fakultas))

        input("Data mahasiswa berhasil ditambahkan!")
    
    def readData(self, v: list):
        lNo = 2
        lNama = 4
        lNim = 3
        lProdi = 13
        lFakultas = 8

        for m in v:
            if len(m.getNama()) > lNama: lNama = len(m.getNama())
            if len(m.getNim()) > lNim: lNim = len(m.getNim())
            if len(m.getProdi()) > lProdi: lProdi = len(m.getProdi())
            if len(m.getFakultas()) > lFakultas: lFakultas = len(m.getFakultas())
        
        if len(v) == 0:
            print("Data mahasiswa kosong.")
        else:
            self.__borderLine(lNo, lNama, lNim, lProdi, lFakultas)
            self.__contentLine(lNo, lNama, lNim, lProdi, lFakultas, "No", "Nama", "NIM", "Program Studi", "Fakultas")
            self.__borderLine(lNo, lNama, lNim, lProdi, lFakultas)
            for i in range(len(v)):
                self.__contentLine(lNo, lNama, lNim, lProdi, lFakultas, str(i + 1), v[i].getNama(), v[i].getNim(), v[i].getProdi(), v[i].getFakultas())
            self.__borderLine(lNo, lNama, lNim, lProdi, lFakultas)
    
    def updateData(v: list):
        target = int(input("Masukkan nomor mahasiswa yang ingin diubah : "))

        system("cls")

        print("+-----------------------+")
        print("| Update Data Mahasiswa |")
        print("+-----------------------+")

        if target > 0 and target <= len(v):
            print("Nama             : " + v[target - 1].getNama())
            print("NIM              : " + v[target - 1].getNim())
            print("Program Studi    : " + v[target - 1].getProdi())
            print("Fakultas         : " + v[target - 1].getFakultas())

            print("Masukkan data mahasiswa baru!")

            nama =      input("Nama             : ")
            nim =       input("NIM              : ")
            prodi =     input("Program Studi    : ")
            fakultas =  input("Fakultas         : ")

            v[target - 1].setNama(nama)
            v[target - 1].setNim(nim)
            v[target - 1].setProdi(prodi)
            v[target - 1].setFakultas(fakultas)
            
            input("Data mahasiswa berhasil diubah!")
        else:
            print("ERROR: Nomor tidak valid.")
            print("Perintah dibatalkan")

    def deleteData(v: list):
        target = int(input("Masukkan nomor mahasiswa yang ingin dihapus : "))

        system("cls")

        print("+-----------------------+")
        print("| Delete Data Mahasiswa |")
        print("+-----------------------+")

        if target > 0 and target <= len(v):
            print("Nama             : " + v[target - 1].getNama())
            print("NIM              : " + v[target - 1].getNim())
            print("Program Studi    : " + v[target - 1].getProdi())
            print("Fakultas         : " + v[target - 1].getFakultas())

            confirm = input("Apakah anda yakin ingin menghapus data mahasiswa tersebut (Y/N)? ")

            if confirm == 'Y':
                v.remove(v[target - 1])
                print("Data mahasiswa berhasil dihapus!")
            else:
                print("Perintah dibatalkan.")
        else:
            print("ERROR: Nomor tidak valid.")
            print("Perintah dibatalkan")
        
        input()