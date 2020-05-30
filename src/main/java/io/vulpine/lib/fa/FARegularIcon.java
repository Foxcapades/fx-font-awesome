package io.vulpine.lib.fa;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class FARegularIcon extends FAIcon
{
  private final ObjectProperty< FARegularGlyph > glyph;

  public FARegularIcon()
  {
    super("Font Awesome 5 Free Regular");

    this.glyph = new SimpleObjectProperty<>();
    this.glyph.addListener(this::popText);
  }

  public FARegularGlyph getGlyph() { return glyph.get(); }
  public ObjectProperty < FARegularGlyph > glyphProperty() { return glyph; }
  public void setGlyph(final FARegularGlyph glyph) { this.glyph.set(glyph); }
}
