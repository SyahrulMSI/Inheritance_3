package mahasiswa;

public class Main {
    public static void main(String args[]){
        Mahasiswa Budi = new Mahasiswa();
        AsistenDosen Adi = new AsistenDosen();
        AnggotaOrganisasi Heni = new AnggotaOrganisasi();
        
        Budi.SetNama("Budi");
        Budi.SetProdi("Teknik Informatika");
        Budi.AddIPS1(3.67f);
        Budi.AddIPS2(3.25f);
        Budi.TampilInfo();
        
        Adi.SetNama("Adi");
        Adi.SetProdi("Akuntansi");
        Adi.AddIPS1(3.45f);
        Adi.AddIPS2(3.65f);
        Adi.SetLokasi("Lab. Prodi Akuntansi");
        Adi.TampilInfo();
        
        Heni.SetNama("Heni");
        Heni.SetProdi("Pend. Bahasa Inggris");
        Heni.AddIPS1(3.34f);
        Heni.AddIPS2(3.58f);
        Heni.SetKegiatan("Paduan Suara");
        Heni.TampilInfo();
    }
}
