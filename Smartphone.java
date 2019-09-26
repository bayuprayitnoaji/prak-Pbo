public class Smartphone {
	String merk;
	String warna;
	String type;
	double harga;

	void beriMerk (String merkSmartphone) {
		merk = merkSmartphone;
	}
	
	void beriWarna (String warnaSmartphone) {
		warna = warnaSmartphone;
	}

	void beriType (String typeSmartphone) {
		type = typeSmartphone;
	}

	void hargaJual(double hargaSmartphone) {
		harga = hargaSmartphone;
	}

	void infoSmartphone() {
	System.out.println(
		"Merk Smartphone : " + merk + "\n"+
		"Warna Smartphone : " + warna +"\n"+
		"Type Smartphone : " + type + "\n"+
		"Harga Smartphone:Rp. " + harga) ;
    }
}