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
public class PBO210117063Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pemUtama nPemeranUtama = new pemUtama("Pemeran Utama", 
                "Kogoro Mouri",
                "seorang detektif swasta yang sangat terkenal karena sering memecahkan kasus dan ahli dalam judo.", 
                "Kerabat Ran Mouri(Anak) dan Eri Kisaki(Mantan istri)",
                "Roller Coaster Murder Case");
        System.out.println("Nama pemeran    : " + nPemeranUtama.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama.getStatus());
        System.out.println("Peran           : " + nPemeranUtama.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama2 = new pemUtama("Pemeran Utama", 
                "Ran Mouri",
                "Ran Mouri adalah teman Shinichi Kudo sejak kecil, ahli dalam karate", 
                "Kerabat Kogoro Mouri (ayah) Eri Kisaki (ibu)",
                "Anime Episode 1, Manga File 1");
        System.out.println("Nama pemeran    : " + nPemeranUtama2.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama2.getStatus());
        System.out.println("Peran           : " + nPemeranUtama2.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama2.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama2.getPenampilanPertama());
        System.out.println("===========================================================");
        
        pemUtama nPemeranUtama3 = new pemUtama("Pemeran Utama", 
                "Shinichi Kudo",
                "tokoh protagonis utama dari serial Detektif Conan. Dia kemudian bernama samaran Conan Edogawa.", 
                "Yusaku Kudo (ayah) Yukiko Kudo (ibu)",
                "Manga Detektif Conan File 1, Anime Detektif Conan Episode 1");
        System.out.println("Nama pemeran    : " + nPemeranUtama3.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama3.getStatus());
        System.out.println("Peran           : " + nPemeranUtama3.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama3.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama3.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama4 = new pemUtama("Pemeran Pendukung", 
                "Eri Kisaki ",
                "seorang pengacara, dikenal sebagai \"Ratu Pengacara\".", 
                "ibu Ran Mouri sekaligus istri Kogoro Mouri.",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama4.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama4.getStatus());
        System.out.println("Peran           : " + nPemeranUtama4.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama4.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama4.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama5 = new pemUtama("Pemeran Pendukung", 
                "Sonoko Suzuki",
                "Dia adalah remaja perempuan biasa yang centil dan suka mencari perhatian remaja laki- laki yang menarik.", 
                "Sonoko berasal dari keluarga kaya dengan status sosial yang tinggi",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama5.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama5.getStatus());
        System.out.println("Peran           : " + nPemeranUtama5.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama5.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama5.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama6 = new pemUtama("Pemeran Pendukung", 
                "Hiroshi Agasa",
                "seorang profesor linglung yang menemukan beberapa perangkat untuk membantu Conan. Dia mengetahui identitas asli Conan Edogawa. ", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama6.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama6.getStatus());
        System.out.println("Peran           : " + nPemeranUtama6.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama6.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama6.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama7 = new pemUtama("Pemeran Pendukung", 
                "Heiji Hattori",
                "rival Shinichi Kudo yang berasal dari Osaka dan juga seorang petarung kendo. Dia selanjutnya menjadi teman dengan Conan Edogawa setelah dia menemukan identitas asli Conan.", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama7.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama7.getStatus());
        System.out.println("Peran           : " + nPemeranUtama7.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama7.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama7.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama8 = new pemUtama("Pemeran Pendukung", 
                "Kazuha Toyama",
                "seorang putri seorang komisaris yang diposisikan tinggi di kepolisian Osaka.", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama8.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama8.getStatus());
        System.out.println("Peran           : " + nPemeranUtama8.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama8.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama8.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama9 = new pemUtama("Pemeran Pendukung", 
                "Ai Haibara",
                "seorang anggota Organisasi Berbaju Hitam yang berkhianat pada organisasi tersebut setelah kakaknya, Akemi Miyano, terbunuh di tangan Gin.", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama9.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama9.getStatus());
        System.out.println("Peran           : " + nPemeranUtama9.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama9.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama9.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama10 = new pemUtama("Pemeran Pendukung", 
                "Kogoro Mouri",
                "teman Conan sekaligus anggota Grup Detektif Cilik. Dia berwatak baik hati, mudah tersenyum dan sering menggunakan kata yang membuat suasana tenang.", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama10.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama10.getStatus());
        System.out.println("Peran           : " + nPemeranUtama10.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama10.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama10.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama11 = new pemUtama("Pemeran Pendukung", 
                "Genta Kojima",
                "pendiri Grup Detektif Cilik. Badannya sangat gemuk, besar, dan jago makan. Tipikal sosok penindas pada awalnya dan berbalik 180 derajat kemudian. Ia sangat suka makan, terutama nasi belut bakar. ", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama11.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama11.getStatus());
        System.out.println("Peran           : " + nPemeranUtama11.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama11.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama11.getPenampilanPertama());
        System.out.println("=========================================================");
        
        pemUtama nPemeranUtama12 = new pemUtama("Pemeran Pendukung", 
                "Mitsuhiko Tsuburaya",
                "seorang anggota Grup Detektif Cilik. Dia adalah teman Conan Edogawa yang pintar dan juga penyuka teknologi. Dia memiliki kejeniusan tersendiri. Pengetahuannya melebihi anak seusianya.", 
                "-",
                "-");
        System.out.println("Nama pemeran    : " + nPemeranUtama12.getNama());
        System.out.println("Status pemain   : " + nPemeranUtama12.getStatus());
        System.out.println("Peran           : " + nPemeranUtama12.getPeran());
        System.out.println("Keluarga        : " + nPemeranUtama12.getKeluarga());
        System.out.println("Tampil pertama  : " + nPemeranUtama12.getPenampilanPertama());
        System.out.println("");
    }
    }
    

