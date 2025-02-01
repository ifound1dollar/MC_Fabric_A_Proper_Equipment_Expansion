package net.dollar.apex.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.util.math.random.Random;

@Environment(EnvType.CLIENT)
public class MysteriousSpecterRenderState extends BipedEntityRenderState {
    private final int textureID;

    public MysteriousSpecterRenderState() {
        //Set textureID to a value between 0-4, which is used to determine which texture to render.
        textureID = Random.create().nextInt(5);
    }


    /**
     * Gets the textureID field (in range of 0-4), which will determine which texture to load for the
     *  Entity associated with this RenderState instance.
     * @return The textureID field value
     */
    public int getTextureID() {
        return textureID;
    }
}
