package com.unijui.sdui.model.Components;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UiComponent {

    private String id;
    @JsonIgnore
    private String type;


    public UiComponent(String id, String type){
        this.id = id;
        this.type = type;
    }
}

