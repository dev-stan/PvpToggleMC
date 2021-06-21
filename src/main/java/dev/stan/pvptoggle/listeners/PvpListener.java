package dev.stan.pvptoggle.listeners;

import dev.stan.pvptoggle.PvpToggle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageEvent;

public class PvpListener {

    private final PvpToggle plugin;
    public PvpListener(PvpToggle plugin) {

        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onTestEntityDamage(final EntityDamageEvent e) {

        if (!(e.getEntity() instanceof Player)) return;
        Player player = (Player) e.getEntity();

        // Do nothing if player has pvp enabled
        if (plugin.status.get(player.getUniqueId())) return;
        // If pvp is disabled cancel damage event
        else {
            e.setCancelled(true);
        }
    }
}
