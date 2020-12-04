package objectMaster1;

public class Human {
	//Add the strength, stealth, and intelligence attributes with a default of 3
	//Add the health attribute with a default of 100
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	
	
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
	
	//Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
	public void attack(Human victim) {
		victim.health -= this.strength;
	}

	//getters and setters
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		System.out.printf("Current health: %d\n", this.health);
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
	
	

}
