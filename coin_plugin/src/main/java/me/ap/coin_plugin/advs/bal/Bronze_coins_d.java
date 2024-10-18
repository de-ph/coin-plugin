package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;

public class Bronze_coins_d extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "bronze_coins_d");


  public Bronze_coins_d(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.FIRE_CHARGE, "§4§o§l10 Bronze coin", AdvancementFrameType.CHALLENGE, true, false, x, y , "§c§o§lWithdraw"), parent, 1);
  }
}