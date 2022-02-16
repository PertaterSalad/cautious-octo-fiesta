import java.util.Random;

public class Army {
	private int damage;
	private int[] armyList = {0 , 0 , 0 , 0 , 0 , 0};
	private int maintenance = 0;
	private int mass=0;
	private int armor =0;
	private int hp = 0;
	
	public Army() {
	}
	public Army(int knt , int hC, int lC , int hvI, int lI, int pea) { 
		this.armyList[0] =knt;
		this.armyList[1] =hC;
		this.armyList[2] =lC;
		this.armyList[3] =hvI;
		this.armyList[4] =lI;
		this.armyList[5] =pea;
		calcMaintenance();
		calcMass();
		calcHp();
	}
	
	public void printInfo() {
		calcMaintenance();
		calcMass();
		calcArmor();
		calcHp();
		System.out.println("Knights: " + armyList[0]);
		System.out.println("Heavy Cavalry: " + armyList[1]);
		System.out.println("Light Cavalry: " + armyList[2]);
		System.out.println("Heavy Infantry: " + armyList[3]);
		System.out.println("Light Infantry: " + armyList[4]);
		System.out.println("Peasants: " + armyList[5]);
		System.out.println("Mass: " + mass);
		System.out.println("Maintenance: " + maintenance);
		System.out.println("Armor: " + armor);
		System.out.println("HP: " + hp);

	}
	//roll for your skirmish troops
	public void rollHarass() {
		Random rand = new Random();
		for (int j = 0; j < armyList[2]; j++) {
			int dice1 = rand.nextInt(6)+1;
			if (dice1 < 3) {
			damage += dice1;
			}
		}
		for (int j = 0; j < armyList[4]; j++) {
			int dice1 = rand.nextInt(6)+1;
			if (dice1 < 3) {
			damage += dice1;
			}
		}
	}
	//roll for the main body of the army's damage
	public void rollMain() {
		//clear damage
		damage= 0;
		Random rand = new Random();
		for (int i = 0; i < armyList.length; i++) 
		{
			for (int j = 0; j < armyList[i]; j++) {
				int dice1 = rand.nextInt(6) + 1;
				if(i == 0) {
					int dice2 = rand.nextInt(6) + 1;
					if (dice1 < 6) {
						damage += dice1;
					}
					if(dice2 < 6) {
						damage += dice2;
					}
				}
				if (i == 1) {
					int dice2 = rand.nextInt(6) + 1;
					if (dice1 < 5) {
						damage += dice1;
					}
					if(dice2 < 5) {
						damage += dice2;
					}
				}
				if (i == 2) {
					int dice2 = rand.nextInt(6) + 1;
					if (dice1 < 4) {
						damage += dice1;
					}
					if(dice2 < 4) {
						damage += dice2;
					}
				}
				if (i == 3) {
					if (dice1 < 5) {
						damage += dice1;
					}
				}
				if (i == 4) {
					if(dice1 < 4) {
						damage += dice1;
					}
				}
				if (i == 5) {
					if(dice1 < 3) {
						damage += dice1;
					}
				}
			}
		}
	}
	//roll for the rundown of the enemy army
	public void rollRout() {
		damage = 0;
		Random rand = new Random();
		for (int j = 0; j < armyList[0]; j++) {
			int dice1 = rand.nextInt(6)+1;
			if (dice1 < 6) {
			damage += dice1;
			}
		}
		for (int j = 0; j < armyList[1]; j++) {
			int dice1 = rand.nextInt(6)+1;
			if (dice1 < 5) {
			damage += dice1;
			}
		}
		for (int j = 0; j < armyList[2]; j++) {
			int dice1 = rand.nextInt(6)+1;
			int dice2 = rand.nextInt(6)+1;
			if (dice1 < 3) {
			damage += dice1;
			}
			if (dice2 < 3) {
				damage += dice2;
				}
		}
		for (int j = 0; j < armyList[4]; j++) {
			int dice1 = rand.nextInt(6)+1;
			if (dice1 < 3) {
			damage += dice1;
			}
		}
	}
	//calculate the armor of the troops
	public void calcArmor() {
		armor = (armyList[0] * 2) + (armyList[1] * 1) + (armyList[3] * 2);
				
	}
	//calculate maintenance
	public void calcMaintenance() {
		maintenance = (armyList[0] * 6) + (armyList[1] * 5) + (armyList[2] * 4) + (armyList[3] * 3) + 
				(armyList[4] * 2) + (armyList[5] * 1);
	}
	public void calcHp() {
		hp = (armyList[0] * 6) + (armyList[1] * 5) + (armyList[2] * 4) + (armyList[3] * 3) + 
				(armyList[4] * 2) + (armyList[5] * 1);
	}
	public void calcMass() {
		mass = armyList[0] + armyList[1] + armyList[2] + armyList[3] + armyList[4] + armyList[5];
		}
		
	//mutators and getters
	public int getKnights() {
		return armyList[0];
	}
	public void setKnights(int number) {
		armyList[0] = number;
	}
	public int getHevCav() {
		return armyList[1];
	}
	public void setHevCav(int number) {
		armyList[1] = number;
	}
	public int getLightCav() {
		return armyList[2];
	}
	public void setLightCav(int number) {
		armyList[2] = number;
	}
	public int getHevInf() {
		return armyList[3];
	}
	public void setHevInf(int number) {
		armyList[3] = number;
	}
	public int getLightInf() {
		return armyList[4];
	}
	public void setLightInf(int number) {
		armyList[4] = number;
	}
	public int getPeasants() {
		return armyList[5];
	}
	public void setPeasants(int number) {
		armyList[5] = number;
	}
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getDamage() {
		return damage;
	}
}


