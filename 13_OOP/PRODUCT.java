public class PRODUCT {
    private String nama;
    private String deskripsi;
    private int harga;
    private int stok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return this.stok;
    }

    public void getInfo() {
        System.out.println("===========" );
        System.out.println("INFO PRODUK" );
        System.out.println("Nama: " + this.nama);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Harga: " + this.harga);
        System.out.println("Stok: " + this.stok);
    }
}
