package com.detcat.mobdisguise;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MobDisguise extends JavaPlugin {

    private static Logger logger;

    @Override
    public void onLoad() {
        logger = getLogger();
    }

    @Override
    public void onEnable() {
        logger.log(Level.INFO, String.format("MobDisguise %s enabled.", getDescription().getVersion()));
    }

    @Override
    public void onDisable() {
        logger.log(Level.INFO, "MobDisguise disabled.");
    }

}
