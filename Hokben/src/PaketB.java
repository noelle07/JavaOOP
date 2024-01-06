
public class PaketB extends Menu{
	
	public PaketB(String namaPaket, int jumlah) {
		super(namaPaket, jumlah);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hitungSubTotal() {
		return getHarga() * getJumlah();
	}
}
