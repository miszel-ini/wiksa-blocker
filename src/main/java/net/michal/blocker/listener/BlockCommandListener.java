package net.michal.blocker.listener;

import net.michal.blocker.WiksaBlocker;
import net.michal.blocker.helper.ChatHelper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class BlockCommandListener implements Listener {

    WiksaBlocker instance = WiksaBlocker.getInstance();

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String command = event.getMessage();

        if(player.isOp() || player.hasPermission("blocker.commands")) {
            event.setCancelled(false);

        } else {
            if(instance.getConfig().getStringList("commands").contains(command)) {
                event.setCancelled(true);

                ChatHelper.sendChatMessage(player, instance.getConfig().getString("command-blocked"));
            }
        }
    }
}
