package me.dollarmc.spigottutorial.commands;

import org.bukkit.ChatColor;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class DieCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
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
}
