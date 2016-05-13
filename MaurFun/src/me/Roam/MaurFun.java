package me.Roam;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MaurFun extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		
		getLogger().info("Enabling MaurFun by Roam!");
        
	}
	
	
	@Override
	public void onDisable () {
		getLogger().info("Disabling MaurFun by Roam!");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {

		Player player = (Player) sender;

		if(cmd.getName().equalsIgnoreCase("firework")) {
			if(!sender.hasPermission("maurfun.firework")) {
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
				sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot Launch a Firework!");
			return true;
			}
				if(args.length == 0) {
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Usage: /firework (red; green; coal; gold; diamond; vim)");
				return true;
			}
			if(args.length > 1) {
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Too many arguments!");
				return true;
				}
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("coal")) {
					if(!player.hasPermission("maurfun.firework.coal")){		
						player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
						player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot launch a firework!");					
					return true;
					}		
					Firework f = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
					FireworkMeta fm = f.getFireworkMeta();
					fm.addEffects(FireworkEffect.builder().withColor(Color.BLACK).flicker(true).trail(true).withFade(Color.BLACK).build());
					sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "Du sendte et fyrverkeri!");
					player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "You Launched a Firework!");
				fm.setPower(2);
				f.setFireworkMeta(fm);
				return true;
			}
		if(args[0].equalsIgnoreCase("gold")) {
			if(!player.hasPermission("maurfun.firework.gold")){								
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot launch a firework!");					
				return true;
				}		
			Firework f = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
			FireworkMeta fm = f.getFireworkMeta();
			fm.addEffects(FireworkEffect.builder().withColor(Color.YELLOW).flicker(true).trail(true).withFade(Color.YELLOW).build());
			sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "Du sendte et fyrverkeri!");
			player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "You Launched a Firework!");
			fm.setPower(2);
			f.setFireworkMeta(fm);
			return true;
		}
		if(args[0].equalsIgnoreCase("diamond")) {
			if(!player.hasPermission("maurfun.firework.diamond")){								
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot launch a firework!");					
				return true;
				}		
			Firework f = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
			FireworkMeta fm = f.getFireworkMeta();
			fm.addEffects(FireworkEffect.builder().withColor(Color.BLUE).flicker(true).trail(true).withFade(Color.BLUE).build());
			sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "Du sendte et fyrverkeri!");
			player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "You Launched a Firework!");
			fm.setPower(2);
			f.setFireworkMeta(fm);
			return true;
		}
		if(args[0].equalsIgnoreCase("red")) {
			if(!player.hasPermission("maurfun.firework.red")){								
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot launch a firework!");					
				return true;
				}		
			Firework f = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
			FireworkMeta fm = f.getFireworkMeta();
			fm.addEffects(FireworkEffect.builder().withColor(Color.RED).flicker(true).trail(true).withFade(Color.RED).build());
			sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "Du sendte et fyrverkeri!");
			player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "You Launched a Firework!");
			fm.setPower(2);
			f.setFireworkMeta(fm);
			return true;
		}
		if(args[0].equalsIgnoreCase("green")) {
			if(!player.hasPermission("maurfun.firework.green")){								
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot launch a firework!");					
				return true;
				}		
			Firework f = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
			FireworkMeta fm = f.getFireworkMeta();
			fm.addEffects(FireworkEffect.builder().withColor(Color.GREEN).flicker(true).trail(true).withFade(Color.GREEN).build());
			sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "Du sendte et fyrverkeri!");
			player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "You Launched a Firework!");
			fm.setPower(2);
			f.setFireworkMeta(fm);
			return true;
		}
		if(args[0].equalsIgnoreCase("vim")) {
			if(!player.hasPermission("maurfun.firework.vim")){								
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Du kan ikke sende det fyrverkeriet!");
				player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "You cannot launch a firework!");					
				return true;
				}		
			Firework f = (Firework) player.getWorld().spawn(player.getLocation(), Firework.class);
			FireworkMeta fm = f.getFireworkMeta();
			fm.addEffects(FireworkEffect.builder().withColor(Color.PURPLE).flicker(true).trail(true).withFade(Color.PURPLE).build());
			sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "Du sendte et fyrverkeri!");
			player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.LIGHT_PURPLE + "You Launched a Firework!");
			fm.setPower(2);
			f.setFireworkMeta(fm);
			return true;
			}
		else{
			player.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Maur" + ChatColor.RED + "Fun" + ChatColor.DARK_AQUA + "] " + ChatColor.RED + "Invalid Argument!");
			return true;
			}		
		}
		}
	return false;
}
}