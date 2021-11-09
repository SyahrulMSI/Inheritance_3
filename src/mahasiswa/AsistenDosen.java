package mahasiswa;

public class AsistenDosen extends Mahasiswa{
    
    // Deklarasi Variabel Kelas
    protected String lokasi;
    
    // Method Setter
    public void SetLokasi(String lokasi){
        this.lokasi = lokasi;
    }
    
    // Method Getter
    public String GetLokasi(){
        return lokasi;
    }
    
    // Method Tampil Informasi
    @Override
    public void TampilInfo(){
        super.TampilInfo();
        System.out.println("Lokasi: " + lokasi);
    }
}
