package me.paul90317.pratice;

import org.bukkit.plugin.java.JavaPlugin;

public final class Pratice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Good Bye World!!!");
    }
}
