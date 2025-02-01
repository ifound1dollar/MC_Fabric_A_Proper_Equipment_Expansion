package net.dollar.apex.entity.client;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.passive.Cracks;

public class ObsidianGolemRenderState extends LivingEntityRenderState {
    public float attackTicksLeft;
    public Cracks.CrackLevel crackLevel;

    public ObsidianGolemRenderState() {
        this.crackLevel = Cracks.CrackLevel.NONE;
    }
}
