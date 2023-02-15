<?php

/*
    Saya Achmad Fauzan NIM 2108061 mengerjakan soal Latihan Praktikum 1 dalam mata
    kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

require ("CRUD.php");

// deklarasi array mahasiswa
$mhs = array(
    new Mahasiswa("Achmad Fauzan", "2108061", "Ilmu Komputer", "FPMIPA", "luffy.png"),
    new Mahasiswa("Muhammad Cahyana Bintang Fajar", "2102665", "Pendidikan Ilmu Komedi", "FPAOWKWK", "usopp.png"),
    new Mahasiswa("Muhammad Nur Yasin Amadudin", "2100137", "Teknik Kompor", "FPTK", "zoro.png")
);

// tampilkan data mahasiswa awal
echo "<h3>Data awal<h3><br>";
CRUD::readData($mhs);

// tambahkan mahasiswa baru ke dalam list
CRUD::createData($mhs, "Anandita Kusumah Mulyadi", "2101114", "Manajemen Bisnis", "FPEB", "nami.png");

// tampilkan data mahasiswa setelah create
echo "<h3>Data setelah create<h3><br>";
CRUD::readData($mhs);

// update salah satu data mahasiswa di dalam list
CRUD::updateData($mhs, 1, "Bintang Ajah", "2102665", "Pendidikan Ilmu Komedi", "FPAOWK", "usopp.png");

// tampilkan data mahasiswa setelah update
echo "<h3>Data setelah update<h3><br>";
CRUD::readData($mhs);

// hapus salah satu data mahasiswa dari list
CRUD::deleteData($mhs, 2);

// tampilkan data mahasiswa setelah delete
echo "<h3>Data setelah delete<h3><br>";
CRUD::readData($mhs);

?>