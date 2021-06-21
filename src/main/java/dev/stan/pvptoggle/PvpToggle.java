package dev.stan.pvptoggle;

import dev.stan.pvptoggle.listeners.PvpListener;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class PvpToggle extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin sucesfully enabled");

        getServer().getPluginManager().registerEvents((Listener) new PvpListener(this), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    // Contains info whether pvp for player is on or off
    public HashMap<UUID, Boolean> status = new HashMap<UUID, Boolean>();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("pvp on")) {

            // Loop through all players and check if given value is invalid
            for (Player p: Bukkit.getOnlinePlayers()) {

                if (args[0].contains(p.toString())) {

                    // Change pvp for args player
                    status.put(p.getUniqueId(), true);
                } else {

                    // Change pvp for command sender
                    status.put(player.getUniqueId(), true);
                }
            }
        }

        if (cmd.getName().equalsIgnoreCase("pvp off")) {

            // Loop through all players and check if given value is invalid
            for (Player p: Bukkit.getOnlinePlayers()) {

                if (args[0].contains(p.toString())) {

                    // Change pvp for args player
                    status.put(p.getUniqueId(), false);
                } else {

                    // Change pvp for command sender
                    status.put(player.getUniqueId(), false);
                }
            }
        }
        return false;
    }
}
