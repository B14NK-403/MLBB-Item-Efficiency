package mobileLegends;

public class GoldEfficiencyT1 {

    public static void main(String[] args) {
    	
    	GoldValue.main(args);
    	
        System.out.println("--- TIER 1 GOLD EFFICIENCY ---");
        
        // --- Physical ---
        // Dagger
        double daggerGoldValue = GoldValue.daggerAttack * GoldValue.goldPerAttack;
        calculateEfficiency("Dagger", GoldValue.daggerPrice, daggerGoldValue);

        // Knife
        double knifeGoldValue = GoldValue.knifeAttackSpeed * GoldValue.goldPerAttackSpeed;
        calculateEfficiency("Knife", GoldValue.knifePrice, knifeGoldValue);

        // Javelin
        double javelinGoldValue = GoldValue.javelinCriticalChance * GoldValue.goldPerCriticalChance;
        calculateEfficiency("Javelin", GoldValue.javelinPrice, javelinGoldValue);
        
        // Vampire Mallet
        double vampireMalletGoldValue = GoldValue.vampireAttack * GoldValue.goldPerAttack + GoldValue.vampireLifesteal * GoldValue.goldPerLifesteal;
        calculateEfficiency("Vampire Mallet", GoldValue.vampireMalletPrice, vampireMalletGoldValue);
        
        // Iron Hunting Bow
        double ironHuntingBowGoldValue = GoldValue.ironHuntingBowAttack * GoldValue.goldPerAttack + GoldValue.ironHuntingBowCDR * GoldValue.goldPerCDR_Physcial;
        calculateEfficiency("Iron Hunting Bow", GoldValue.ironHuntingBowPrice, ironHuntingBowGoldValue);
        
        // --- Magical ---
        // Mystery Codex
        double mysteryCodexGoldValue = GoldValue.mysteryCodexMagic * GoldValue.goldPerMagicPower;
        calculateEfficiency("Myster Codex", GoldValue.mysteryCodexPrice, mysteryCodexGoldValue);
        
        // Power Crystal
        double powerCrystalGoldValue = GoldValue.powerCrystalMana * GoldValue.goldPerMana;
        calculateEfficiency("Power Crystal", GoldValue.powerCrystalPrice, powerCrystalGoldValue);
        
        // Magic Necklace
        double magicNecklaceGoldValue = GoldValue.magicNecklaceManaRegen * GoldValue.goldPerManaRegen;
        calculateEfficiency("Magic Necklace", GoldValue.magicNecklacePrice, magicNecklaceGoldValue);
        
        // Book Of Sages
        double bookOfSagesGoldValue = GoldValue.bookOfSagesMagicPower * GoldValue.goldPerMagicPower + GoldValue.bookOfSagesCDR * GoldValue.goldPerCDR_Magical;
        calculateEfficiency("Book Of Sages", GoldValue.bookOfSagesPrice, bookOfSagesGoldValue);
        
        // --- Defense ---
        // Vitality Crystal
        double vitalityCrystalGoldValue = GoldValue.vitalityCrystalHP * GoldValue.goldPerHP;
        calculateEfficiency("Vitality Crystal", GoldValue.vitalityCrystalPrice, vitalityCrystalGoldValue);
        
        // Leather Jerkin
        double leatherJerkinGoldValue = GoldValue.leatherJerkinPhysicalDefense * GoldValue.goldPerPhysicalDefense;
        calculateEfficiency("Leather Jerkin", GoldValue.leatherJerkinPrice, leatherJerkinGoldValue);
        
        // Magic Resist Cloak
        double magicResistCloak = GoldValue.magicCloakMagicalDefense * GoldValue.goldPerMagicDefense;
        calculateEfficiency("Magic Resist Cloak", GoldValue.magicResistCloakPrice, magicResistCloak);
        
        // Healing Necklace
        double healingNecklace = GoldValue.healingNecklaceHPRegen * GoldValue.goldPerHPRegen;
        calculateEfficiency("Healing Necklace", GoldValue.healingNecklacePrice, healingNecklace);
        
        // --- Adaptive & Movement ---
        // Boots
        double bootsGoldValue = GoldValue.bootsMovementSpeed * GoldValue.goldPerMovementSpeed;
        calculateEfficiency("Boots", GoldValue.bootsPrice, bootsGoldValue);
        
        // Expert Gloves
        double expertGlovesGoldValue = GoldValue.expertGlovesAdaptiveAttack * GoldValue.goldPerAdaptiveAttack;
        calculateEfficiency("Expert Gloves", GoldValue.expertGlovesPrice, expertGlovesGoldValue);
    }

    public static void calculateEfficiency(String itemName, int itemPrice, double goldValue) {
        double efficiency = (goldValue / itemPrice) * 100;
        System.out.printf("%-20s | Price: %d | Efficiency: %.2f%%%n", itemName, itemPrice, efficiency);
    }
}
