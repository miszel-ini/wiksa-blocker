package net.michal.blocker;

import net.michal.blocker.commands.BlockerCommand;
import net.michal.blocker.listener.BlockCommandListener;
import org.bukkit.plugin.java.JavaPlugin;

public class WiksaBlocker extends JavaPlugin {

    static WiksaBlocker instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();
        reloadConfig();

        getCommand("blocker").setExecutor(new BlockerCommand());

        getServer().getPluginManager().registerEvents(new BlockCommandListener(), this);
    }

    public static WiksaBlocker getInstance() {
        return instance;
    }
}
