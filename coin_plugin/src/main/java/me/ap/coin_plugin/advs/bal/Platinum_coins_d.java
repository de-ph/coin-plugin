package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;

public class Platinum_coins_d extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "platinum_coins_d");


  public Platinum_coins_d(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.IRON_NUGGET, "§3§o§l10 Platinum coins", AdvancementFrameType.GOAL, true, false, x, y , "§a§o§lDeposit"), parent, 1);
  }
}