<?php

class Mahasiswa
{
    private $nama = "";
    private $nim = "";
    private $prodi = "";
    private $fakultas = "";
    private $image = "";

    public function __construct($nama = "", $nim = "", $prodi = "", $fakultas = "", $image = "default.jpg")
    {
        $this->nama = $nama;
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->image = $image;
    }

    public function getNama()
    {
        return $this->nama;
    }

    public function setNama($nama)
    {
        $this->nama = $nama;
    }

    public function getNim()
    {
        return $this->nim;
    }

    public function setNim()
    {
        $this->nim = $nim;
    }

    public function getProdi()
    {
        return $this->prodi;
    }

    public function setProdi($prodi)
    {
        $this->prodi = $prodi;
    }

    public function getFakultas()
    {
        return $this->fakultas;
    }

    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }

    public function getImage()
    {
        return $this->image;
    }

    public function setImage($image)
    {
        $this->image = $image;
    }
}

?>