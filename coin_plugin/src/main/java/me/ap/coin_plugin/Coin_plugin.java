package me.ap.coin_plugin;

import com.fren_gor.ultimateAdvancementAPI.AdvancementTab;
import com.fren_gor.ultimateAdvancementAPI.UltimateAdvancementAPI;
import com.fren_gor.ultimateAdvancementAPI.advancement.RootAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.events.PlayerLoadingCompletedEvent;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import com.fren_gor.ultimateAdvancementAPI.util.CoordAdapter;
import me.ap.coin_plugin.advs.AdvancementTabNamespaces;
import me.ap.coin_plugin.advs.bal.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Coin_plugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this,this);
        initializeTabs();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onJoin(PlayerLoadingCompletedEvent e){
        Player p = e.getPlayer();
        bal.showTab(p);
    }

    public static UltimateAdvancementAPI api;
    public AdvancementTab bal;

    public void initializeTabs() {
        api = UltimateAdvancementAPI.getInstance(this);
        bal = api.createAdvancementTab(AdvancementTabNamespaces.bal_NAMESPACE);
        AdvancementKey balanceKey = new AdvancementKey(bal.getNamespace(), "balance");
        CoordAdapter adapterbal = CoordAdapter.builder().add(balanceKey, -1.25f, 0f).add(Deposit.KEY, 0f, -1f).add(Withdraw.KEY, 0f, 1f).add(Platinum_coin_d.KEY, 1.25f, -1.5f).add(Platinum_coins_d.KEY, 1.25f, -0.5f).add(Platinum_coin_w.KEY, 1.25f, 0.5f).add(Platinum_coins_w.KEY, 1.25f, 1.5f).add(Gold_coins_d.KEY, 2.5f, -0.5f).add(Gold_coin_d.KEY, 2.5f, -1.5f).add(Silver_coins_w.KEY, 3.75f, -0.5f).add(Silver_coin_w.KEY, 3.75f, -1.5f).add(Bronze_coins_w.KEY, 5f, -0.5f).add(Bronze_coin_w.KEY, 5f, -1.5f).add(Gold_coin_w.KEY, 2.5f, 0.5f).add(Gold_coins_w.KEY, 2.5f, 1.5f).add(Silver_coin_d.KEY, 3.75f, 0.5f).add(Silver_coins_d.KEY, 3.75f, 1.5f).add(Bronze_coin_d.KEY, 5f, 0.5f).add(Bronze_coins_d.KEY, 5f, 1.5f).build();
        RootAdvancement balance = new RootAdvancement(bal, balanceKey.getKey(), new AdvancementDisplay(Material.HONEYCOMB, "§6§o§lBalance", AdvancementFrameType.GOAL, true, false, adapterbal.getX(balanceKey), adapterbal.getY(balanceKey), "§3§o§lp: §r§fadd §e§o§lg: §r§fadd §7§o§ls: §r§fadd §4§o§lb: §r§fadd"),"textures/block/bee_nest_front_honey.png",1);
        Deposit deposit = new Deposit(balance,adapterbal.getX(Deposit.KEY), adapterbal.getY(Deposit.KEY));
        Withdraw withdraw = new Withdraw(balance,adapterbal.getX(Withdraw.KEY), adapterbal.getY(Withdraw.KEY));
        Platinum_coin_d platinum_coin_d = new Platinum_coin_d(deposit,adapterbal.getX(Platinum_coin_d.KEY), adapterbal.getY(Platinum_coin_d.KEY));
        Platinum_coins_d platinum_coins_d = new Platinum_coins_d(deposit,adapterbal.getX(Platinum_coins_d.KEY), adapterbal.getY(Platinum_coins_d.KEY));
        Platinum_coin_w platinum_coin_w = new Platinum_coin_w(withdraw,adapterbal.getX(Platinum_coin_w.KEY), adapterbal.getY(Platinum_coin_w.KEY));
        Platinum_coins_w platinum_coins_w = new Platinum_coins_w(withdraw,adapterbal.getX(Platinum_coins_w.KEY), adapterbal.getY(Platinum_coins_w.KEY));
        Gold_coins_d gold_coins_d = new Gold_coins_d(platinum_coins_d,adapterbal.getX(Gold_coins_d.KEY), adapterbal.getY(Gold_coins_d.KEY));
        Gold_coin_d gold_coin_d = new Gold_coin_d(platinum_coins_d,adapterbal.getX(Gold_coin_d.KEY), adapterbal.getY(Gold_coin_d.KEY));
        Silver_coins_w silver_coins_w = new Silver_coins_w(gold_coins_d,adapterbal.getX(Silver_coins_w.KEY), adapterbal.getY(Silver_coins_w.KEY));
        Silver_coin_w silver_coin_w = new Silver_coin_w(gold_coins_d,adapterbal.getX(Silver_coin_w.KEY), adapterbal.getY(Silver_coin_w.KEY));
        Bronze_coins_w bronze_coins_w = new Bronze_coins_w(silver_coins_w,adapterbal.getX(Bronze_coins_w.KEY), adapterbal.getY(Bronze_coins_w.KEY));
        Bronze_coin_w bronze_coin_w = new Bronze_coin_w(silver_coins_w,adapterbal.getX(Bronze_coin_w.KEY), adapterbal.getY(Bronze_coin_w.KEY));
        Gold_coin_w gold_coin_w = new Gold_coin_w(platinum_coin_w,adapterbal.getX(Gold_coin_w.KEY), adapterbal.getY(Gold_coin_w.KEY));
        Gold_coins_w gold_coins_w = new Gold_coins_w(platinum_coin_w,adapterbal.getX(Gold_coins_w.KEY), adapterbal.getY(Gold_coins_w.KEY));
        Silver_coin_d silver_coin_d = new Silver_coin_d(gold_coin_w,adapterbal.getX(Silver_coin_d.KEY), adapterbal.getY(Silver_coin_d.KEY));
        Silver_coins_d silver_coins_d = new Silver_coins_d(gold_coin_w,adapterbal.getX(Silver_coins_d.KEY), adapterbal.getY(Silver_coins_d.KEY));
        Bronze_coin_d bronze_coin_d = new Bronze_coin_d(silver_coin_d,adapterbal.getX(Bronze_coin_d.KEY), adapterbal.getY(Bronze_coin_d.KEY));
        Bronze_coins_d bronze_coins_d = new Bronze_coins_d(silver_coin_d,adapterbal.getX(Bronze_coins_d.KEY), adapterbal.getY(Bronze_coins_d.KEY));
        bal.registerAdvancements(balance ,deposit ,withdraw ,platinum_coin_d ,platinum_coins_d ,platinum_coin_w ,platinum_coins_w ,gold_coins_d ,gold_coin_d ,silver_coins_w ,silver_coin_w ,bronze_coins_w ,bronze_coin_w ,gold_coin_w ,gold_coins_w ,silver_coin_d ,silver_coins_d ,bronze_coin_d ,bronze_coins_d );
        bal.automaticallyGrantRootAdvancement();
    }
}
