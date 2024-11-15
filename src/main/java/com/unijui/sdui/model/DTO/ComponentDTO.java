package com.unijui.sdui.model.DTO;

import com.unijui.sdui.model.Components.UiComponent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComponentDTO {

    private String tipo;
    private Object parametros;


    public ComponentDTO(UiComponent component) {
        this.tipo = component.getTipo();
        this.parametros = component;
    }
}

