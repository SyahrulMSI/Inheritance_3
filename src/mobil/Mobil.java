package mobil;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Mobil {
    
    // Deklarasi Variabel Kelas
    private String tipe, merk, warna, transmisi, tipeHarga, waktuBeli;
    private double harga;
    
    
    // Kumpulan Method Setter
    public void SetTipe(String tipe){
        this.tipe = tipe;
    }
    
    public void SetMerk(String merk){
        this.merk = merk;
    }
    
    public void SetWarna(String warna){
        this.warna = warna;
    }
    
    public void SetTransmisi(String transmisi){
        this.transmisi = transmisi;
    }
    
    public void SetHarga(double harga){
        this.harga = harga;
    }
    
    public void SetTipeHarga(String tipeHarga){
        this.tipeHarga = tipeHarga;
    }
    
    public void SetWP(String waktuBeli){
        this.waktuBeli = waktuBeli;
    }
    
    // Kumpulan Method Getter
    public String GetTipe(){
        return tipe;
    }
    
    public String GetMerk(){
        return merk;
    }
    
    public String GetWarna(){
        return warna;
    }
    
    public String GetTransmisi(){
        return transmisi;
    }
    
    public double GetHarga(){
        return harga;
    }
    
    public String GetTipeHarga(){
        return tipeHarga;
    }
    
    public String GetWP(){
        return waktuBeli;
    }
}
