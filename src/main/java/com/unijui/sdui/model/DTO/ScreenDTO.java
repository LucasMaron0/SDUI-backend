package com.unijui.sdui.model.DTO;

import com.unijui.sdui.model.Components.UiComponent;
import com.unijui.sdui.utils.ActionConstants;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ScreenDTO implements IResponseComponent {


    private List<ComponentDTO> componentes = new ArrayList<>();

    public void addComponent(UiComponent component){
        this.componentes.add(new ComponentDTO(component));
    }

    @Override
    public Object getParams() {
        return componentes;
    }

    @Override
    public String getAction() {
        return ActionConstants.SHOW_SDUI_SCREEN;
    }
}


