package com.unijui.sdui.model.Components;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextUiComponent extends UiComponent {

    private String text;
    private String style;

    public TextUiComponent(String id, String text, String style) {
        super(id,"text");
        this.text = text;
        this.style = style;

    }
}
