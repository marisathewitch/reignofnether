package com.solegendary.ageofcraft.registrars;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.fmlclient.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

public class Keybinds {

    private static final String KEY_CATEGORY = "key.categories.ageofcraft";

    public static final KeyMapping escape = new KeyMapping("key.ageofcraft.orthoview.escape", GLFW.GLFW_KEY_ESCAPE, KEY_CATEGORY);
    public static final KeyMapping toggle = new KeyMapping("key.ageofcraft.orthoview.toggle", GLFW.GLFW_KEY_KP_5, KEY_CATEGORY);
    public static final KeyMapping zoomIn = new KeyMapping("key.ageofcraft.orthoview.zoomIn", GLFW.GLFW_KEY_KP_ADD, KEY_CATEGORY);
    public static final KeyMapping zoomOut = new KeyMapping("key.ageofcraft.orthoview.zoomOut", GLFW.GLFW_KEY_KP_SUBTRACT, KEY_CATEGORY);
    public static final KeyMapping panPlusX = new KeyMapping("key.ageofcraft.orthoview.panPlusZ", GLFW.GLFW_KEY_LEFT, KEY_CATEGORY);
    public static final KeyMapping panMinusX = new KeyMapping("key.ageofcraft.orthoview.panMinusZ", GLFW.GLFW_KEY_RIGHT, KEY_CATEGORY);
    public static final KeyMapping panPlusZ = new KeyMapping("key.ageofcraft.orthoview.panPlusX", GLFW.GLFW_KEY_UP, KEY_CATEGORY);
    public static final KeyMapping panMinusZ = new KeyMapping("key.ageofcraft.orthoview.panMinusX", GLFW.GLFW_KEY_DOWN, KEY_CATEGORY);
    public static final KeyMapping reset = new KeyMapping("key.ageofcraft.orthoview.reset", GLFW.GLFW_KEY_RIGHT_CONTROL, KEY_CATEGORY);
    public static final KeyMapping shiftMod = new KeyMapping("key.ageofcraft.orthoview.shiftMod", GLFW.GLFW_KEY_LEFT_SHIFT, KEY_CATEGORY);
    public static final KeyMapping ctrlMod = new KeyMapping("key.ageofcraft.orthoview.ctrlMod", GLFW.GLFW_KEY_LEFT_CONTROL, KEY_CATEGORY);
    public static final KeyMapping altMod = new KeyMapping("key.ageofcraft.orthoview.altMod", GLFW.GLFW_KEY_LEFT_ALT, KEY_CATEGORY);
    public static final KeyMapping keyP = new KeyMapping("key.ageofcraft.orthoview.keyP", GLFW.GLFW_KEY_P, KEY_CATEGORY);
    public static final KeyMapping keyO = new KeyMapping("key.ageofcraft.orthoview.keyO", GLFW.GLFW_KEY_O, KEY_CATEGORY);
    public static final KeyMapping keyA = new KeyMapping("key.ageofcraft.orthoview.keyA", GLFW.GLFW_KEY_A, KEY_CATEGORY);
    public static final KeyMapping keyS = new KeyMapping("key.ageofcraft.orthoview.keyS", GLFW.GLFW_KEY_S, KEY_CATEGORY);

    public static final KeyMapping[] nums = {
         new KeyMapping("key.ageofcraft.orthoview.key0", GLFW.GLFW_KEY_0, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key1", GLFW.GLFW_KEY_1, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key2", GLFW.GLFW_KEY_2, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key3", GLFW.GLFW_KEY_3, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key4", GLFW.GLFW_KEY_4, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key5", GLFW.GLFW_KEY_5, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key6", GLFW.GLFW_KEY_6, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key7", GLFW.GLFW_KEY_7, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key8", GLFW.GLFW_KEY_8, KEY_CATEGORY),
         new KeyMapping("key.ageofcraft.orthoview.key9", GLFW.GLFW_KEY_9, KEY_CATEGORY)
    };


    public static void init() {
        ClientRegistry.registerKeyBinding(escape);
        ClientRegistry.registerKeyBinding(toggle);
        ClientRegistry.registerKeyBinding(zoomIn);
        ClientRegistry.registerKeyBinding(zoomOut);
        ClientRegistry.registerKeyBinding(reset);
        ClientRegistry.registerKeyBinding(shiftMod);
        ClientRegistry.registerKeyBinding(ctrlMod);
        ClientRegistry.registerKeyBinding(altMod);
        ClientRegistry.registerKeyBinding(keyP);
        ClientRegistry.registerKeyBinding(keyO);
        ClientRegistry.registerKeyBinding(keyA);
        ClientRegistry.registerKeyBinding(keyS);

        for (KeyMapping keyMapping : nums)
            ClientRegistry.registerKeyBinding(keyMapping);
    }
}
