package me.dollarmc.spigottutorial;

import me.dollarmc.spigottutorial.listeners.OnLeaveBedListener;
import me.dollarmc.spigottutorial.listeners.OnPlayerJoinLeaveListener;
import me.dollarmc.spigottutorial.listeners.ShearSheepListener;
import me.dollarmc.spigottutorial.listeners.XPBottleBreakListener;
import org.bukkit.ChatColor;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Started");
        // Register events
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new OnLeaveBedListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Executes given command
        // /die - kills the player
        if (command.getName().equalsIgnoreCase("die")) {
            if (sender instanceof Player) {
                Player p = (Player) sender; //cast into player object
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "You took the easy way out.");
            }
            else if(sender instanceof ConsoleCommandSender){
                System.out.println("The command was sent by the console");
            }
            else if(sender instanceof CommandBlock){
                System.out.println("The command was sent by a command block");
            }
        }
        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}
