
public class PaketA extends Menu{

	public PaketA(String namaPaket, int jumlah) {
		super(namaPaket, jumlah);
		setHarga(20000);
	}
	
	@Override
	public int hitungSubTotal() {
		return getHarga() * getJumlah();
	}
	
}
