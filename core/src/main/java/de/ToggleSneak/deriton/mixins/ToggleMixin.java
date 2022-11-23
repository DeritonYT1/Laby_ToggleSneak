package de.ToggleSneak.deriton.mixins;

import net.labymod.api.client.Minecraft;
import net.labymod.api.client.entity.LivingEntity ;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(Entity.class)
public class ToggleMixin {

  @Inject(method = "processKeyShift")

}
