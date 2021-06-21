package dev.stan.pvptoggle.commands;

import dev.stan.pvptoggle.PvpToggle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCMD {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("pvp help")) {

            player.sendMessage("test");
        }


        return false;
    }
}
