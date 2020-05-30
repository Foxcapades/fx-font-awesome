package io.vulpine.lib.fa;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class FASolidIcon extends FAIcon
{
  private final ObjectProperty < FASolidGlyph > glyph;

  public FASolidIcon()
  {
    super("Font Awesome 5 Free Solid");

    this.glyph = new SimpleObjectProperty<>();
    this.glyph.addListener(this::popText);
  }

  public FASolidGlyph getGlyph() { return glyph.get(); }
  public ObjectProperty < FASolidGlyph > glyphProperty() { return glyph; }
  public void setGlyph(final FASolidGlyph glyph) { this.glyph.set(glyph); }
}
