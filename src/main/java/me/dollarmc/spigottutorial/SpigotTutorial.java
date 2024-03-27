package me.dollarmc.spigottutorial;

import me.dollarmc.spigottutorial.listeners.OnLeaveBedListener;
import me.dollarmc.spigottutorial.listeners.OnPlayerJoinListener;
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
        getServer().getPluginManager().registerEvents(new OnPlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new OnLeaveBedListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}
