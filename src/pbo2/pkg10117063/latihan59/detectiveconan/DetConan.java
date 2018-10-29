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
public class DetConan {
    protected String nama;
    protected String peran;
    protected String keluarga;
    protected String penampilanPertama;

    public DetConan(String nama, String peran, String keluarga, String penampilanPertama) {
        this.nama = nama;
        this.peran = peran;
        this.keluarga = keluarga;
        this.penampilanPertama = penampilanPertama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public String getKeluarga() {
        return keluarga;
    }

    public void setKeluarga(String keluarga) {
        this.keluarga = keluarga;
    }

    public String getPenampilanPertama() {
        return penampilanPertama;
    }

    public void setPenampilanPertama(String penampilanPertama) {
        this.penampilanPertama = penampilanPertama;
    }
    

    
}
