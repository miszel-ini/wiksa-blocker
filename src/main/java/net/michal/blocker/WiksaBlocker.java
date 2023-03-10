package net.michal.blocker;

import net.michal.blocker.listener.BlockCommandListener;
import org.bukkit.plugin.java.JavaPlugin;

public class WiksaBlocker extends JavaPlugin {

    WiksaBlocker instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();
        reloadConfig();

        getServer().getPluginManager().registerEvents(new BlockCommandListener(), this);
    }

    public static WiksaBlocker getInstance() {
        return instance;
    }
}
