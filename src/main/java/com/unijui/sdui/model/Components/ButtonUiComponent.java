package com.unijui.sdui.model.Components;

import com.unijui.sdui.model.action.ButtonActionParameters;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ButtonUiComponent extends UiComponent {

    private String text;
    private String onClickAction;
    private ButtonActionParameters actionParameters;

    public ButtonUiComponent(String id, String text, String onClickAction, String actionParameters) {
        super(id,"button");
        this.text = text;
        this.onClickAction = onClickAction;
        this.actionParameters = new ButtonActionParameters(actionParameters);
    }

}
