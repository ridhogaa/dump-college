/**
 * Node SDA
 * 
 * Kelas ini digunakan untuk mempermudah kegiatan praktikum mata kuliah 
 * Struktur Data dan Algoritma di Program Studi Teknik Informatika, 
 * Fakultas Teknologi Informasi, Universitas YARSI.
 * 
 * Kelas ini berperan sebagai sebuah Node untuk dalam sebuah Tree 
 * Node akan menyimpan alamat Parent dan Childs yang bisa berjumlah 
 * berapapun. Setelah dideklarasikan, data yang tersimpan tidak dapat diubah.
 */
 


/*
 * Diperlukan untuk standarisasi seluruh kelas Praktikum Helper.
 */
 
/*
 * Diperlukan sebagai struktur data untuk Node dalam sebuah Tree.  
 */
import java.util.LinkedList;

/**
 * @author  Andreas Febrian
 * @version 1.01
 * 
 * version 1.00: 
 * - Mengimplementasikan sebuah Node untuk Tree.
 * version 1.01:
 * - Menambahkan mekanisme untuk add parent ketika Node menambahkan child.
 */
public class TreeNodeSDA<E>{
	
	/**
	 * Data yang disimpan di dalam node. Setelah dibuat pertama kali, data ini 
	 * tidak dapat diubah-ubah.  
	 */
	private E data;
	/**
	 * Alamat ke Parent Node. 
	 */
	private TreeNodeSDA<E> parent; 
	/**
	 * Daftar seluruh Node lain yang dapat diakses secara langsung oleh Node 
	 * ini (i.e., Node tetangga).  
	 */
	private LinkedList<TreeNodeSDA<E>> children;
	/**
	 * Flag yang menandakan apakah Node ini sudah pernah dikunjungi sebelumnya. 
	 */
	private boolean visited;
	
	/**
	 * Membuat sebuah Node baru yang akan menyimpan data yang diberikan. 
	 * Setelah disimpan, data ini tidak bisa diubah-ubah. 
	 * @param data Data yang akan disimpan dalam Node.
	 * @param parent Parent dari Node ini. 
	 */
	public TreeNodeSDA(E data, TreeNodeSDA<E> parent) {
		this.data = data; // simpan data yang diberikan
		this.parent = parent; // simpan alamat Parent Node
		visited = false; // tandai bahwa Node ini belum pernah dikunjungi
		// siapkan tempat penyimpanan Node tetangga  
		children = new LinkedList<>();
	}
	
	/**
	 * Membaca data yang tersimpan dalam Node ini.
	 * @return Data yang disimpan dalam Node.
	 */
	public E getData() {
		return data; // mengembalikan data yang tersimpan dalam Node ini 
	}
	
	/**
	 * Membaca Parent dari Node ini.
	 * @return Parent Node dari Node ini. 
	 */
	public TreeNodeSDA<E> getParent() {
		return parent; // mengembalikan Parent Node
	}
	
	/**
	 * Mengubah Parent Node dari Node ini. 
	 * @param parent Parent Node baru untuk Node ini. 
	 */
	public void setParent(TreeNodeSDA<E> parent) {
		this.parent = parent; // ubah Parent Node
	}
	
	/**
	 * Membaca daftar seluruh Node lain yang dapat dikunjungi secara langsung 
	 * oleh Node ini (i.e., Node tetangga). 
	 * @return Daftar Node yang bisa langsung dikunjungi dari Node ini.
	 */
	public LinkedList<TreeNodeSDA<E>> getChildren(){
		return children; // kembalikan daftar Node tetangga
	}
	
	/**
	 * Menambahkan Node yang dapat dikunjungi langsung oleh Node ini (i.e., 
	 * Node tetangga).
	 * @param child Node yang bisa langsung dikunjungi oleh Node ini.
	 * @return true jika node ditambahkan.
	 */
	public boolean addChild(TreeNodeSDA<E> child) {
		child.setParent(this); // pastikan Node ini menjadi parent dari child
		return children.add(child); // tambahkan node dalam daftar tetangga
	}
	
	/**
	 * Membaca apakah Node ini sudah pernah dikunjungi sebelumnya. 
	 * @return true jika Node ini pernah dikunjungi.
	 */
	public boolean isVisited() {
		return visited; // mengembalikan status bahwa Node pernah dikunjungi
	}
	
	/**
	 * Menandai bahwa Node ini sudah dikunjungi. 
	 * @return true untuk menandakan Node sudah ditandai dan dikunjungi.
	 */
	public boolean visited() {
		visited = true; // perbaharui status sudah pernah dikunjungi
		return visited; // kembalikan status sudah pernah dikunjungi
	}
	
	/**
	 * Mengembalikan status Node ini menjadi belum pernah dikunjungi.
	 */
	public void resetVisited() {
		visited = false; // tandai bahwa Node ini belum pernah dikunjungi
	}
	
	/**
	 * Alih-alih mencetak alamat Node ketika dicetak, dengan cara ini, 
	 * Node akan mengembalikan data yang disimpannya saat dicetak.
	 * @return Data yang disimpan.   
	 */
	public String toString() {
		// kembalikan data yang disimpan sebagai sebuah String
		return "" + data.toString();  
	}
}
