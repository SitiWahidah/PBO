public class categories {

    public String Barang;
    public String Jumlah;
    public String Harga;

    public categories(String Barang, String Jumlah, String Harga) {
        this.Barang = Barang;
        this.Jumlah = Jumlah;
        this.Harga = Harga;

    }
    public String getBarang() {
        return Barang;
    }

    public void Barang(String Barang) {
        this.Barang = Barang;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String Jumlah) {
        this.Jumlah = Jumlah;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Barang='" + Barang + '\'' +
                ",Jumlah='" + Jumlah + '\'' +
                ",Harga='" + Harga + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // write your code here
    }
}

