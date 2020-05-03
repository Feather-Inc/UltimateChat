package br.net.fabiozumbi12.UltimateChat.Bukkit.hooks;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.dynmap.DynmapAPI;

import static org.bukkit.Bukkit.getServer;

public class UCDynmap {

    public static void sendToWeb(CommandSender sender, String message){
        Plugin p = getServer().getPluginManager().getPlugin("dynmap");
        if (p != null && p.isEnabled() && sender instanceof Player){
            ((DynmapAPI) p).postPlayerMessageToWeb((Player)sender, message);
        }
    }
}
