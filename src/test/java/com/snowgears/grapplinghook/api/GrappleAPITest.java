package com.snowgears.grapplinghook.api;

import org.bukkit.inventory.ItemStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrappleAPITest {
    @Test
    public void isGrapple() throws Exception {
        ItemStack itemStack = null;
        assertFalse(GrappleAPI.isGrapple(itemStack));
    }

}