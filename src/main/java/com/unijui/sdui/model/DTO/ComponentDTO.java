package com.unijui.sdui.model.DTO;

import com.unijui.sdui.model.Components.UiComponent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComponentDTO {

    private String type;
    private Object params;


    public ComponentDTO(UiComponent component) {
        this.type = component.getType();
        this.params = component;
    }
}

