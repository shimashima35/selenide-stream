package com.codeborne.selenide.stream.conditions;

import com.codeborne.selenide.impl.Html;
import com.codeborne.selenide.stream.Condition;
import org.openqa.selenium.WebElement;

public class Text extends Condition {
  protected final String text;
  public Text(final String text) {
    super("text");
    this.text = text;
  }

  @Override
  public boolean apply(WebElement element) {
    return Html.text.contains(element.getText(), text.toLowerCase());
  }

  @Override
  public boolean test(WebElement element){return apply(element);}

  @Override
  public String toString() {
    return name + " '" + text + '\'';
  }
}
