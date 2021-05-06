package classes;

import java.util.ArrayList;
public class Transaksi {
	private String notransaksi;
	private String namapemesan;
	private String tanggal;
	private String nomeja;
	private ArrayList<Pesanan> pesanan;
	private double uangbayar;
	private double pajak;
	private double totalbayar;
	
	public Transaksi (String no_transaksi, String nama_pemesan, String tanggal, String no_meja) {}
	public void tambahpesanan (Pesanan pesanan) {}
	public Pesanan getPesanan () {return null; }
	public ArrayList <Pesanan> getSemuaPesanan () { return null;}
	public double hitungTotalBayar () { return 0;}
	public double hitungKembalian () { return 0;}
	public void cetakstruk () {}

}
