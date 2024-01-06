import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	ArrayList<Menu> menus = new ArrayList<>();
	String noTransaksi;
	
	public Main() {
		int choice = 0;
		noTransaksi = randomNoTransaksi();
		do {
			System.out.println("HOKBEN");
			System.out.println("Tanggal: " + LocalDateTime.now());
			System.out.println("No. Transaksi: " + noTransaksi);
			System.out.println("+==================+================+================+================+");
			System.out.println("|Menu              | Harga         | Jumlah        | Subtotal         |");
			System.out.println("+==================+================+================+================+");
			for(Menu menu: menus) {
				System.out.printf("|%-18s|%-15s|%-15d|%-18d|\n", menu.getNamaPaket(), menu.getHarga(), menu.getJumlah(), menu.hitungSubTotal());
			}
			System.out.println("+==================+================+================+================+");
			System.out.println("Total: " + hitungTotalHarga());
			System.out.println("\n\n1. Add Item");
			System.out.println("2. Print Receipt");
			System.out.print("[1 - 3] >> ");
			choice = scan.nextInt(); scan.nextLine();
			if(choice == 1) {
				addItem();
			}else if(choice == 2) {
				printReceipt();
			}
		} while(choice!=3);
	}

public String randomNoTransaksi() {
	// 0 - 9999
	int res = rand.nextInt(100000);
	
	// res = 1
	// 00001
	
	//sprintf
	return String.format("HK%05d", res);
}

public int hitungTotalHarga() {
	int totalHarga = 0;
	for(Menu menu : menus) {
		totalHarga += menu.hitungSubTotal();
	}
	return totalHarga;
}

public void addItem() {
	int choice;
	do {
		System.out.println("HOKBEN Menu");
		System.out.println("1. Paket A Ekkado");
		System.out.println("2. Paket B Shrimp Roll");
		System.out.println("3. Paket C Beef Yakiniku");
		System.out.println("0. Back");
		System.out.println();
		choice = scan.nextInt(); scan.nextLine();
		
		if(choice >= 1 && choice <=3) {
			int jumlah;
			do {
				System.out.print("Jumlah: ");
				jumlah = scan.nextInt(); scan.nextLine();
			}while(jumlah <= 0);
			
			if(choice == 1) {
				menus.add(new PaketA("Paket A", jumlah));
			}else if(choice == 2) {
				menus.add(new PaketB("Paket B", jumlah));
			}else if(choice == 3) {
				menus.add(new PaketC("Paket C", jumlah));
			}
			return;
		}
	}while(choice != 0);
}

public void printReceipt() {
	while(menus.size() > 0 ) menus.remove(0);
	
	noTransaksi = randomNoTransaksi();
}

	public static void main(String[] args) {
		new Main();

	}

}
