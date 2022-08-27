/*
	@author	: Ridho Gymnastiar Al Rasyid
	* NPM : 1402020069
	* Praktikum 3 PBO 
*/

// class Hero
class Hero{
	private String name;
	private String emblem;
	protected int durability;
	protected int speed;
	protected int damage;
	Hero(String name, String emblem){
		setName(name);
		setEmblem(emblem);
	}
	public void showStatisticHero(){
		System.out.println("Nama : " + getName());
		System.out.println("Emblem : " + getEmblem());
	}
	public void setDurability(int durability){
		this.durability = durability;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setDamage(int damage){
		this.damage = damage;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmblem(String emblem){
		this.emblem = emblem;
	}
	public int getDurability(){
		return this.durability;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getDamage(){
		return this.damage;
	}
	public String getName(){
		return this.name;
	}
	public String getEmblem(){
		return this.emblem;
	}
	public static void pertarunganHero(Hero a, Hero b){
		String namaHeroPertama = a.getName();
		String namaHeroKedua = b.getName();
		int durabilityHeroPertama = a.getDurability();
		int durabilityHeroKedua = b.getDurability();
		int damageHeroPertama = a.getDamage();
		int damageHeroKedua = b.getDamage();
		System.out.println("Hero yang akan bertarung adalah hero " + namaHeroPertama + " melawan hero " + namaHeroKedua);
		System.out.println("Durability hero " + namaHeroPertama + " saat ini sebesar: " + durabilityHeroPertama);
		System.out.println("Durability hero " + namaHeroKedua + " saat ini sebesar: " + durabilityHeroKedua);
		System.out.println("-----------------------------------");
		while(durabilityHeroPertama >= 0 || durabilityHeroKedua >= 0){
			System.out.println("Saatnya " + namaHeroPertama + " menyerang " + namaHeroKedua);
			durabilityHeroKedua -= damageHeroPertama;
			if (durabilityHeroKedua <= 0) {
				durabilityHeroKedua = 0;
			}
			System.out.println("Durability hero " + namaHeroKedua + " saat ini adalah: " + durabilityHeroKedua);
			System.out.println("-----------------------------------");
			if (durabilityHeroKedua == 0) {
				System.out.println("Pemenangnya adalah hero: " + namaHeroPertama);
				System.exit(0);
			}
			System.out.println("Saatnya " + namaHeroKedua + " menyerang " + namaHeroPertama);
			durabilityHeroPertama -= damageHeroKedua;
			if (durabilityHeroPertama <= 0) {
				durabilityHeroPertama = 0;
			}	
			System.out.println("Durability hero " + namaHeroPertama + " saat ini adalah: " + durabilityHeroPertama);
			System.out.println("-----------------------------------");
			if (durabilityHeroPertama == 0) {
				System.out.println("Pemenangnya adalah hero: " + namaHeroKedua);
				System.exit(0);
			}
		}
	}
}
// class fighter
class Fighter extends Hero{
	Fighter(String name, String emblem){
		super(name, emblem);
		// durability = 3000
		// speed = 150
		// damage = 100
		super.setDurability(3000);
		super.setSpeed(150);
		super.setDamage(100);
	}
}
// class marksman
class Marksman extends Hero{
	Marksman(String name, String emblem){
		super(name, emblem);
		// durability = 2000
		// speed = 200
		// damage = 200
		super.setDurability(2000); 
		super.setSpeed(200);
		super.setDamage(200); 
	}
}
// class FighterTank
class FighterTank extends Fighter{
	private String lane;
	private String spell;
	FighterTank(String name, String emblem, String lane, String spell){
		super(name, emblem);
		setLane(lane);
		setSpell(spell);
		setDurability(super.getDurability());
		setSpeed(super.getSpeed());
		setDamage(super.getDamage());
	}
	public void showStatisticHero(){
		super.showStatisticHero();
		System.out.println("Lane : " + getLane());
		System.out.println("Spell : " + getSpell());
		System.out.println("Durability : " + getDurability());
		System.out.println("Speed : " + getSpeed());
		System.out.println("Damage : " + getDamage() + "\n");
	}
	public void setLane(String lane){
		this.lane = lane;
	}
	public void setSpell(String spell){
		this.spell = spell;
	}
	public void setDurability(int durability){
		durability = getSpell().equals("Vengeance") ? durability + (durability * 25 / 100) : durability;
		durability = super.getEmblem().equals("Tank") ? durability + (durability * 5 / 100) : durability;
		this.durability = durability;
	}
	public void setSpeed(int speed){
		speed = getSpell().equals("Sprint") ? speed + 10 : speed;
		this.speed = speed;
	}
	public void setDamage(int damage){
		damage = !(getSpell().equals("Flameshot")) ? damage - (damage * 10 / 100) : damage;
		this.damage = damage;
	}
	public String getLane(){
		return this.lane;
	}
	public String getSpell(){
		return this.spell;
	}
	public int getDurability(){
		return this.durability;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getDamage(){
		return this.damage;
	}
}
// class FighterHyper
class FighterHyper extends Fighter{
	private String lane;
	private String spell;
	FighterHyper(String name, String emblem, String lane, String spell){
		super(name, emblem);
		setLane(lane);
		setSpell(spell);
		setDurability(super.getDurability());
		setSpeed(super.getSpeed());
		setDamage(super.getDamage());
	}
	public void showStatisticHero(){
		super.showStatisticHero();
		System.out.println("Lane : " + getLane());
		System.out.println("Spell : " + getSpell());
		System.out.println("Durability : " + getDurability());
		System.out.println("Speed : " + getSpeed());
		System.out.println("Damage : " + getDamage() + "\n");
	}
	public void setLane(String lane){
		this.lane = lane;
	}
	public void setSpell(String spell){
		this.spell = spell;
	}
	public void setDurability(int durability){
		durability = getSpell().equals("Retribution") ? durability - (durability * 10 / 100) : durability;
		this.durability = durability;
	}
	public void setSpeed(int speed){
		speed = getSpell().equals("Sprint") ? speed + 10 : speed;
		this.speed = speed;
	}
	public void setDamage(int damage){
		damage = getSpell().equals("Retribution") ? damage + (damage * 20 / 100) : damage;
		this.damage = damage;
	}
	public String getLane(){
		return this.lane;
	}
	public String getSpell(){
		return this.spell;
	}
	public int getDurability(){
		return this.durability;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getDamage(){
		return this.damage;
	}
}
// class MarksmanGoldLane
class MarksmanGoldLane extends Marksman{
	private String lane;
	private String spell;
	MarksmanGoldLane(String name, String emblem, String lane, String spell){
		super(name, emblem);
		setLane(lane);
		setSpell(spell);
		setDurability(super.getDurability());
		setSpeed(super.getSpeed());
		setDamage(super.getDamage());
	}
	public void showStatisticHero(){
		super.showStatisticHero();
		System.out.println("Lane : " + getLane());
		System.out.println("Spell : " + getSpell());
		System.out.println("Durability : " + getDurability());
		System.out.println("Speed : " + getSpeed());
		System.out.println("Damage : " + getDamage() + "\n");
	}
	public void setLane(String lane){
		this.lane = lane;
	}
	public void setSpell(String spell){
		this.spell = spell;
	}
	public void setDurability(int durability){
		durability += 200;
		this.durability = durability;
	}
	public void setSpeed(int speed){
		speed += 50;
		this.speed = speed;
	}
	public void setDamage(int damage){
		damage += damage * 10 / 100;
		this.damage = damage;
	}
	public String getLane(){
		return this.lane;
	}
	public String getSpell(){
		return this.spell;
	}
	public int getDurability(){
		return this.durability;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getDamage(){
		return this.damage;
	}
}
// class MarksmanHyper
class MarksmanHyper extends Marksman{
	private String lane;
	private String spell;
	MarksmanHyper(String name, String emblem, String lane, String spell){
		super(name, emblem);
		setLane(lane);
		setSpell(spell);
		setDurability(super.getDurability());
		setSpeed(super.getSpeed());
		setDamage(super.getDamage());
	}
	public void showStatisticHero(){
		super.showStatisticHero();
		System.out.println("Lane : " + getLane());
		System.out.println("Spell : " + getSpell());
		System.out.println("Durability : " + getDurability());
		System.out.println("Speed : " + getSpeed());
		System.out.println("Damage : " + getDamage() + "\n");
	}
	public void setLane(String lane){
		this.lane = lane;
	}
	public void setSpell(String spell){
		this.spell = spell;
	}
	public void setDurability(int durability){
		durability -= 400;
		this.durability = durability;
	}
	public void setSpeed(int speed){
		speed += 150;
		this.speed = speed;
	}
	public void setDamage(int damage){
		damage += damage * 40 / 100;
		this.damage = damage;
	}
	public String getLane(){
		return this.lane;
	}
	public String getSpell(){
		return this.spell;
	}
	public int getDurability(){
		return this.durability;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getDamage(){
		return this.damage;
	}
}
// Class Praktikum3_1402020069
public class Praktikum3_1402020069{
	public static void main(String[] args) {
		System.out.print("\n=================================================");
		System.out.print("\n\tPraktikum 3 PBO");
		System.out.print("\nDibuat oleh Ridho Gymnastiar Al Rasyid/1402020069");
		System.out.print("\n=================================================\n");
		Fighter gatotKaca = new FighterTank("GatotKaca", "Tank", "MidLane" ,"Sprint");
		Fighter balmond = new FighterHyper("Balmond", "Fighter", "Jungle" ,"Retribution");
		Marksman claude = new MarksmanGoldLane("Claude", "Marksman", "GoldLane", "Inspire");
		Marksman miya = new MarksmanHyper("Miya", "Marksman", "Jungle", "Retribution");
		System.out.println("====================UPCASTING==================");
		gatotKaca.showStatisticHero();
		balmond.showStatisticHero();
		claude.showStatisticHero();
		miya.showStatisticHero();

		Hero[] hero = {new FighterTank("GatotKaca", "Tank", "MidLane" ,"Sprint"),
					new FighterHyper("Balmond", "Fighter", "Jungle" ,"Retribution"), 
					new MarksmanGoldLane("Claude", "Marksman", "GoldLane", "Inspire"), 
					new MarksmanHyper("Miya", "Marksman", "Jungle", "Retribution"),
					new FighterTank("Silvanna", "Tank", "MidLane" ,"Vengeance"),
					new FighterTank("XBorg", "Tank", "Roamer" ,"Flameshot"),
					new FighterHyper("Alpha", "Assasin", "Jungle" ,"Retribution"),
					new FighterHyper("Sun", "Fighter", "Jungle" ,"Arrival"),
					new MarksmanGoldLane("Layla", "Marksman", "GoldLane", "Flicker"), 
					new MarksmanHyper("Bruno", "Marksman", "Jungle", "Retribution"),
					new MarksmanGoldLane("Lesley", "Assasin", "GoldLane", "Flameshot"), 
					new MarksmanHyper("Granger", "Jungler", "Jungle", "Retribution")};
		downCastingHero(hero); // manggil method downCastingHero
		Hero.pertarunganHero(hero[3], hero[2]); // manggil method pertarunganHero dari class Hero
	}
	// menampilkan downCastingHero
	private static void downCastingHero(Hero[] hero){
		System.out.println("====================DOWNCASTING==================");
		for (int i = 0;i < hero.length ;i++ ) {
			if (hero[i] instanceof FighterTank) {
				FighterTank downCasting = (FighterTank)hero[i];
				System.out.println("-----Fighter Tank-----");
				downCasting.showStatisticHero();
			}
			if (hero[i] instanceof FighterHyper) {
				FighterHyper downCasting = (FighterHyper)hero[i];
				System.out.println("-----Fighter Hyper-----");
				downCasting.showStatisticHero();
			}
			if (hero[i] instanceof MarksmanGoldLane) {
				MarksmanGoldLane downCasting = (MarksmanGoldLane)hero[i];
				System.out.println("-----Marksman GoldLane-----");
				downCasting.showStatisticHero();
			}
			if (hero[i] instanceof MarksmanHyper) {
				MarksmanHyper downCasting = (MarksmanHyper)hero[i];
				System.out.println("-----Marksman Hyper-----");
				downCasting.showStatisticHero();
			}
		}
		System.out.println("=================================================");
	}
}