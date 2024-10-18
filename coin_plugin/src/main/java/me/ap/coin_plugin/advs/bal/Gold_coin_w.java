package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;

public class Gold_coin_w extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "gold_coin_w");


  public Gold_coin_w(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.GOLD_NUGGET, "§e§o§lGold coin", AdvancementFrameType.CHALLENGE, true, false, x, y , "§c§o§lWithdraw"), parent, 1);
  }
}