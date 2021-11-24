import java.util.Scanner;
/* @author : Ridho Gymnastiar Al Rasyid 
NPM : 1402020069
Program Dota 2 Hero Info
*/
public class HeroInfo_1402020069{
	public static void main(String[] args){
		// mendeklarasikan Scanner in dan untuk memberi input pada saat program dijalankan 
		Scanner in = new Scanner(System.in);
		// mendeklarasikan String dengan nama variable di bawah:
		String hero, name, role, abilities, str, agi, tni, yesOrNo;
		// byte dipilih karna range bilangan bulat 1-100, berikut nama variablenya:
		byte enterLevel, angkaSTR, angkaAGI, angkaINT;
		// mendeklarasikan boolean dengan nama variable di bawah:
		boolean facelessVoid, snapfire, minmaxlevel;
		System.out.print("\n=================================================");
		System.out.print("\n\tProgram Dota 2 Hero Info");
		System.out.print("\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.print("\n=================================================\n");
		System.out.println("Welcome to Dota 2 Hero Info");
		System.out.println("1. Faceless Void");
		System.out.println("2. Snapfire");
		System.out.print("Choose your hero: ");
		hero = in.nextLine(); // menginput dan mencetak nama hero 
		System.out.print("=================================================\n");
		name = ""; // mengisi string name dengan string kosong
		role = ""; // mengisi string role dengan string kosong
		abilities = ""; // mengisi string ablities dengan string kosong
		str = ""; // mengisi string str dengan string kosong
		agi = ""; // mengisi string agi dengan string kosong
		tni = ""; // mengisi string tni dengan string kosong 
		angkaSTR = 0; // mengisi nilai angkaSTR dengan 0
		angkaAGI = 0; // mengisi nilai angkaAGI dengan 0
		angkaINT = 0; // mengisi nilai angkaINT dengan 0
		facelessVoid = hero.equals("Faceless Void"); // boolean facelessvoid = hero == Faceless Void
		snapfire = hero.equals("Snapfire"); // boolean snapfire = hero == Snapfire

		// proses pengisian name, role, abilities, str, agi, tni, angkaSTR, angkaAGI, angkaINT
		// jika facelessVoid maka akan mengisi data di bawah:
		if(facelessVoid){ // pembukaan scope if
				name += "Darkterror"; // name += Darkterror
				role += "Carry or Midlaner"; // role += Carry or Midlaner
				abilities += "Timewalk, Time Dilation, Time Lock, Chronosphere"; // abilities += Timewalk, Time Dilation, Time Lock, Chronosphere
				str += "STR = 22 + 2.4"; // str += STR = 22 + 2.4
				agi += "AGI = 23 + 3.1"; // agi += AGI = 23 + 3.1
				tni += "INT = 15 + 2.1"; // tni += INT = 15 + 2.1
				angkaSTR += 22; // angkaSTR += 22
				angkaAGI += 23; // angkaAGI += 23
				angkaINT += 15; // angkaINT += 15
			} // penutupan scope if
		// jika snapfire maka akan mengisi data di bawah:
		else if(snapfire){ // pembukaan scope else if 
				name += "Beatrix Snapfire"; // name += Beatrix Snapfire
				role += "Support or Midlaner"; // role += Support of Midlaner
				abilities += "Scatterblast, Firesnap Cookie, Lil' Shredder, Mortimer Kisses"; // abilities += Scatterblast, Firesnap Cookie, Lil' Shredder, Mortimer Kisses
				str += "STR = 20 + 3.2"; // str += STR = 20 + 3.2
				agi += "AGI = 16 + 2.4"; // agi += AGI = 16 + 2.4
				tni += "INT = 18 + 2.5"; // tni += INT = 18 + 2.5
				angkaSTR += 20; // angkaSTR += 20
				angkaAGI += 16; // angkaAGI += 16
				angkaINT += 18; // angkaINT += 18
			} // penutupan scope else if

		// switch input hero, memilih hero
		switch(hero){ // pembukaan scope switch hero
			// apabila hero Faceless Void atau Snapfire maka akan mencetak program di bawah:
			case "Faceless Void": case "Snapfire":
			System.out.println("Name: " + name);// name sesuai dengan struktur if else di atas
			System.out.println("Role: " + role);// role sesuai dengan struktur if else di atas
			System.out.println("Abilities: " + abilities);// abilities sesuai dengan struktur if else di atas
			System.out.println(str);// str sesuai dengan struktur if else di atas
			System.out.println(agi);// agi sesuai dengan struktur if else di atas
			System.out.println(tni);// tni sesuai dengan struktur if else di atas
			System.out.println("Maximum Level = 30");
			System.out.print("Do you want to check hero level stats? (Yes/No): ");
			yesOrNo = in.next(); // menginput dan mencetak yesOrNo
			System.out.print("=================================================\n");
			// switch input yesOrNo
			switch(yesOrNo){ // pembukaan scope switch yesOrNo
				// apabila yesOrNo Yes maka akan mencetak program di bawah:
				case "Yes": 
				// jika facelessVoid maka mencetak program di bawah:
				if(facelessVoid){ // pembukaan scope if 
					System.out.print("Enter desired level: ");
					enterLevel = in.nextByte(); // menginput dan mencetak level
					minmaxlevel = enterLevel >= 1 && enterLevel <= 30; // boolean min max level, harus 1 sampai 30 
					// jika min max level ada antara 1 sampai 30 maka akan mencetak program di bawah:
					if(minmaxlevel){ // pembukaan scope if
						System.out.println("Faceless Void");
						System.out.println("Level " + enterLevel); // enterLevel
						angkaSTR += 2.4 * (enterLevel - 1); // angkaSTR + 2.4 * (level - 1)
						angkaAGI += 3.1 * (enterLevel - 1); // angkaAGI + 3.1 * (level - 1)
						angkaINT += 2.1 * (enterLevel - 1); // angkaINT + 2.1 * (level - 1)
						System.out.println("STR = " + angkaSTR); // mencetak angkaSTR
						System.out.println("AGI = " + angkaAGI); // mencetak angkaAGI
						System.out.println("INT = " + angkaINT); // mencetak angkaINT
						System.out.print("=================================================\n");
						System.out.println("Thank you for using this program");
					} // penutupan scope if
					// jika minx max level tidak terpenuhi atau tidak ada di jangkauan 1 sampai 30 maka akan mencetak program di bawah:
					else{ // pembukaan scope else
						System.out.println("ERROR 101 - Can't reach that level");
					} // penutupan scope else
				} // penutupan scope if 

				// lainnya jika snapfire maka mencetak program di bawah:
				else if(snapfire){ // pembukaan scope else if
					System.out.print("Enter desired level: ");
					enterLevel = in.nextByte(); // menginput dan mencetak level
					minmaxlevel = enterLevel >= 1 && enterLevel <= 30; // boolean min max level, harus 1 sampai 30 
					// jika min max level ada antara 1 sampai 30 maka akan mencetak program di bawah:
					if(minmaxlevel){ // pembukaan scope if
						System.out.println("Snapfire");
						System.out.println("Level " + enterLevel); // enterLevel
						angkaSTR += 3.2 * (enterLevel - 1); // angkaSTR + 3.2 * (level - 1)
						angkaAGI += 2.4 * (enterLevel - 1); // angkaAGI + 2.4 * (level - 1)
						angkaINT += 2.5 * (enterLevel - 1); // angkaINT + 2.5 * (level - 1)
						System.out.println("STR = " + angkaSTR); // mencetak angkaSTR
						System.out.println("AGI = " + angkaAGI); // mencetak angkaAGI
						System.out.println("INT = " + angkaINT); // mencetak angkaINT
						System.out.print("=================================================\n");
						System.out.println("Thank you for using this program");
					} // penutupan scope if
					// jika minx max level tidak terpenuhi atau tidak ada di jangkauan 1 sampai 30 maka akan mencetak program di bawah:
					else{ // pembukaan scope else
						System.out.println("ERROR 101 - Can't reach that level");
						} // penutupan scope else
					} // penutupan scope else if 
				// perintah break untuk memberhentikan program
				break;
				// jika yesOrNo tidak sesuai dengan case yes maka default akan mencetak program di bawah:
				default:
					System.out.println("Thank you for using this program");
				} // penutupan scope switch yesOrNo
			// perintah break untuk memberhentikan program
			break;
			// jika hero tidak sesuai dengan case di atas maka akan mencetak program di bawah:
			default:
			System.out.println("ERROR 43 - Hero isn't available yet");
			System.out.println("Thank you for using this program");
		} // penutupan scope switch hero
	}
}