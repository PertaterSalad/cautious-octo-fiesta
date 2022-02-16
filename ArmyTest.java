
public class ArmyTest {

	public static void main(String[] args) {
		Army army1 = new Army();
		//army1.setHevInf(1);
		army1.setKnights(3);
		army1.setLightCav(1);
		army1.setHevCav(6);
		army1.setLightInf(5);
		army1.setPeasants(4);
		army1.printInfo();
		//army1.rollMain();
		//army1.rollHarass();
		army1.rollRout();
		System.out.println("Damage: " +army1.getDamage());
	}

}
