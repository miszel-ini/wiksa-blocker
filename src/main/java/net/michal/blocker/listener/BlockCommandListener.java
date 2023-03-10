package net.michal.blocker.listener;

import net.michal.blocker.WiksaBlocker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class BlockCommandListener implements Listener {

    WiksaBlocker instance = WiksaBlocker.getInstance();

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {

    }
}
