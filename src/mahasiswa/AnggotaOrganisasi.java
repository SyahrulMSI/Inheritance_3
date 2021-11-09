package mahasiswa;

public class AnggotaOrganisasi extends Mahasiswa{

    // Deklarasi Variabel Kelas
    protected String kegiatan;
    
    // Method Setter
    public void SetKegiatan(String kegiatan){
        this.kegiatan = kegiatan;
    }
    
    // Method Getter
    public String GetKegiatan(){
        return kegiatan;
    }
    
    // Method Tampil Informasi
    @Override
    public void TampilInfo(){
        HitungIPK();
        
        System.out.println("Informasi Mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("IPK: " + ipk);
        System.out.println("Kegiatan: " + kegiatan);
    }
}
