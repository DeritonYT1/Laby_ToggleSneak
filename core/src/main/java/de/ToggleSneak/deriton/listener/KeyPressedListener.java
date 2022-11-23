package de.ToggleSneak.deriton.listener;

import com.google.inject.Inject;
import net.kyori.adventure.key.Key;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.input.KeyEvent;
import de.ToggleSneak.deriton.ToggleSneak;
import org.spongepowered.asm.mixin.injection.At.Shift;

public class KeyPressedListener {

  private final ToggleSneak addon;

  @Inject
  private KeyPressedListener(ToggleSneak addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onPress(KeyEvent event) {
    if(addon.configuration().getKey (event.key()) ) { //  == Key.LSHIFT || event.key() == Key.RSHIFT) && addon.configuration().tsn_enabled().get() && event.state() == State.PRESS
      this.addon.logger().info("Sneak got pressed");
    }



    /*if (event.key() == Key.LSHIFT || event.key() == Key.RSHIFT && addon.configuration().tsn_enabled().get() == true) {
    }
    */
    /*if(event.key() == Sprin && addon.configuration().tsp_enabled().get()) {

    }
*/

    //this.addon.logger().info(this.addon.configuration().enabled().get() ? "enabled" : "disabled");
  }

}
