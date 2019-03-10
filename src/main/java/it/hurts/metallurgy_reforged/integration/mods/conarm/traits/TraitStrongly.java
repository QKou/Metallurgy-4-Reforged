package it.hurts.metallurgy_reforged.integration.mods.conarm.traits;

import c4.conarm.lib.traits.AbstractArmorTraitLeveled;
import it.hurts.metallurgy_reforged.integration.mods.conarm.MetallurgyConArmorStats;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class TraitStrongly extends AbstractArmorTraitLeveled{
	
	private int levels;

	public TraitStrongly(int levels) {
		super("strongly", String.valueOf(levels), 0xffffff, 2, levels);
		
		this.levels = levels;
	}
	
	@SubscribeEvent
	public void onArmorTick(PlayerTickEvent event){
		if(MetallurgyConArmorStats.isThatArmorTraitLeveled(event.player, "strongly", 2)) {
			event.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 60, levels, false, false));
			System.out.println("Levels " + levels);
			
		}
	}

}