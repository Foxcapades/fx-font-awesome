package io.vulpine.lib.fa;

import javafx.scene.text.Font;

public final class FontAwesome
{
  private FontAwesome() {}

  public static void Load() {
    Font.loadFont(FontAwesome.class.getResourceAsStream("/fa-solid-900.ttf"), 24);
    Font.loadFont(FontAwesome.class.getResourceAsStream("/fa-regular-400.ttf"), 24);
    Font.loadFont(FontAwesome.class.getResourceAsStream("/fa-brands-400.ttf"), 24);
  }
}
