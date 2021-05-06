package classes;

import java.util.ArrayList;

public class DaftarMenu {
	private ArrayList<Menu> DaftarMenu;
	public DaftarMenu () {
		DaftarMenu = new ArrayList <>();
	}
	
	public void tambahMenu (Menu menu) {
		DaftarMenu.add(menu);
	}
	
	public void getMenuByKategori (String kategori) {
		System.out.println("========" +kategori+ "========");
		for (int i = 0; i< DaftarMenu.size (); i++) {
			Menu m = DaftarMenu.get(i);
			if (m.getKategori().equals(kategori)) {
				System.out.println((i +1) + "." + m.getNama_Menu () + "\t" + m.getHarga());
			}
		}
	}
	
	public void tampilDaftarMenu () {
		System.out.println("======== ALDEBARAMEN ========");
		getMenuByKategori ("Ramen");
		getMenuByKategori ("Kuah");
		getMenuByKategori ("Toping");
		getMenuByKategori ("Minuman");
	}

}
