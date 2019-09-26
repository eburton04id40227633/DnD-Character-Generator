
public class DnDCharacterTest {

	public static void main(String[] args) {
	
	DnDCharacter dndCharacter = new DnDCharacter(0, 0, 0, 0, 0, 0, 0);

	System.out.println("D&D Character Generator");
	System.out.println("---------------------------------------");
	dndCharacter.getStrength();
	dndCharacter.getDexterity();
	dndCharacter.setConstitution();
	dndCharacter.getConstitution();
	dndCharacter.getIntelligence();
	dndCharacter.getWisdom();
	dndCharacter.getCharisma();
	System.out.println();
	System.out.println("---------------------------------------");
	System.out.println();
	dndCharacter.modifier();
	dndCharacter.getHitPoints();

	}

}
