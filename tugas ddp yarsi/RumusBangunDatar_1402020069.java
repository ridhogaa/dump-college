import java.util.Scanner;
public class RumusBangunDatar_1402020069{
	public static void main(String[] args){
		// mendeklarasikan Scanner scan dan untuk memberi input pada saat program dijalankan
		Scanner scan = new Scanner(System.in);
		// byte dipilih karna range bilangan bulat 1-100, berikut nama variablenya:
		byte pilihAngka;
		// String dipilih untuk mendeklarasikan kata, berikut nama variablenya:
		String luasKeliling ;
		// boolean dipilih untuk menghasilkan output true or false, berikut adalah nama variablenya :
		boolean persegiLuas, persegiKeliling, segitigaLuas, segitigaKeliling, lingkaranLuas, lingkaranKeliling;
		
		System.out.print("\n\t-------------------------------------------------");// Ridho Gymnastiar Al Rasyid
		System.out.print("\n\t\tProgram Rumus Bangun Datar");// Teknik Informatika kelas B
		System.out.print("\n\tDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");// NPM: 1402020069
		System.out.print("\n\t-------------------------------------------------\n");

		System.out.print("1. Persegi\n2. Segitiga\n3. Lingkaran\n");
		System.out.print("Pilih Bangun Datar (1, 2, 3)\t: ");
		pilihAngka = scan.nextByte();// mencetak pilihan angka bangun datar yang ingin kita input
		System.out.print("Hitung Luas atau Keliling (L/K)\t: ");
		luasKeliling = scan.next();// mencetak Hitung L/K yang ingin kita input
		System.out.print("Rumus yang anda pilih adalah: ");

		// boolean pemilihan luas persegi, pilih bangun datar == 1 dan Hitung L/K = L maka true
		persegiLuas = pilihAngka == 1 && luasKeliling.equals("L");
		// boolean pemilihan keliling persegi, pilih bangun datar == 1 dan Hitung L/K = K maka true
		persegiKeliling = pilihAngka == 1 && luasKeliling.equals("K");
		// boolean pemilihan luas segitiga, pilih bangun datar == 2 dan Hitung L/K = L maka true
		segitigaLuas = pilihAngka == 2 && luasKeliling.equals("L");
		// boolean pemilihan keliling segitiga, pilih bangun datar == 2 dan Hitung L/K = K maka true
		segitigaKeliling = pilihAngka == 2 && luasKeliling.equals("K");
		// boolean pemilihan luas lingkaran, pilih bangun datar == 3 dan Hitung L/K = L maka true
		lingkaranLuas = pilihAngka == 3 && luasKeliling.equals("L");
		// boolean pemilihan keliling lingkaran, pilih bangun datar == 3 dan Hitung L/K = K maka true
		lingkaranKeliling = pilihAngka == 3 && luasKeliling.equals("K");

		// jika pilihan angka == 1 dan Hitung L/K = L atau boolean persegiLuas true
		// maka program akan mencetak kodingan di dalam scope di bawah:
		if(persegiLuas){ // scope awal atau pembukaan scope
			// double dipilih karna merupakan bilangan rill, mendeklarasikan nama variable berikut:
			double luasPersegi, sisi1, sisi2;
				System.out.println("Luas Persegi");
				System.out.print("Masukan panjang\t: ");
			sisi1 = scan.nextDouble();// mencetak panjang dan sisi1 dengan angka atau bilangan riil yang ingin kita input
				System.out.print("Masukan lebar\t: ");
			sisi2 = scan.nextDouble();// mencetak lebar dan sisi2 dengan angka atau bilangan riil yang ingin kita input
				System.out.println("Rumus luas persegi: panjang * lebar");
			luasPersegi = sisi1 * sisi2;// menghitung luas persegi
				System.out.println("Hasil luas persegi: " + String.format("%.2f", luasPersegi));
				// mencetak hasil luas persegi dan memformat hanya 2 angka desimal dibelakang hasil
		} // scope akhir atau penutupan scope

					// jika pilihan angka == 1 dan Hitung L/K = K atau boolean persegiKeliling true
					// maka program akan mencetak kodingan di dalam scope di bawah:
					else if(persegiKeliling){// scope awal atau pembukaan scope
						// short dipilih karna merupakan bilangan bulat, mendeklarasikan nama veriable berikut:
						short sisi1, sisi2;
						// double dipilih karna merupakan bilangan riil, mendeklarasikan nama variable berikut:
						double kelilingPersegi;
							System.out.println("Keliling Persegi");
							System.out.print("Masukan panjang\t: ");
						sisi1 = scan.nextShort();// mencetak panjang dan sisi1 dengan angka atau bilangan bulat yang ingin kita input
							System.out.print("Masukan lebar\t: ");
						sisi2 = scan.nextShort();// mencetak lebar dan sisi2 dengan angka atau bilangan bulat yang ingin kita input
							System.out.println("Rumus keliling persegi: panjang + lebar + panjang + lebar");
						kelilingPersegi = (double) sisi1 + sisi2 + sisi1 + sisi2;// menghitung keliling persegi
							System.out.println("Hasil keliling persegi: " + String.format("%.2f", kelilingPersegi));
							// mencetak hasil keliling persegi dan memformat hanya 2 angka desimal dibelakang hasil
					}// scope akhir atau penutupan scope

		// jika pilihan angka == 2 dan Hitung L/K = L atau boolean segitigaLuas true
		// maka program akan mencetak kodingan di dalam scope di bawah:
		else if(segitigaLuas){// scope awal atau pembukaan scope
			// float dipilih karna merupakan bilangan rill, mendeklarasikan nama variable berikut:
			float alas, tinggi;
			// double dipilih karna merupakan bilangan riil, mendeklarasikan nama variable berikut:
			double luasSegitiga;
				System.out.println("Luas Segitiga");
				System.out.print("Masukan alas\t: ");
			alas = scan.nextFloat();// mencetak alas dengan angka atau bilangan riil yang ingin kita input
				System.out.print("Masukan tinggi\t: ");
			tinggi = scan.nextFloat();// mencetak tinggi dengan angka atau bilangan riil yang ingin kita input
				System.out.println("Rumus luas segitiga: 0.5 * alas * tinggi");
			luasSegitiga = (double) 0.5 * alas * tinggi;// menghitung luas segitiga
				System.out.println("Hasil luas segitiga: " + String.format("%.2f", luasSegitiga));
				// mencetak hasil luas segitiga dan memformat hanya 2 angka desimal dibelakang hasil
		}// scope akhir atau penutupan scope

					// jika pilihan angka == 2 dan Hitung L/K = K atau boolean segitigaKeliling true
					// maka program akan mencetak kodingan di dalam scope di bawah:
					else if(segitigaKeliling){// scope awal atau pembukaan scope
						// float dipilih karna merupakan bilangan rill, mendeklarasikan nama variable berikut:
						float sisi1, sisi2, sisi3;
						// double dipilih karna merupakan bilangan riil, mendeklarasikan nama variable berikut:
						double kelilingSegitiga;
							System.out.println("Keliling Segitiga");
							System.out.print("Masukan sisi 1\t: ");
						sisi1 = scan.nextFloat();// mencetak sisi1 dengan angka atau bilangan rill yang ingin kita input
							System.out.print("Masukan sisi 2\t: ");
						sisi2 = scan.nextFloat();// mencetak sisi2 dengan angka atau bilangan riil yang ingin kita input
							System.out.print("Masukan sisi 3\t: ");
						sisi3 = scan.nextFloat();// mencetak sisi3 dengan angka atau bilangan riil yang ingin kita input
							System.out.println("Rumus keliling segitiga: sisi 1 + sisi 2 + sisi 3");
						kelilingSegitiga = (double) sisi1 + sisi2 + sisi3;// menghitung keliling segitiga
							System.out.println("Hasil keliling segitiga: " + String.format("%.2f", kelilingSegitiga));
							// mencetak hasil keliling segitiga dan memformat hanya 2 angka desimal dibelakang hasil
					}// scope akhir atau penutupan scope

		// jika pilihan angka == 3 dan Hitung L/K = L atau boolean lingkarangLuas true
		// maka program akan mencetak kodingan di dalam scope di bawah:
		else if(lingkaranLuas){// scope awal atau pembukaan scope
			// float dipilih karna merupakan bilangan riil, mendeklarasikan nama variable berikut:
			float jarijari;
			// double dipilih karna merupakan bilangan riil, mendeklarasikan nama variable berikut:
			double luasLingkaran;
				System.out.println("Luas Lingkaran");
				System.out.print("Masukan jari-jari: ");
			jarijari = scan.nextFloat();// mencetak jarijari dengan angka atau bilangan riil yang ingin kita input
				System.out.println("Rumus luas lingkaran: phi * jari-jari * jari-jari");
			luasLingkaran = (double) Math.PI * jarijari * jarijari;// menghitung luas lingkaran memakai method math pi
				System.out.println("Hasil luas lingkaran: " + String.format("%.2f", luasLingkaran));
				// mencetak hasil luas lingkaran dan memformat hanya 2 angka desimal dibelakang hasil
		}// scope akhir atau penutupan scope

					// jika pilihan angka == 3 dan Hitung L/K = K atau boolean lingkaranKeliling true
					// maka program akan mencetak kodingan di dalam scope di bawah:
					else if(lingkaranKeliling){// scope awal atau pembukaan scope
						// float dipilih karna merupakan bilangan riil, mendeklarasikan variable berikut:
						float jarijari;
						// double dipilih karna merupakan bilangan riil, mendeklarasikan variable berikut:
						double kelilingLingkaran;
							System.out.println("Keliling Lingkaran");
							System.out.print("Masukan jari-jari: ");
						jarijari = scan.nextFloat();// mencetak jarijari dengan angka atau bilangan riil yang ingin kita input
							System.out.println("Rumus keliling lingkaran: 2 * phi * jari-jari");
						kelilingLingkaran = (double) 2 * Math.PI * jarijari;// menghitung luas lingkaran memakai method math pi
							System.out.println("Hasil keliling lingkaran: " + String.format("%.2f", kelilingLingkaran));
							// mencetak hasil keliling lingkaran dan memformat hanya 2 angka desimal dibelakang hasil
					}// scope akhir atau penutupan scope

		// lainnya jika input tidak sesuai makan program akan mencetak kodingan di dalam scope di bawah:
		else{// scope awal atau pembukaan scope
			System.out.println("\nMaaf rumus yang anda pilih tidak terdaftar\nCoba sesuaikan angka(1,2,3) dan rumus(L/K) dari bangun datar!");
			// program akan mencetak kata di atas ^^^ 
		}// scope akhir atau penutupan scope

		/*Created by : Ridho Gymnastiar Al Rasyid
		NPM : 1402020069*/	
	}
}