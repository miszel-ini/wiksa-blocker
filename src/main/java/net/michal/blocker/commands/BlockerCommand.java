package net.michal.blocker.commands;

import net.michal.blocker.WiksaBlocker;
import net.michal.blocker.helper.ChatHelper;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BlockerCommand implements CommandExecutor {

    WiksaBlocker instance = WiksaBlocker.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;

        if(player.isOp() || player.hasPermission("blocker.reload")) {
           if(args.length == 1) {
               if(args[0].equalsIgnoreCase("reload")) {
                   instance.reloadConfig();

                   ChatHelper.sendChatMessage(player, instance.getConfig().getString("reload-plugin"));
               }
           } else {
               ChatHelper.sendChatMessage(player, instance.getConfig().getString("correct-usage"));
           }
        }
        return false;
    }
}
