package com.unijui.sdui.model.Components;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UiComponent {

    private String id;
    @JsonIgnore
    private String tipo;


    public UiComponent(String id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }
}

