/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan59.detectiveconan;

/*
Nama : Cessario Sheva L.P.A
Nim  : 10117063
Kelas: IF-2
Deskripsi Program : Menampilkan teman2 Conan
 */
public class pemUtama extends DetConan{
    protected String status;

    public pemUtama(String status, String nama, String peran, String keluarga, String penampilanPertama) {
        super(nama, peran, keluarga, penampilanPertama);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

    public String getKeluarga() {
        return keluarga;
    }

    public String getPenampilanPertama() {
        return penampilanPertama;
    }

    }


    
    
    

