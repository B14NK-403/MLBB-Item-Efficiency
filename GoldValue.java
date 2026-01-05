package mobileLegends;

public class GoldValue {
	
	public static int 
			daggerPrice = 250, knifePrice = 280, javelinPrice = 320, 
            vampireMalletPrice = 400, ironHuntingBowPrice = 450,
            mysteryCodexPrice = 300, powerCrystalPrice = 220, magicNecklacePrice = 120,
            bookOfSagesPrice = 450, leatherJerkinPrice = 220, 
            magicResistCloakPrice = 220, vitalityCrystalPrice = 300, 
            healingNecklacePrice = 140, herosRingPrice = 450, 
            bootsPrice = 250, expertGlovesPrice = 500;
	
	public static int 
	 		daggerAttack = 15, knifeAttackSpeed = 10, javelinCriticalChance = 8,
			vampireAttack = 8, vampireLifesteal = 8,
			ironHuntingBowAttack = 10, ironHuntingBowCDR = 5,
			mysteryCodexMagic = 15, powerCrystalMana = 280, magicNecklaceManaRegen = 2,
			bookOfSagesMagicPower = 8, bookOfSagesCDR = 5,
			leatherJerkinPhysicalDefense = 14, magicCloakMagicalDefense = 14,
			vitalityCrystalHP = 230, healingNecklaceHPRegen = 4,
			herosRingHP = 150, herosRingCDR = 5,
			bootsMovementSpeed = 20, expertGlovesAdaptiveAttack = 30;

    public static double 
    		goldPerAttack, goldPerAttackSpeed, goldPerCriticalChance, 
            goldPerLifesteal, goldPerCDR_Physcial, goldPerMagicPower, 
            goldPerMana, goldPerManaRegen, goldPerCDR_Magical, 
            goldPerPhysicalDefense, goldPerMagicDefense, goldPerHP, 
            goldPerHPRegen, goldPerCDR_Defense, goldPerMovementSpeed, 
            goldPerAdaptiveAttack;
    
	public static void main(String[] args) {
		// --- Physical ---
		goldPerAttack 					= (double) daggerPrice / daggerAttack;
		goldPerAttackSpeed 				= (double) knifePrice / knifeAttackSpeed;
		goldPerCriticalChance 			= (double) javelinPrice / javelinCriticalChance;
		
		double attackValueInMallet 		= vampireAttack * goldPerAttack;
		goldPerLifesteal 				= (vampireMalletPrice - attackValueInMallet) / vampireLifesteal;
		
		double attackValueInBow 		= ironHuntingBowAttack * goldPerAttack;
		goldPerCDR_Physcial				= (ironHuntingBowPrice - attackValueInBow) / ironHuntingBowCDR;
		
		// --- Magic ---
		goldPerMagicPower 				= (double) mysteryCodexPrice / mysteryCodexMagic;
		goldPerMana 					= (double) powerCrystalPrice / powerCrystalMana;
		goldPerManaRegen				= (double) magicNecklacePrice / magicNecklaceManaRegen;
		
		double magicInBook 				= bookOfSagesMagicPower * goldPerMagicPower;
		goldPerCDR_Magical				= (bookOfSagesPrice - magicInBook) / bookOfSagesCDR;
		
		// --- Defense ---
		goldPerPhysicalDefense 			= (double) leatherJerkinPrice / leatherJerkinPhysicalDefense;
		goldPerMagicDefense 			= (double) magicResistCloakPrice / magicCloakMagicalDefense;
		goldPerHP 						= (double) vitalityCrystalPrice / vitalityCrystalHP;
		goldPerHPRegen 					= (double) healingNecklacePrice / healingNecklaceHPRegen;
		
		double hpInRing 				= herosRingHP * goldPerHP;
		goldPerCDR_Defense 				= (herosRingPrice - hpInRing) / herosRingCDR;

		// --- Movement & Adaptive ---
		goldPerMovementSpeed			= (double) bootsPrice / bootsMovementSpeed;
		goldPerAdaptiveAttack 			= (double) expertGlovesPrice / expertGlovesAdaptiveAttack;
	}
}