<?php

require ("CRUD.php");

$mhs = array(
    new Mahasiswa("Achmad Fauzan", "2108061", "Ilmu Komputer", "FPMIPA", "luffy.png"),
    new Mahasiswa("Muhammad Cahyana Bintang Fajar", "2102665", "Pendidikan Ilmu Komedi", "FPAOWKWK", "usopp.png"),
    new Mahasiswa("Muhammad Nur Yasin Amadudin", "2100137", "Teknik Kompor", "FPTK", "zoro.png")
);

echo "<h3>Data awal<h3><br>";
CRUD::readData($mhs);

CRUD::createData($mhs, "Anandita Kusumah Mulyadi", "2101114", "Manajemen Bisnis", "FPEB", "nami.png");

echo "<h3>Data setelah create<h3><br>";
CRUD::readData($mhs);

CRUD::updateData($mhs, 1, "Bintang Ajah", "2102665", "Pendidikan Ilmu Komedi", "FPAOWK", "usopp.png");

echo "<h3>Data setelah update<h3><br>";
CRUD::readData($mhs);

CRUD::deleteData($mhs, 2);

echo "<h3>Data setelah delete<h3><br>";
CRUD::readData($mhs);

?>