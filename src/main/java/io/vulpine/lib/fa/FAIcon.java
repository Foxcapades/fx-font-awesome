package io.vulpine.lib.fa;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class FAIcon extends Text
{
  private final String font;
  private final DoubleProperty size;

  public FAIcon(final String font)
  {
    this.font = font;
    this.size = new SimpleDoubleProperty();
    this.size.addListener(this::popFont);
    this.size.set(24);
  }

  private void popFont(Object $1, Object $2, Number val)
  {
    setFont(Font.font(this.font, val.doubleValue()));
  }

  protected void popText(Object $1, Object $2, FAGlyph val)
  {
    setText(val == null ? "" : val.chr());
  }

  public double getSize() { return size.get(); }
  public DoubleProperty sizeProperty() { return size; }
  public void setSize(final double size) { this.size.set(size); }
}
