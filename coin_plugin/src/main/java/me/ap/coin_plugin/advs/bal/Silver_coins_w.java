package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;

public class Silver_coins_w extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "silver_coins_w");


  public Silver_coins_w(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.FIREWORK_STAR, "§7§o§l10 Silver coins", AdvancementFrameType.GOAL, true, false, x, y , "§a§o§lDeposit"), parent, 1);
  }
}