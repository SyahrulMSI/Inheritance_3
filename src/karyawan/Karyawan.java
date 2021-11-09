package karyawan;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Karyawan {
    
    // Deklarasi dan Inisialisasi Variabel
    protected String nama;
    private final double gaji = 2100000;
    private double
        tunjKinerja = 950000, 
        tunjAnak = 550000, 
        totalGaji;
    private int jmlAnak;
    private boolean rajin;
    
    // Deklarasi dan Inisialisasi Objek Terasosiasi
    public class AnakKaryawan{
        private String namaAnak;

        public AnakKaryawan(){
            jmlAnak += 1;
        }
        // Kumpulan Method Setter
        public void setNama(String namaAnak){
            this.namaAnak = namaAnak;
        }
        
        // Kumpulan Method Getter
        public String getNama(){
            return namaAnak;
        }
        
        // Method Menampilkan Informasi Anak
        public void tampilInfo(){
            System.out.println("Nama anak " + nama + ": " + namaAnak);
        }
    }
    
    public AnakKaryawan anak = new AnakKaryawan();
    
    // Kumpulan Method Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setRajin(boolean rajin){
        this.rajin = rajin;
    }

    
    // Kumpulan Method Getter
    public String getNama(){
        return nama;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public double getTunjKinerja(){
        return tunjKinerja;
    }
    
    public double getTunjAnak(){
        return tunjAnak;
    }
    
    public double getTotalGaji(){
        return totalGaji;
    }
    
    public int getJmlAnak(){
        return jmlAnak;
    }
    
    public boolean getRajin(){
        return rajin;
    }    
    
    // Method Perhitungan Total Gaji
    public void hitungTotalGaji(){
        
        // Seleksi Kondisi Kinerja
        if(rajin == false){
            tunjKinerja *= 0;
        }
        else if(rajin == true){
            tunjKinerja *= 1;
        }
        
        // Seleksi Kondisi Jumlah Anak
        if(jmlAnak >= 1){
            tunjAnak *= 1;
        }
        else if (jmlAnak == 0){
            tunjAnak *= 0;
        }
        
        totalGaji = tunjAnak + tunjKinerja;
    }
    
    // Method Menampilkan Data
    public void tampilData(){
        System.out.println("Nama          : " + nama);
        System.out.println("Jumlah Anak   : " + jmlAnak);
        System.out.println("Gaji Pokok    : " + gaji);
        System.out.println("Tunj. Anak    : " + tunjAnak);
        System.out.println("Tunj. Kinerja : " + tunjKinerja);
        System.out.println("Total Gaji    : " + totalGaji);
    }
}
