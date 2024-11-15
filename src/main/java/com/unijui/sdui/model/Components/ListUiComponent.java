package com.unijui.sdui.model.Components;


import com.unijui.sdui.model.DTO.ComponentDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListUiComponent extends UiComponent {

    private List<ComponentDTO> itensLista = new ArrayList<>();

    public ListUiComponent(String id, List<UiComponent> itensLista) {
        super(id,"lista");
        for(UiComponent c: itensLista){
           adicionarComponente(c);
        }
    }

    public ListUiComponent(String id) {
        super(id,"lista");
    }

    public void adicionarComponente(UiComponent component){
        this.itensLista.add(new ComponentDTO(component));
    }
}
