package com.unijui.sdui.model.Components;


import com.unijui.sdui.model.DTO.ComponentDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListUiComponent extends UiComponent {

    private List<ComponentDTO> listItens = new ArrayList<>();

    public ListUiComponent(String id, List<UiComponent> listItens) {
        super(id,"list");
        for(UiComponent c: listItens){
           addComponent(c);
        }
    }

    public ListUiComponent(String id) {
        super(id,"list");
    }

    public void addComponent(UiComponent component){
        this.listItens.add(new ComponentDTO(component));
    }
}
