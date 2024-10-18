package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;

public class Withdraw extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "withdraw");


  public Withdraw(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.RED_STAINED_GLASS_PANE, "§c§o§lWithdraw", AdvancementFrameType.CHALLENGE, true, false, x, y , "§f§oTake out all coins from balance."), parent, 1);
  }
}