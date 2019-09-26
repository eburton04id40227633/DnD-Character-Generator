
import java.util.*;

class DnDCharacter {
private int strength, dexterity, constitution, intelligence, wisdom, charisma, hitPoints, modifier;
private int[] myDice;

public DnDCharacter(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,
		int hitPoints) {
	super();
	this.strength = strength;
	this.dexterity = dexterity;
	this.constitution = constitution;
	this.intelligence = intelligence;
	this.wisdom = wisdom;
	this.charisma = charisma;
	this.hitPoints = hitPoints;
}


//Method to calculate 4 random numbers and return an array for a specified ability
	public int rollAbility() {
		 Random ran = new Random(); 
		//Generate 4 random numbers between 1 and 6 
		myDice = new int[4];
		for(int i=0;i<4; i++) {
			myDice[i] =  ran.nextInt(6) + 1;
			//System.out.print(myDice[i]);
		}
		//System.out.println();
		
		//Sort the elements in myDice from min to max
		Arrays.sort(myDice);
		//'Throw out' the smallest value by making it zero
		myDice[0] = 0;
		
		//Find the sum of the rolls
		int rollSum = 0;
		for(int i=0;i<4; i++) {
			rollSum += myDice[i];
		}
		//System.out.print(rollSum);
		return rollSum;
	}
	
	public void getStrength() {
		strength = rollAbility();
		System.out.println("STRENGTH:" + strength);
	}
	
	public void getDexterity() {
		dexterity = rollAbility();
		System.out.println("DEXTERITY:" + dexterity);
	}
	
    public void setConstitution() {
    	constitution  = rollAbility();
	}
    
	public void getConstitution() {
		
		System.out.println("CONSTITUTION:" + constitution);
	}

	public void getIntelligence() {
		intelligence = rollAbility();
		System.out.println("INTELLIGENCE:" + intelligence);
	}

	public void getWisdom() {
		wisdom = rollAbility();
		System.out.println("WISDOM:" + wisdom);
	}


	public void getCharisma() {
		charisma = rollAbility();
		System.out.println("CHARISMA:" + charisma);
	}

	//Calculates the constitution modifier 
	public int modifier() {
      modifier = (constitution  + 10 )/2;
      System.out.println("Modifier:" + modifier);
       return modifier;
	}
	
	public void getHitPoints() {
		hitPoints = modifier + 10;
		System.out.println("HITPOINTS:" + hitPoints);
	}

	 

}
