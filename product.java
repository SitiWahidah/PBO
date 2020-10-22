public class Product {

    public String Bag;
    public String Jumlah;
    public String Harga;

    public Product(String Bag, String Jumlah, String Harga) {
        this.Bag = Bag;
        this.Jumlah = Jumlah;
        this.Harga = Harga;

    }
    public String getBag() {
        return Bag;
    }

    public void Bag(String Bag) {
        this.Bag = Bag;
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
                "Bag='" + Bag + '\'' +
                ",Jumlah='" + Jumlah + '\'' +
                ",Harga='" + Harga + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // write your code here
    }
}

