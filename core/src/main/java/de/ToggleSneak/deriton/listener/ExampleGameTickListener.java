package de.ToggleSneak.deriton.listener;

import com.google.inject.Inject;
import de.ToggleSneak.deriton.ToggleSneak;
import net.labymod.api.event.Phase;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.lifecycle.GameTickEvent;

public class ExampleGameTickListener {

  private final ToggleSneak addon;

  @Inject
  private ExampleGameTickListener(ToggleSneak addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onGameTick(GameTickEvent event) {
    if (event.phase() != Phase.PRE) {
      return;
    }


    //this.addon.logger().info(this.addon.configuration().enabled().get() ? "enabled" : "disabled");
  }
}
