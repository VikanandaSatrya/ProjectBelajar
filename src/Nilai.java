public class Nilai {
    private int jumlahBenar;
    int jumlahSoal;
    double nilaiAkhir;

    public Nilai() {
    }

    public Nilai(int jumlahBenar, int jumlahSoal) {
        this.jumlahBenar = jumlahBenar;
        this.jumlahSoal = jumlahSoal;
    }

    public int getJumlahBenar() {
        return jumlahBenar;
    }

    public void setJumlahBenar(int jumlahBenar) {
        this.jumlahBenar = jumlahBenar;
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }

    public void setJumlahSoal(int jumlahSoal) {
        this.jumlahSoal = jumlahSoal;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
}
