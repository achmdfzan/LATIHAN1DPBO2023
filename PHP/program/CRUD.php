<?php

require ("Mahasiswa.php");

class CRUD
{
    public static function createData(&$v, $nama, $nim, $prodi, $fakultas, $image)
    {
        $v[count($v)] = new Mahasiswa($nama, $nim, $prodi, $fakultas, $image);
    }

    public static function readData($v)
    {
        echo "<br>";
        foreach ($v as $m)
        {
            echo "<img src = 'images\\" . $m->getImage() . "' style = 'width:100px;height:100px;'>";
            echo " " . $m->getNama() . " - " . $m->getNim() . " - " . $m->getProdi() . " - " . $m->getFakultas() . "<br><br>";
        }
        echo "<hr>";
    }

    public static function updateData(&$v, $i, $nama, $nim, $prodi, $fakultas, $image)
    {
        $v[$i] = new Mahasiswa($nama, $nim, $prodi, $fakultas, $image);
    }

    public static function deleteData(&$v, $i)
    {
        for ($x = $i; $x < count($v) - 1; $x++)
        {
            $v[$x] = $v[$x + 1];
        }
        array_pop($v);
    }
}

?>