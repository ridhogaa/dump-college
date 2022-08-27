import java.util.Scanner;
import java.util.Random;
/*
	* @author	: Ridho Gymnastiar Al Rasyid
	* NPM 		: 1402020069
	* Praktikum 4 PBO 
*/
interface Weaponed{
	public String getWeaponName();
	public int getWeaponPower();
}
interface HaveUltimateAbility{
	public String getPowerName();
	public int getPower();
	public int attack();
}
class Character{
	// field class Character
	private String characterName;
	private String origin;
	private String ephipet;
	private int bounty;
	private int health = 100;
	private Object thisObject = this;
	private Weaponed objWeaponed = (Weaponed) thisObject;
	private HaveUltimateAbility objHUV = (HaveUltimateAbility) thisObject;

	public Character(String characterName, String origin, String ephipet, int bounty){
		setName(characterName);
		setOrigin(origin);
		setEphipet(ephipet);
		setBounty(bounty);
	}
	public Character(String characterName, String ephipet, int bounty){
		setName(characterName);
		setEphipet(ephipet);
		setBounty(bounty);
	}
	public void setName(String characterName){
		this.characterName = characterName;
	}
	public void setOrigin(String origin){
		this.origin = origin;
	}
	public void setEphipet(String ephipet){
		this.ephipet = ephipet;
	}
	public void setBounty(int bounty){
		this.bounty = bounty;
	}
	public String getName(){
		return characterName;
	}
	public String getOrigin(){
		return origin;
	}
	public String getEphipet(){
		return ephipet;
	}
	public int getBounty(){
		return bounty;
	}
	public int getHealth(){
		return health;
	}
	public void characterAttack(Character object){
		System.out.println(this.getName() + " menyerang " + object.getName() + " menggunakan " + objWeaponed.getWeaponName());
		System.out.println("dengan jurus " + objHUV.getPowerName() + ", jumlah serangan -> " + objHUV.attack());
		System.out.println("-------------------------------------------------");
		System.out.println("Health " + this.getName() + " saat ini -> " + this.getHealth());
		object.health -= objHUV.attack();
		if (object.getHealth() <= 0) {
			object.health = 0;
		}
		System.out.println("Health " + object.getName() + " tersisa -> " + object.getHealth() + "\n");
		if (object.getHealth() == 0) {
			System.out.println("Pemenangnya adalah " + this.getName());
			this.bounty += object.getBounty();
			System.out.println("Nilai bounty " + this.getName() + " naik menjadi " + this.getBounty());
			System.exit(0);
		}		
	}
	public void toStringDisplay(){
		System.out.println("Nama karakter\t: " + this.getName());
		if (this.getOrigin() != null) 
			System.out.println("Asal\t\t: " + this.getOrigin());
		System.out.println("Julukan\t\t: " + this.getEphipet());
		System.out.println("Harga buronan\t: " + this.getBounty());
	}
}
class StrawHat extends Character implements Weaponed, HaveUltimateAbility{
	private String profession;

	public StrawHat(String characterName, String origin, String ephipet, int bounty, String profession){
		super(characterName, origin, ephipet, bounty);
		setProfession(profession);
	}
	public void setProfession(String profession){
		this.profession = profession;
	}
	public String getProfession(){
		return profession;
	}
	public String getWeaponName(){
		String weapon = "";
	 	if (super.getName().equals("Roronoa Zoro"))
	 		weapon = "Samurai";
	 	if (super.getName().equals("Usopp"))
	 		weapon = "Ketapel";
	 	return weapon;
	}
	public int getWeaponPower(){
		int weaponPower = 0;
	 	if (super.getName().equals("Roronoa Zoro"))
	 		weaponPower = 9;
	 	if (super.getName().equals("Usopp"))
	 		weaponPower = 4;
	 	return weaponPower;
	}
	public String getPowerName(){
		String powerName = "";
	 	if (super.getName().equals("Roronoa Zoro"))
	 		powerName = "Sanzen Sekai";
	 	if (super.getName().equals("Usopp"))
	 		powerName = "Kaen Boshi";
	 	return powerName;
	}
	public int getPower(){
		int power = 0;
	 	if (super.getName().equals("Roronoa Zoro"))
	 		power = 20;
	 	if (super.getName().equals("Usopp"))
	 		power = 15;
	 	return power;
	}
	public int attack(){
		return this.getWeaponPower() + this.getPower();
	}
	public void toStringDisplay(){
		super.toStringDisplay();
		System.out.println("Profesi\t\t: " + this.getProfession());
		System.out.println("----------------------------");
		System.out.println("Nama senjata\t: " + this.getWeaponName());
		System.out.println("Kekuatan senjata: " + this.getWeaponPower());
		System.out.println("");
	}
}
class Beast extends Character implements Weaponed, HaveUltimateAbility{
	private String division;
	
	public Beast(String characterName, String origin, String ephipet, int bounty, String division){
		super(characterName, origin, ephipet, bounty);
		setDivision(division);
	}
	public Beast(String characterName, String ephipet, int bounty, String division){
		super(characterName, ephipet, bounty);
		setDivision(division);
	}
	public void setDivision(String division){
		this.division = division;
	}
	public String getDivision(){
		return division;
	}
	public String getWeaponName(){
		String weapon = "";
	 	if (super.getName().equals("King"))
	 		weapon = "Kapak";
	 	if (super.getName().equals("Queen"))
	 		weapon = "Pistol";
	 	return weapon;
	}
	public int getWeaponPower(){
		int weaponPower = 0;
	 	if (super.getName().equals("King"))
	 		weaponPower = 12;
	 	if (super.getName().equals("Queen"))
	 		weaponPower = 7;
	 	return weaponPower;
	}
	public String getPowerName(){
		String powerName = "";
	 	if (super.getName().equals("King"))
	 		powerName = "Ocean Blast";
		if (super.getName().equals("Queen"))
	 		powerName = "Light Beam";
	 	return powerName;
	}
	public int getPower(){
		int power = 0;
	 	if (super.getName().equals("King")) 
	 		power = 18;
	 	if (super.getName().equals("Queen"))
	 		power = 13;
	 	return power;
	}
	public int attack(){
		return this.getWeaponPower() + this.getPower();
	}
	public void toStringDisplay(){
		super.toStringDisplay();
		System.out.println("Divisi\t\t: " + this.getDivision());
		System.out.println("----------------------------");
		System.out.println("Nama senjata\t: " + this.getWeaponName());
		System.out.println("Kekuatan senjata: " + this.getWeaponPower());
		System.out.println("");
	}
}

public class Praktikum4_1402020069{
	// field class Praktikum4_1402020069
	private static Scanner input = new Scanner(System.in);
	private static Random generateRandom = new Random();

	public static void main(String[] args) {
		System.out.print("\n=================================================");
		System.out.print("\n\tPraktikum 4 PBO");
		System.out.print("\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.print("\n=================================================\n");
		StrawHat[] objStrawHat = {
					new StrawHat("Roronoa Zoro", "West Blue", "Pirate Hunter", 320_000_000, "Combotant"),
		 			new StrawHat("Usopp", "East Blue", "Sogeking", 200_000_000, "Sniper")
		 		};
		Beast[] objBeast = {
				new Beast("King", "North Blue", "King the Wildfire", 1_390_000_000, "All-Stars"),
				new Beast("Queen", "Queen the Plague", 1_320_000_000, "Tobiroppo")
			};
		Praktikum4_1402020069.displayCharacter(objStrawHat, objBeast); // METHOD displayCharacter untuk menampilkan Character
		Praktikum4_1402020069.pirateBattle(objStrawHat, objBeast); // METHOD pirateBattle
	}
	// METHOD displayCharacter
	private static void displayCharacter(Character[] a, Character[] b){
		for (int i = 0;i < 2 ;i++ ) {
			a[i].toStringDisplay();
			b[i].toStringDisplay();
		}
	}
	// METHOD pirateBattle
	private static void pirateBattle(Character[] a, Character[] b){
		int index = generateRandom.nextInt(2);
		System.out.println("Pilih Bajak Laut");
		System.out.println("1. STRAW HAT PIRATES");
		System.out.println("2. BEAST PIRATES");
		System.out.print("Pilihan anda: ");
		int pilihanBajakLaut = input.nextInt();
		System.out.println("");
		int pilihCharacter = 0;
		switch(pilihanBajakLaut){
			case 1: 
			System.out.println("Pilih Karakter");
			System.out.println("1. " + a[0].getName());
			System.out.println("2. " + a[1].getName());
			System.out.print("Pilihan anda: ");
			pilihCharacter = input.nextInt();
			System.out.println("");
			if (pilihCharacter == 1) 
				pilihCharacter = 0;
			if (pilihCharacter == 2)
				pilihCharacter = 1;
			Praktikum4_1402020069.generateRandomBattle(a[pilihCharacter], b[index]);
			break;
			case 2:
			System.out.println("Pilih Karakter");
			System.out.println("1. " + b[0].getName());
			System.out.println("2. " + b[1].getName());
			System.out.print("Pilihan anda: ");
			pilihCharacter = input.nextInt();
			System.out.println("");
			if (pilihCharacter == 1)
				pilihCharacter = 0;
			if (pilihCharacter == 2)
				pilihCharacter = 1;
			Praktikum4_1402020069.generateRandomBattle(a[index], b[pilihCharacter]);
			break;
			default:
			System.out.println("Pilihan tidak tersedia!");
			input.close();
		}
	}
    private static void generateRandomBattle(Character a, Character b){
    	int randomBattle;
    	do{
			randomBattle = generateRandom.nextInt(2);
			System.out.println("Hasil angka random -> " + randomBattle);
			System.out.println("-------------------------------------------------");
			if (randomBattle == 0)
				a.characterAttack(b); // METHOD characterAttack
			if (randomBattle == 1)
				b.characterAttack(a); // METHOD characterAttack
		}while(randomBattle == 0 || randomBattle == 1);
    }
}