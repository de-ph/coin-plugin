package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
public class Bronze_coin_d extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "bronze_coin_d");


  public Bronze_coin_d(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.FIRE_CHARGE, "§4§o§lBronze coin", AdvancementFrameType.CHALLENGE, true, false, x, y , "§c§o§lWithdraw"), parent, 1);
  }
}