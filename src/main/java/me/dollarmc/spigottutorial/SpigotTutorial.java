package me.dollarmc.spigottutorial;

import me.dollarmc.spigottutorial.commands.DieCommand;
import me.dollarmc.spigottutorial.commands.FeedCommand;
import me.dollarmc.spigottutorial.commands.GodCommand;
import me.dollarmc.spigottutorial.listeners.OnLeaveBedListener;
import me.dollarmc.spigottutorial.listeners.OnPlayerJoinLeaveListener;
import me.dollarmc.spigottutorial.listeners.ShearSheepListener;
import me.dollarmc.spigottutorial.listeners.XPBottleBreakListener;
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
        // Register commands
        getCommand("god").setExecutor(new GodCommand());
        getCommand("die").setExecutor(new DieCommand());
        getCommand("feed").setExecutor(new FeedCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}
