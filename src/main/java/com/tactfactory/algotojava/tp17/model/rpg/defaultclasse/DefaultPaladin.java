package com.tactfactory.algotojava.tp17.model.rpg.defaultclasse;

import com.tactfactory.algotojava.tp17.model.Arme;
import com.tactfactory.algotojava.tp17.model.ArmeMagique;
import com.tactfactory.algotojava.tp17.model.ArmeMixte;
import com.tactfactory.algotojava.tp17.model.Armure;
import com.tactfactory.algotojava.tp17.model.ArmureMagique;
import com.tactfactory.algotojava.tp17.model.ArmureMixte;
import com.tactfactory.algotojava.tp17.model.rpg.Classe;
import com.tactfactory.algotojava.tp17.model.rpg.Paladin;

public class DefaultPaladin extends DefaultFighter implements Paladin {
	
	@Override
	public boolean isEquipable(Arme arme) {
		boolean result = false;
		if (arme instanceof ArmeMixte || arme instanceof ArmeMagique) {
			result = true;
		}
		return result;
	}

	@Override
	public boolean isEquipable(Armure armure) {
		boolean result = false;
		if (armure instanceof ArmureMixte || armure instanceof ArmureMagique) {
			result = true;
		}
		return result;
	}
	
	@Override
	public String getArmorRestriction() {
		return String.format(Classe.EQUIPARMOR, Paladin.CLASSE, Paladin.EQUIPARMOR);
	}

	@Override
	public String getWeaponRestriction() {
		return String.format(Classe.EQUIPWEAPON, Paladin.CLASSE, Paladin.EQUIPWEAPON);
	}
}
