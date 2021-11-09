package karyawan;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Main {
    public static void main(String args[]){
        Karyawan PakAmin = new Karyawan();
        
        PakAmin.setNama("Pak Amin");
        PakAmin.setRajin(true);
        PakAmin.anak.setNama("Amelia Shara Sinta");
        
        PakAmin.hitungTotalGaji();
        
        PakAmin.tampilData();
        PakAmin.anak.tampilInfo();
    }
}
