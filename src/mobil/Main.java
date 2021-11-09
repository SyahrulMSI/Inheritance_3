package mobil;

/**
 * 201951071 | FIRMAN ADI NUR FATIN
 * @author SILVERWOLF
 */

public class Main {
    public static void main(String args[]){        
        Dealer dealer = new Dealer();
        
        dealer.SetPembeli("Pak Eri");
        dealer.dagangan.SetMerk("Toyota");
        dealer.dagangan.SetTipe("New Avanza MPV");
        dealer.dagangan.SetWarna("Putih");
        dealer.dagangan.SetTransmisi("Manual 5 Kecepatan");
        dealer.dagangan.SetWP("Desember 2019");
        dealer.dagangan.SetTipeHarga("Veloz");
        
        dealer.TampilInfo();
    }
}
