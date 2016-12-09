package com.snowgears.grapplinghook.event;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class PlayerGrappleEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private Entity entity;
    private Location location;
    private ItemStack hookItem;
    //	    private String message;
    private boolean cancelled = false;

    public PlayerGrappleEvent(Player currentPlayer, Entity currentEntity, Location currentLocation) {
        player = currentPlayer;
        entity = currentEntity;
        location = currentLocation;
        hookItem = currentPlayer.getInventory().getItemInMainHand();
    }

    public Player getPlayer() {
        return player;
    }

    public Entity getPulledEntity() {
        return entity;
    }

    public Location getLocation() {
        return location;
    }

    public ItemStack getHookItem() {
        return hookItem;
    }

//	    public String getMessage(){
//	    	return message;
//	    }
//	    
//	    public void setMessage(String s){
//	    	message = s;
//	    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean set) {
        cancelled = set;
    }
}
