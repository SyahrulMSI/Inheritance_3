package mobil;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Dealer {
    
    // Inisialisasi Variabel Kelas
    private final double[] dh = {168,197.525,215.5};
    private final String[] dt = {"E","G","Veloz"};
    private final String jt = " juta rupiah";
    private double cashback, harga;
    private String pembeli;    
    
    // Inisialisasi Objek
    public Mobil dagangan = new Mobil();
    
    // Method untuk Menentukan Harga Mobil
    private void CekHarga(){
        
        // Menentukan Harga berdasarkan Tipe
        if(dagangan.GetTipeHarga().equals(dt[0])){
            dagangan.SetHarga(dh[0]);
        }
        else if(dagangan.GetTipeHarga().equals(dt[1])){
            dagangan.SetHarga(dh[1]);
        }
        else if(dagangan.GetTipeHarga().equals(dt[2])){
            dagangan.SetHarga(dh[2]);
        }
        
        // Menyimpan Harga sebelum Cashback
        this.harga = dagangan.GetHarga();
        
        // Menentukan Cashback berdasarkan Waktu
        if(dagangan.GetWP().equals("Desember 2019")){
            cashback = dagangan.GetHarga() * 0.15;
            dagangan.SetHarga(dagangan.GetHarga() - cashback);
        }         
    }
    
    // Method Setter
    public void SetPembeli(String pembeli){
        this.pembeli = pembeli;
    }
    
    // Method Getter
    public String GetPembeli(){
        return pembeli;
    }
    
    // Method untuk Menampilkan Informasi
    public void TampilInfo(){
        
        // Harga diproses terlebih dahulu
        CekHarga();
        
        // Menggunakan variabel bertipe String untuk menampilkan
        // variabel cashback dan harga agar tampilannya rapi
        String cshbck = String.format("%.2f", cashback);
        String hrgfnl = String.format("%.2f", dagangan.GetHarga());
        
        // Kumpulan perintah untuk menampilkan informasi
        System.out.println("Informasi Mobil " + pembeli);
        System.out.println(dagangan.GetMerk() + dagangan.GetTipe());
        System.out.println("Transmisi " + dagangan.GetTransmisi());
        System.out.println("Warna: " + dagangan.GetWarna());
        System.out.println("Waktu Pembelian: " + dagangan.GetWP());
        System.out.println("Harga Asli: " + harga + jt);
        System.out.println("Cashback: " + cshbck + jt);
        System.out.println("Final Bill: " + hrgfnl + jt);
    }
    
}
