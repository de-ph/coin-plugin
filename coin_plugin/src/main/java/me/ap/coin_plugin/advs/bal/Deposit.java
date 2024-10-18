package me.ap.coin_plugin.advs.bal;

import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import org.bukkit.Material;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;

public class Deposit extends BaseAdvancement  {

  public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.bal_NAMESPACE, "deposit");


  public Deposit(Advancement parent, float x, float y) {
    super(KEY.getKey(), new AdvancementDisplay(Material.GREEN_STAINED_GLASS_PANE, "§a§o§lDeposit", AdvancementFrameType.GOAL, true, false, x, y , "§f§oStore all coins to balance."), parent, 1);
  }
}