package de.ToggleSneak.deriton;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;

@SuppressWarnings("FieldMayBeFinal")
@ConfigName("settings")
public class ToggleSneakConfiguration extends AddonConfig {

  @SettingSection("toggles")
  @SwitchSetting
  private ConfigProperty<Boolean> tsn_enabled = new ConfigProperty<>(true);

  @SwitchSetting
  private ConfigProperty<Boolean> tsn_use_shift = new ConfigProperty<>(false);

  @KeyBindSetting
  private ConfigProperty<Key> tsn_use_ownkey = new ConfigProperty<>(Key.LSHIFT);

  @SwitchSetting
  private ConfigProperty<Boolean> tsp_enabled = new ConfigProperty<>(false);


  @SwitchSetting
  private ConfigProperty<Boolean> fb_enabled = new ConfigProperty<>(false);

  @SettingSection("values")
  @SliderSetting(min = 1, max = 10)
  private ConfigProperty<Integer> fb_value = new ConfigProperty<>(1);



  @Override
  public ConfigProperty<Boolean> enabled() {
    return this.tsn_enabled;
  }

  public ConfigProperty<Boolean> tsn_enabled() {
    return tsn_enabled;
  }

  public ConfigProperty<Boolean> tsp_enabled() {
    return tsp_enabled;
  }

  public boolean getKey(Key akey) {
    if(tsn_use_shift.equals(true)) {
      return (akey.equals(Key.LSHIFT) || akey.equals(Key.RSHIFT)) ? true : false;
    } else {
      return (akey.equals(tsn_use_ownkey)) ? true : false;
    }
  }
}
