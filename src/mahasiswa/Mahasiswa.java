package mahasiswa;

public class Mahasiswa {
    
    // Deklarasi Variabel Kelas
    protected float ips[] = {0,0};
    protected float ipk;
    protected String nama, prodi;
    
    
    // Method Setter
    public void AddIPS1(float ips){
        this.ips[0] = ips;
    }
    
    public void AddIPS2(float ips){
        this.ips[1] = ips;
    }
    
    public void SetNama(String nama){
        this.nama = nama;
    }
    
    public void SetProdi(String prodi){
        this.prodi = prodi;
    }
    
    // Method Getter
    public float[] GetIPS(){
        return ips;
    }
    
    public float GetIPK(){
        return ipk;
    }
    
    public String GetNama(){
        return nama;
    }
    
    public String GetProdi(){
        return prodi;
    }
    
    // Method Hitung IPK
    protected void HitungIPK(){
        ipk += ips[0];
        ipk += ips[1];
        
        ipk /= ips.length;
    }
    
    // Method Tampil Informasi
    protected void TampilInfo(){
        HitungIPK();
        
        System.out.println("Informasi Mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("IPK: " + ipk);
    }
}
