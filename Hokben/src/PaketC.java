
public class PaketC extends Menu{

	public PaketC(String namaPaket, int jumlah) {
		super(namaPaket, jumlah);
		setHarga(49000);
	}
	@Override
	public int hitungSubTotal() {
		return getHarga() * getJumlah();
	}
}
