package io.vulpine.lib.fa;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class FABrandIcon extends FAIcon
{
  private final ObjectProperty< FABrandGlyph > glyph;

  public FABrandIcon()
  {
    super("Font Awesome 5 Brands");

    this.glyph = new SimpleObjectProperty<>();
    this.glyph.addListener(this::popText);
  }

  public FABrandGlyph getGlyph() { return glyph.get(); }
  public ObjectProperty < FABrandGlyph > glyphProperty() { return glyph; }
  public void setGlyph(final FABrandGlyph glyph) { this.glyph.set(glyph); }
}
