package de.ToggleSneak.deriton;

import com.google.inject.Singleton;
import de.ToggleSneak.deriton.listener.ExampleGameTickListener;
import de.ToggleSneak.deriton.listener.KeyPressedListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonListener;
import de.ToggleSneak.deriton.commands.ExamplePingCommand;

@Singleton
@AddonListener
public class ToggleSneak extends LabyAddon<ToggleSneakConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.registerListener(KeyPressedListener.class);
    this.registerListener(ExampleGameTickListener.class);
    this.registerCommand(ExamplePingCommand.class);

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<ToggleSneakConfiguration> configurationClass() {
    return ToggleSneakConfiguration.class;
  }
}
