package dev.stan.pvptoggle.listeners;

import dev.stan.pvptoggle.PvpToggle;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class PvpListener {

    private final PvpToggle plugin;
    public PvpListener(PvpToggle plugin) {

        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onEntityDamage(final EntityDamageByEntityEvent e) {

        // Check if attacker and damager and Players if not return if yes declare vars
        if (!(e.getEntity() instanceof Player) && !(e.getDamager() instanceof Player)) return;
        Player defender = (Player) e.getEntity();
        Player damager = (Player) e.getDamager();

        // Do nothing if defender and damager has pvp enabled
        if (plugin.status.get(defender.getUniqueId()) && (plugin.status.get(damager.getUniqueId()))) return;
        // If defender has pvp disabled do some shti
        if (!plugin.status.get(defender.getUniqueId())) {

            // Cancel event and throw error to attacker
            e.setCancelled(true);
            damager.sendMessage(ChatColor.RED.getName() + defender.getName() + "has PVP disabled, you cannot attack him.");
        }
    }
}
