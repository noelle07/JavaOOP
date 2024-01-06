
public abstract class Menu {
	protected String namaPaket;
	protected int jumlah, harga;
	
	public Menu(String namaPaket, int jumlah) {
		super();
		this.namaPaket = namaPaket;
		this.jumlah = jumlah;
	}
	public String getNamaPaket() {
		return namaPaket;
	}
	public void setNamaPaket(String namaPaket) {
		this.namaPaket = namaPaket;
	}
	public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public abstract int hitungSubTotal();
	
}
